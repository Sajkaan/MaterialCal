package com.sajkaan.repository;

import com.sajkaan.model.Part;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


@Repository
public class PartRepositoryImpl implements PartRepository {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Part> findAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<Part> criteriaQuery = criteriaBuilder.createQuery(Part.class);

        criteriaQuery.from(Part.class);

        List<Part> parts = session.createQuery(criteriaQuery).getResultList();

        session.close();

        return parts;
    }

    @Override
    public Part findById(Long id) {
        Session session = sessionFactory.openSession();

        Part part = session.get(Part.class, id);

        session.close();

        return part;
    }

    @Override
    public void save(Part part) {
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.saveOrUpdate(part);

        session.getTransaction().commit();

        session.close();
    }

    @Override
    public void delete(Part part) {
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.delete(part);

        session.getTransaction().commit();

        session.close();
    }
}

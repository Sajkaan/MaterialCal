package com.sajkaan.repository;

import com.sajkaan.model.Trailer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class TrailerRepositoryImpl implements TrailerRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Trailer> findAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<Trailer> criteriaQuery = criteriaBuilder.createQuery(Trailer.class);

        criteriaQuery.from(Trailer.class);

        List<Trailer> parts = session.createQuery(criteriaQuery).getResultList();

        session.close();
    }

    @Override
    public Trailer findById(Long id) {
        return null;
    }

    @Override
    public void save(Trailer trailer) {

    }

    @Override
    public void delete(Trailer trailer) {

    }
}

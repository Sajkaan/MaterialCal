package com.sajkaan.repository;

import com.sajkaan.model.Part;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class PartRepositoryImpl implements PartRepository {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void save(Part part) {
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.saveOrUpdate(part);

        session.getTransaction().commit();

        session.close();
    }
}

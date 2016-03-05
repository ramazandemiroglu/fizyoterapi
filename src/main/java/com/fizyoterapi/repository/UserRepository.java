package com.fizyoterapi.repository;

import com.fizyoterapi.model.User;
import org.hibernate.Session;

public class UserRepository {

  public  void add(User user) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }
}

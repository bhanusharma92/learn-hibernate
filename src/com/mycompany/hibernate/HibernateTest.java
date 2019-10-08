package com.mycompany.hibernate;

import com.mycompany.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class HibernateTest {

    public static void main(String[] args) {
        UserDetails user1 = new UserDetails();
        user1.setUserName("First User");

        UserDetails user2 = new UserDetails();
        user2.setUserName("Second User");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user1);
        session.save(user2);
        session.getTransaction().commit();
        session.close();


        sessionFactory.close();
    }
}

package com.mycompany.hibernate;

import com.mycompany.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class HibernateTest {

    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("First User");
        user.setJoinedDate(new Date());
        user.setAddress("First user's address");
        user.setDescription("Description goes here");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        user = session.get(UserDetails.class, 1);
        System.out.println("UserName retrieved is : "  + user.getUserName());
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}

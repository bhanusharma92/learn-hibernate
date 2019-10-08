package com.mycompany.hibernate;

import com.mycompany.dto.Address;
import com.mycompany.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class HibernateTest {

    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.setUserName("First User");

        Address address = new Address();
        address.setStreet("Street Name");
        address.setCity("City Name");
        address.setState("State Name");
        address.setPin("Pin Name");

        user.setAddress(address);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();


        sessionFactory.close();
    }
}

package com.dmdev;

import com.dmdev.entity.Birthday;
import com.dmdev.entity.PersonalInfo;
import com.dmdev.entity.Role;
import com.dmdev.entity.User;
import com.dmdev.entity.client.Client;
import com.dmdev.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.time.LocalDate;

public class HibernateRunner {

    public static void main(String[] args) throws SQLException {

        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
//            session.beginTransaction();
//
//            User user = User.builder()
//                    .username("ivan1@gmail.com")
//                    .personalInfo(PersonalInfo.builder()
//                            .lastname("Petrov")
//                            .firstname("Petr")
//                            .birthDate(new Birthday(LocalDate.of(2000, 1, 19)))
//                            .build())
////                    .birthDate(new Birthday(LocalDate.of(2000, 1, 19)))
//                    .role(Role.ADMIN)
//                    .build();
//
//
//            session.saveOrUpdate(user);

//            session.getTransaction().commit();

            try (Session session1 = sessionFactory.openSession()) {
                session1.beginTransaction();

                Client client = Client.builder()
                        .lastname("test")
                        .firstname("test")
                        .email("test")
                        .birthDate(LocalDate.of(1, 1, 1))
                        .password("test")
                        .telephone("test")
                        .role(Role.ADMIN)
                        .build();

                session1.save(client);

                session1.getTransaction().commit();
            }
        }
    }
}


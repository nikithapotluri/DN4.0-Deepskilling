package com.cognizantjpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cognizantjpa.empjpa.EmployeeJPA;

public class HibernateDataApplication {

    public static void main(String[] args) {

        System.out.println("----------- Using Hibernate (Session API only) -----------");
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        EmployeeJPA emp1 = new EmployeeJPA();
        emp1.setEid(1);
        emp1.setEname("Nikitha");
        emp1.setSalary(10000);
        session.persist(emp1);

        EmployeeJPA emp2 = new EmployeeJPA();
        emp2.setEid(2);
        emp2.setEname("Nisha");
        emp2.setSalary(5000);
        session.persist(emp2);

        tx.commit();

        EmployeeJPA fetchedEmp1 = session.get(EmployeeJPA.class, 1);
        System.out.println("Fetched emp1: " + fetchedEmp1);
        
        EmployeeJPA fetchedEmp2 = session.get(EmployeeJPA.class, 2);
        System.out.println("Fetched emp2: " + fetchedEmp2);

        session.close();
        sessionFactory.close();
    }
}

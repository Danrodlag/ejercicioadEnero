package main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernateMARIADB.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();

    }
}
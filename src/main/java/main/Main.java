package main;

import main.models.Departamento;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Configura y construye la SessionFactory
        Configuration config = new Configuration();
        config.configure("hibernateMARIADB.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();

        // Abre una nueva sesión
        Session session = sessionFactory.openSession();

        // Inicia una transacción
        Transaction transaction = session.beginTransaction();

        // Crea una consulta para recuperar todos los Departamentos
        Query<Departamento> query = session.createQuery("from Departamento", Departamento.class);

        // Ejecuta la consulta y obtiene los resultados
        List<Departamento> departamentos = query.list();

        // Imprime los resultados
        for (Departamento departamento : departamentos) {
            System.out.println("ID: " + departamento.getIdDepartamento() + ", Nombre: " + departamento.getNombreDepartamento());
        }

        // Cierra la transacción
        transaction.commit();

        // Cierra la sesión
        session.close();
    }
}
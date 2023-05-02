package org.example.config;

import jakarta.persistence.EntityManager;
import org.example.employees.Category;
import org.example.employees.Company;
import org.example.employees.Product;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import java.net.URL;
import java.sql.Driver;

import static org.hibernate.cfg.AvailableSettings.*;
import static org.postgresql.PGProperty.PASSWORD;

public class HibernateConfig {
    public static EntityManager getEntity(){
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "1234");
        configuration.setProperty(HBM2DDL_AUTO, "update");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        configuration.setProperty(SHOW_SQL, "true");
        System.out.println("Create");
        configuration.addAnnotatedClass(Product.class);
        configuration.addAnnotatedClass(Company.class);
        configuration.addAnnotatedClass(Category.class);

        return configuration.buildSessionFactory().createEntityManager();







    }

}

package org.example.repository.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.example.config.HibernateConfig;
import org.example.employees.Product;
import org.example.repository.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {
    private static final EntityManager entityManager = HibernateConfig.getEntity();
    @Override
    public void saveProduct(Product product) {
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Product saved");
    }

    @Override
    public void findAllProductsByCompanyId(Long id) {
        entityManager.getTransaction().begin();
        Product product = entityManager.find(Product.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(product);

    }

    @Override
    public void deleteById(Long id) {
        entityManager.getTransaction().begin();
        Product product = entityManager.find(Product.class, id);
        entityManager.remove(product);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Deleted");
    }
}

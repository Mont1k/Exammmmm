package org.example.repository.Impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.employees.Category;
import org.example.employees.Product;
import org.example.repository.CategoryRepository;

import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    private final EntityManager entityManager = HibernateConfig.getEntity();
    @Override
    public void saveCategory(Category category) {
        entityManager.getTransaction().begin();
        entityManager.persist(category);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Category Saved");

    }

    @Override
    public void getAllProductGroupByCategoryName(Category category) {
        entityManager.getTransaction().begin();
        List<Product> products = entityManager.createQuery("select p from Product p ", Product.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(products);
        System.out.println(products);
    }
}

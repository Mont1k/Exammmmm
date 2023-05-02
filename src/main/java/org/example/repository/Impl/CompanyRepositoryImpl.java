package org.example.repository.Impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.employees.Company;
import org.example.repository.CompanyRepository;

public class CompanyRepositoryImpl  implements CompanyRepository {
   private final EntityManager entityManager = HibernateConfig.getEntity();

    @Override
    public String saveCompany(Company company) {
        entityManager.getTransaction().begin();
        entityManager.persist(company);
        entityManager.getTransaction().commit();
        entityManager.close();
        return company.getName() +"saved";
    }

    @Override
    public String deleteById(Long id) {
        entityManager.getTransaction().begin();

        Company company = entityManager.find(Company.class, id);
        if (company == null) {
            System.out.println("Company with id " + id + " not found");
        } else {
            entityManager.remove(company);
            entityManager.getTransaction().commit();
            System.out.println("Company with id " + id + " is deleted");
        }
        entityManager.close();

        return null;
    }

    @Override
    public void updateCompany(Long id, Company company) {
        entityManager.getTransaction().begin();
        Company company1 = entityManager.find(Company.class, id);
        company1.setName(company.getName());
        company1.setCountry(company.getCountry());
        entityManager.merge(company1);
        System.out.println("Company is updated...");
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}

package org.example.service;

import org.example.employees.Company;

public interface CompanyService {
    void saveCompany(Company company);
    void deleteById(Long id);

    void updateCompany(Long id, Company company);
}

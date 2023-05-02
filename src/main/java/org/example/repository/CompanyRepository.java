package org.example.repository;

import org.example.employees.Company;

public interface CompanyRepository {
    String saveCompany(Company company);
    String deleteById( Long id);
    void updateCompany(Long id,Company company);

}

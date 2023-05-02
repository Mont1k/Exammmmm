package org.example.service.impl;

import org.example.employees.Company;
import org.example.repository.CompanyRepository;
import org.example.repository.Impl.CompanyRepositoryImpl;
import org.example.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
    CompanyRepository companyRepository = new CompanyRepositoryImpl();
    @Override
    public void saveCompany(Company company) {
        companyRepository.saveCompany(company);
    }

    @Override
    public void deleteById(Long id) {
        companyRepository.deleteById(id);
    }

    @Override
    public void updateCompany(Long id,Company company) {
        companyRepository.updateCompany(id, company);
    }

}

package org.example.repository;

import org.example.employees.Product;

public interface ProductRepository {
    void saveProduct(Product product);
    void findAllProductsByCompanyId(Long id);
    void deleteById(Long id);
}

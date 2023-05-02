package org.example.service;

import org.example.employees.Product;

public interface ProductService {
    void saveProduct(Product product);

    void findAllProductsByCompany(Long id);

    void deleteById(Long id);
}

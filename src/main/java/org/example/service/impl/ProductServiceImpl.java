package org.example.service.impl;

import org.example.employees.Product;
import org.example.repository.Impl.ProductRepositoryImpl;
import org.example.repository.ProductRepository;
import org.example.service.ProductService;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository = new ProductRepositoryImpl();
    @Override
    public void saveProduct(Product product) {
        productRepository.saveProduct(product);
    }

    @Override
    public void findAllProductsByCompany(Long id) {
        productRepository.findAllProductsByCompanyId(id);
    }


    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}

package org.example.service.impl;

import org.example.employees.Category;
import org.example.repository.CategoryRepository;
import org.example.repository.Impl.CategoryRepositoryImpl;
import org.example.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository = new CategoryRepositoryImpl();
    @Override
    public void saveCategory(Category category) {
        categoryRepository.saveCategory(category);
    }

    @Override
    public void getAllProductGroupByCategoryName(Category category) {
        categoryRepository.getAllProductGroupByCategoryName(category);
    }
}

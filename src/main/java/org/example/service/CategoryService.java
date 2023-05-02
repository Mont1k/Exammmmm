package org.example.service;

import org.example.employees.Category;

public interface CategoryService {
    void saveCategory(Category category);
    void getAllProductGroupByCategoryName(Category category);
}

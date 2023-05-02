package org.example.repository;

import org.example.employees.Category;

public interface CategoryRepository {
    void saveCategory(Category category);
    void getAllProductGroupByCategoryName(Category category);

}

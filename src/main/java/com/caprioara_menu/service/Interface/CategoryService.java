package com.caprioara_menu.service.Interface;

import com.caprioara_menu.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(Category category);

    Category getCategoryById(Long id);

    List<Category> getAllCategories();

    void deleteCategory(Long id);
}

package com.caprioara_menu.controller.Interface;

import com.caprioara_menu.entity.Category;

import java.util.List;

public interface CategoryController {

    Category createCategory(Category category);

    Category getCategoryById(Long id);

    List<Category> getAllCategories();

    void deleteCategory(Long id);
}

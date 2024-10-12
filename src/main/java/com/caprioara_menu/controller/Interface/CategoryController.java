package com.caprioara_menu.controller.Interface;

import com.caprioara_menu.entity.Category;
import java.util.List;

/**
 * Interface for managing category-related operations in the menu.
 * Provides methods for creating, retrieving, and deleting categories.
 */
public interface CategoryController {

    /**
     * Creates a new category.
     *
     * @param category The category entity to be created.
     * @return The created {@link Category} entity.
     */
    Category createCategory(Category category);

    /**
     * Retrieves a category by its ID.
     *
     * @param id The ID of the category to retrieve.
     * @return The {@link Category} entity with the specified ID.
     */
    Category getCategoryById(Long id);

    /**
     * Retrieves all categories.
     *
     * @return A list of all {@link Category} entities.
     */
    List<Category> getAllCategories();

    /**
     * Deletes a category by its ID.
     *
     * @param id The ID of the category to delete.
     */
    void deleteCategory(Long id);
}
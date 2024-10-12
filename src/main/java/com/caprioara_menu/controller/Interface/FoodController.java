package com.caprioara_menu.controller.Interface;

import com.caprioara_menu.entity.Food;
import java.util.List;

/**
 * Interface for managing food-related operations in the menu.
 * Provides methods for creating, retrieving, and deleting food items.
 */
public interface FoodController {

    /**
     * Creates a new food item.
     *
     * @param food The food entity to be created.
     * @return The created {@link Food} entity.
     */
    Food createFood(Food food);

    /**
     * Retrieves a food item by its ID.
     *
     * @param id The ID of the food to retrieve.
     * @return The {@link Food} entity with the specified ID.
     */
    Food getFoodById(Long id);

    /**
     * Retrieves all food items.
     *
     * @return A list of all {@link Food} entities.
     */
    List<Food> getAllFoods();

    /**
     * Retrieves food items by their category ID.
     *
     * @param categoryId The ID of the category to filter foods by.
     * @return A list of {@link Food} entities that belong to the specified category.
     */
    List<Food> getFoodsByCategory(Long categoryId);

    /**
     * Deletes a food item by its ID.
     *
     * @param id The ID of the food to delete.
     */
    void deleteFood(Long id);
}
package com.caprioara_menu.repository.Interface;

import com.caprioara_menu.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Repository interface for accessing and managing {@link Food} entities in the database.
 * Extends {@link JpaRepository} to provide CRUD operations and custom queries.
 */
public interface FoodRepository extends JpaRepository<Food, Long> {

    /**
     * Saves a {@link Food} entity to the database.
     *
     * @param food The food entity to save.
     * @return The saved {@link Food} entity.
     */
    Food save(Food food);

    /**
     * Retrieves a food item by its ID.
     *
     * @param id The ID of the food to retrieve.
     * @return The {@link Food} entity with the specified ID.
     */
    Food findFoodsById(Long id);

    /**
     * Retrieves all food items from the database.
     *
     * @return A list of all {@link Food} entities.
     */
    List<Food> findAll();

    /**
     * Retrieves all food items that belong to a specific category.
     *
     * @param categoryId The ID of the category to filter foods by.
     * @return A list of {@link Food} entities that belong to the specified category.
     */
    @Query("SELECT f FROM Food f WHERE f.category.id = :categoryId")
    List<Food> findByCategory(@Param("categoryId") Long categoryId);

    /**
     * Deletes a food item by its ID.
     *
     * @param id The ID of the food item to delete.
     */
    void deleteById(Long id);
}
package com.caprioara_menu.repository.Interface;

import com.caprioara_menu.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository interface for accessing and managing {@link Category} entities in the database.
 * Extends {@link JpaRepository} to provide CRUD operations for categories.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    /**
     * Saves a {@link Category} entity to the database.
     *
     * @param category The category entity to save.
     * @return The saved {@link Category} entity.
     */
    Category save(Category category);

    /**
     * Retrieves a category by its ID.
     *
     * @param id The ID of the category to retrieve.
     * @return The {@link Category} entity with the specified ID.
     */
    Category findCategoriesById(Long id);

    /**
     * Retrieves all categories from the database.
     *
     * @return A list of all {@link Category} entities.
     */
    List<Category> findAll();

    /**
     * Deletes a category by its ID.
     *
     * @param id The ID of the category to delete.
     */
    void deleteById(Long id);
}
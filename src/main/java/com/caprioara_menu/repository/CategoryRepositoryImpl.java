package com.caprioara_menu.repository;

import com.caprioara_menu.entity.Category;
import com.caprioara_menu.repository.Interface.CategoryRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public abstract class CategoryRepositoryImpl implements CategoryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // Save a category entity
    @Override
    public Category save(Category category) {
        entityManager.persist(category);
        return category;
    }

    // Find a category by its ID
    @Override
    public Optional<Category> findById(Long id) {
        Category category = entityManager.find(Category.class, id);
        return Optional.ofNullable(category);
    }

    // Find all categories
    @Override
    public List<Category> findAll() {
        return entityManager.createQuery("SELECT c FROM Category c", Category.class).getResultList();
    }

    // Delete a category by its ID
    @Override
    public void deleteById(Long id) {
        Category category = findById(id).orElse(null);
        if (category != null) {
            entityManager.remove(category);
        }
    }
}

package com.caprioara_menu.repository;

import com.caprioara_menu.entity.Food;
import com.caprioara_menu.repository.Interface.FoodRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public abstract class FoodRepositoryImpl implements FoodRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // Save a food entity
    @Override
    public Food save(Food food) {
        entityManager.persist(food);
        return food;
    }

    // Find a food by its ID
    @Override
    public Optional<Food> findById(Long id) {
        Food food = entityManager.find(Food.class, id);
        return Optional.ofNullable(food);
    }

    // Find all foods
    @Override
    public List<Food> findAll() {
        return entityManager.createQuery("SELECT f FROM Food f", Food.class).getResultList();
    }

    // Find foods by category ID
    public List<Food> findByCategory(Long categoryId) {
        return entityManager.createQuery("SELECT f FROM Food f WHERE f.category.id = :categoryId", Food.class)
                .setParameter("categoryId", categoryId)
                .getResultList();
    }

    // Delete a food entity by its ID
    @Override
    public void deleteById(Long id) {
        Food food = entityManager.find(Food.class, id);
        if (food != null) {
            entityManager.remove(food);
        }
    }

    // Other CRUD methods are implemented here as needed.
}
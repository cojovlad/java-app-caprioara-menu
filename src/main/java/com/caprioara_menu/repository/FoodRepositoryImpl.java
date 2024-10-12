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

    @Override
    public Food save(Food food) {
        entityManager.persist(food);
        return food;
    }

    @Override
    public Optional<Food> findById(Long id) {
        Food food = entityManager.find(Food.class, id);
        return Optional.ofNullable(food);
    }

    @Override
    public List<Food> findAll() {
        return entityManager.createQuery("SELECT f FROM Food f", Food.class).getResultList();
    }

    public List<Food> findByCategory(Long categoryId) {
        return entityManager.createQuery("SELECT f FROM Food f WHERE f.category.id = :categoryId", Food.class)
                .setParameter("categoryId", categoryId)
                .getResultList();
    }

    @Override
    public void deleteById(Long id) {
        Food food = entityManager.find(Food.class, id);
        if (food != null) {
            entityManager.remove(food);
        }
    }
}
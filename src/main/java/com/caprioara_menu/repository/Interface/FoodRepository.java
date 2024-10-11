package com.caprioara_menu.repository.Interface;

import com.caprioara_menu.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food,Long> {

    Food save(Food food);

    Food findFoodsById(Long id);

    List<Food> findAll();

    @Query("SELECT f FROM Food f WHERE f.category.id = :categoryId")
    List<Food> findByCategory(@Param("categoryId") Long categoryId);

    void deleteById(Long id);
}

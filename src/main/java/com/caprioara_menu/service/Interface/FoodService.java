package com.caprioara_menu.service.Interface;

import com.caprioara_menu.entity.Food;

import java.util.List;

public interface FoodService {

    Food createFood(Food food);

    Food getFoodById(Long id);

    List<Food> getAllFoods();

    List<Food> getFoodsByCategory(Long categoryId);

    void deleteFood(Long id);
}

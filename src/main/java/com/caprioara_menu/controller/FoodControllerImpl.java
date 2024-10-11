package com.caprioara_menu.controller;

import com.caprioara_menu.controller.Interface.FoodController;
import com.caprioara_menu.entity.Food;
import com.caprioara_menu.service.Interface.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodControllerImpl implements FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping
    public Food createFood(@RequestBody Food food) {
        return foodService.createFood(food);
    }

    @GetMapping("/{id}")
    public Food getFoodById(@PathVariable Long id) {
        return foodService.getFoodById(id);
    }

    @GetMapping
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    @GetMapping("/category/{categoryId}")
    public List<Food> getFoodsByCategory(@PathVariable Long categoryId) {
        return foodService.getFoodsByCategory(categoryId);
    }

    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
    }
}
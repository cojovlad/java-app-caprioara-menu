package com.caprioara_menu.service;

import com.caprioara_menu.entity.Food;
import com.caprioara_menu.repository.FoodRepositoryImpl;
import com.caprioara_menu.repository.Interface.FoodRepository;
import com.caprioara_menu.service.Interface.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public Food createFood(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food getFoodById(Long id) {
        return foodRepository.findFoodsById(id);
    }

    @Override
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    @Override
    public List<Food> getFoodsByCategory(Long categoryId) {
        return foodRepository.findByCategory(categoryId);
    }

    @Override
    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }
}

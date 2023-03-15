package com.geekster.fooddeliveryapp.service;

import com.geekster.fooddeliveryapp.dao.FoodItemsRepository;
import com.geekster.fooddeliveryapp.model.FoodItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodItemsService {

    private static final List<FoodItems> foods = new ArrayList<>();

    @Autowired
    private FoodItemsRepository foodItemsRepository;

    public List<FoodItems> getAllFoods() {
        return foodItemsRepository.findAll();
    }

    public FoodItems getFoodById(int id) {
        return foodItemsRepository.findById(id).get();
    }

    public void addFood(FoodItems foodItems) {
        foodItemsRepository.save(foodItems);
    }

    public FoodItems updateFood(int id, FoodItems newfoodItems) {
        FoodItems foodItems  = foodItemsRepository.findById(id).get(); // step1

        foodItems.setId(newfoodItems.getId()); // step2
        foodItems.setName(newfoodItems.getName());
        foodItems.setDescription(newfoodItems.getDescription());
        foodItems.setPrice(newfoodItems.getPrice());

        return foodItemsRepository.save(foodItems);
    }

    public void deleteFood(int id) {
        foodItemsRepository.deleteById(id);
    }
}

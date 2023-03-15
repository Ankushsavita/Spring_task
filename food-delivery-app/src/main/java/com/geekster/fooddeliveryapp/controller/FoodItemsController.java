package com.geekster.fooddeliveryapp.controller;

import com.geekster.fooddeliveryapp.model.FoodItems;
import com.geekster.fooddeliveryapp.service.FoodItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodItemsController {

        @Autowired
        private FoodItemsService foodItemsService;

        @GetMapping("find-all")
        public List<FoodItems> getAllFoods() {
            return foodItemsService.getAllFoods();
        }

        @GetMapping("find-food/id/{id}")
        public FoodItems getFoodById(@PathVariable int id) {
            return foodItemsService.getFoodById(id);
        }

        @PostMapping("add-food")
        public void addFood(@RequestBody FoodItems foodItems) {
            foodItemsService.addFood(foodItems);
        }

        @PutMapping("update-food/id/{id}")
        public FoodItems updateFood(@PathVariable int id, @RequestBody FoodItems foodItems) {
            return foodItemsService.updateFood(id, foodItems);
        }

        @DeleteMapping("delete-food/id/{id}")
        public void deleteFood(@PathVariable int id) {
            foodItemsService.deleteFood(id);
        }
    }



package com.geekster.fooddeliveryapp.dao;

import com.geekster.fooddeliveryapp.model.FoodItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemsRepository extends JpaRepository<FoodItems, Integer> {
}

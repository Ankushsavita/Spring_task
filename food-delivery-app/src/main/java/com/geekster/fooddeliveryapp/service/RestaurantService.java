package com.geekster.fooddeliveryapp.service;

import com.geekster.fooddeliveryapp.dao.RestaurantRepository;
import com.geekster.fooddeliveryapp.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    private static List<Restaurant> restaurants = new ArrayList<>();

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Restaurant getRestaurantById(int id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    public Restaurant getRestaurantByName(String name) {
        return restaurantRepository.findByName(name);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant updateRestaurant(int id, Restaurant newrestaurant) {
        Restaurant restaurant = restaurantRepository.findById(id).get();

            restaurant.setId(newrestaurant.getId());
            restaurant.setName(newrestaurant.getName());
            restaurant.setAddress(newrestaurant.getAddress());
            return restaurantRepository.save(restaurant);

    }

    public void deleteRestaurant(int id) {
        restaurantRepository.deleteById(id);
    }
}


package com.geekster.fooddeliveryapp.service;

import com.geekster.fooddeliveryapp.dao.OrderRepository;
import com.geekster.fooddeliveryapp.model.FoodItems;
import com.geekster.fooddeliveryapp.model.Order;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private static final List<Order> orders = new ArrayList<>();

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private FoodItemsService foodItemsService;

    public Order addOrder(Order order) {
        User user = (User) userService.getUserById(order.getUser().getId());
        if (user == null) {
            throw new NotFoundException("User not found.");
        }
        FoodItems foodItems = foodItemsService.getFoodById(order.getFoodItems().getId());
        if (foodItems == null) {
            throw new NotFoundException("Food not found.");
        }
        return orderRepository.save(order);
    }

    public Order getOrderById(int id) {
        return orderRepository.findById(id).get();
    }

    public List<Order> getOrdersByUser(int id) {
        User user = (User) userService.getUserById(id);
        if (user == null) {
            throw new NotFoundException("User not found.");
        }
        return orderRepository.findByUser(user);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order updateOrder(int id, Order neworder) {

        Order order = orderRepository.findById(id).get();

            order.setId(neworder.getId());
            order.setUser(neworder.getUser());
            order.setFoodItems(neworder.getFoodItems());
            order.setQuantity(neworder.getQuantity());

            return orderRepository.save(order);

    }

    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }
}


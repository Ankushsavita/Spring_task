package com.geekster.fooddeliveryapp.controller;

import com.geekster.fooddeliveryapp.model.Order;
import com.geekster.fooddeliveryapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private static List<Order> orders = new ArrayList<>();

    @Autowired
    private OrderService orderService;

    @PostMapping("add-order")
    public Order addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @GetMapping("find-order/id/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("find/user/{userId}")
    public List<Order> getOrdersByUser(@PathVariable int id) {
        return orderService.getOrdersByUser(id);
    }

    @GetMapping("find-all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PutMapping("update-order/id/{id}")
    public Order updateOrder(@PathVariable int id, @RequestBody Order order) {
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("delete-order/id/{id}")
    public void deleteOrder(@PathVariable int id) {
        orderService.deleteOrder(id);
    }
}


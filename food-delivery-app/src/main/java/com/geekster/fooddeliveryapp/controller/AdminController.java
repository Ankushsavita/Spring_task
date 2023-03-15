package com.geekster.fooddeliveryapp.controller;

import com.geekster.fooddeliveryapp.dao.AdminRepository;
import com.geekster.fooddeliveryapp.model.Admin;
import com.geekster.fooddeliveryapp.model.FoodItems;
import com.geekster.fooddeliveryapp.service.AdminService;
import com.geekster.fooddeliveryapp.service.FoodItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("add-admin")
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminService.addAdmin(admin);
    }

    @GetMapping("find-admin/id/{id}")
    public Admin getAdminById(@PathVariable int id) {
        return adminService.getAdminById(id);
    }

    @GetMapping("find/adminName/{adminName}")
    public Admin getAdminByAdminName(@PathVariable String adminName) {
        return adminService.getAdminByAdminName(adminName);
    }

    @GetMapping("find-all")
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @PutMapping("update-admin/id/{id}")
    public Admin updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
        return adminService.updateAdmin(id, admin);
    }

    @DeleteMapping("delete-admin/id/{id}")
    public void deleteAdmin(@PathVariable int id) {
        adminService.deleteAdmin(id);
    }
}


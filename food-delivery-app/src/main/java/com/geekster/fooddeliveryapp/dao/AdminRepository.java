package com.geekster.fooddeliveryapp.dao;

import com.geekster.fooddeliveryapp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByAdminName(String adminName);
}

package com.geekster.fooddeliveryapp.service;

import com.geekster.fooddeliveryapp.dao.AdminRepository;
import com.geekster.fooddeliveryapp.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin getAdminById(int id) {
        return adminRepository.findById(id).get();
    }

    public Admin getAdminByAdminName(String adminName) {
        return adminRepository.findByAdminName(adminName);
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin updateAdmin(int id, Admin newadmin) {

        Admin admin = adminRepository.findById(id).get();

            admin.setId(newadmin.getId());
            admin.setAdminName(newadmin.getAdminName());
            admin.setEmail(newadmin.getEmail());
            admin.setPassword(newadmin.getPassword());
            return adminRepository.save(admin);

    }

    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}


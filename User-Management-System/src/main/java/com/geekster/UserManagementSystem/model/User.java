package com.geekster.UserManagementSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TBL_USER")
public class User {

    @Id  // primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id Auto increment
    @Column(name="user_id")
    private int id;

    @Column(name="user_name")
    private String userName;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="gender")
    private String gender;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="address")
    private String Address;
}

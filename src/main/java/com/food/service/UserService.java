/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.service;

import com.food.pojo.User;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;
/**
 *
 * @author Admin
 */
public interface UserService extends UserDetailsService {
        boolean addUser(User user);
    List<User> getUsers(String username);

}

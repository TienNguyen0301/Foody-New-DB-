/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.service;

import com.food.pojo.Usertype;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface UserTypeService {
    List<Usertype> getUserTypes();
    Usertype getUsertypeById(int id);
}

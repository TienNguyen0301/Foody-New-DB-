/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.repository;

import com.food.pojo.Status;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface StatusRepository{
      List<Status> getUserStatus();
    Status getUserStatusById(int id);
}

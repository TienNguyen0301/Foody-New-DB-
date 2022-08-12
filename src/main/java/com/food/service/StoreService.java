/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.service;

import com.food.pojo.Store;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface StoreService {
    List<Store> getStores(Map<String, String> params);
     Store getStoreById(int id);
}

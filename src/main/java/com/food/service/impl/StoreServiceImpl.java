/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.service.impl;

import com.food.pojo.Store;
import com.food.repository.StoreRepository;
import com.food.service.StoreService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class StoreServiceImpl implements StoreService{
    @Autowired
    private StoreRepository storeRepository;
    
    @Override
    public List<Store> getStores(Map<String, String> params) {
        return this.storeRepository.getStores(params);
    }

    @Override
    public Store getStoreById(int id) {
        return this.storeRepository.getStoreById(id);
    
    }
    
}

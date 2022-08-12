/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.service.impl;

import com.food.pojo.Usertype;
import com.food.service.UserTypeService;
import com.food.repository.UserTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public List<Usertype> getUserTypes() {
        return this.userTypeRepository.getUserTypes();
    }

    @Override
    public Usertype getUsertypeById(int id) {
        return this.userTypeRepository.getUsertypeById(id);
    }

}

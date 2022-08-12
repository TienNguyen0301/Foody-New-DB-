/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.service.impl;

import com.food.pojo.Status;
import com.food.repository.StatusRepository;
import com.food.service.StatusService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Admin
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public Status getUserStatusById(int i) {
        return this.statusRepository.getUserStatusById(i);
    }

    @Override
    public List<Status> getUserStatus() {
        return this.statusRepository.getUserStatus();
    }

}

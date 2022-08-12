/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.controllers;

import com.food.pojo.User;
import com.food.pojo.Status;
import com.food.service.StatusService;
import com.food.service.UserService;
import java.sql.SQLException;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Admin
 */
@Controller
@ControllerAdvice
public class UserController {
    @Autowired
    private UserService userDetailsService;
    
    @Autowired
    private StatusService statusService;
    
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/register") 
    public String registerView(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
    
    @PostMapping("/register")
    public String register(Model model ,@ModelAttribute(value = "user") User user){
        String errMsg = "";
         System.out.println("----------------------------------");
        System.out.println(user.getIdUsertype().getId());
         System.out.println("----------------------------------");
         
        System.out.println(statusService.getUserStatusById(1).getName());
        System.out.println(statusService.getUserStatusById(1).getId());

        

                  

// Kiểm tra nếu usertype = 1 => set idstatus = 1. Ngược lại nếu usertype = 2 => set idusertype =2 
       if (user.getIdUsertype().getId() == 2) {
           System.out.println("-----------------------------------");
           Status no_active = statusService.getUserStatusById(2);
           user.setIdStatus(no_active);
        }
       else
       {
           Status active = statusService.getUserStatusById(1);
           System.out.println("--------------------------------------------");
           user.setIdStatus(active);
       }
        

                    
        if (user.getPassword().equals(user.getConfirmPassword())){
            System.out.println("KIEM TRA PASS THANH CONG");
            if (this.userDetailsService.addUser(user) == true)
                return "redirect:/login";
            else
                errMsg = "Da co loi xay ra!";
        }
        else
            errMsg = "Mat khau khong khop!";
        
        model.addAttribute("errMsg", errMsg);
        
        return "redirect:/";
    }
}

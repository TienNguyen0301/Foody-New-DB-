/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.controllers;

import com.food.pojo.Food;
import com.food.service.FoodService;
import com.food.service.StatusService;
import com.food.service.StoreService;
import com.food.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Admin
 */
@Controller
@ControllerAdvice
public class HomeController {
//    @Autowired
//    private CategoryService categoryService;

    @Autowired
    private FoodService foodService;

    @Autowired
    private StoreService storeService;

    @Autowired
    private UserTypeService userTypeService;

    @Autowired
    private Environment env;
    
//    @Autowired
//    private StatusService statusService;

    @ModelAttribute
    public void commonAttrs(Model model, HttpSession session) {
        model.addAttribute("usertype", this.userTypeService.getUserTypes());
//        model.addAttribute("userstatus", this.statusService.getUserStatus());
    }

//    @RequestMapping("/")
//    public String index(Model model){
//         model.addAttribute("foods", this.foodService.getFoods(""));
//        
//        return "index";
//    }
    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {

        int page = Integer.parseInt(params.getOrDefault("page", "1"));
        model.addAttribute("foods", this.foodService.getFoods(params, page));
        model.addAttribute("pageSize", Integer.parseInt(env.getProperty("page.size")));

        return "index";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.formatter;

import com.food.pojo.Usertype;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Admin
 */
public class UserTypeFormatter implements Formatter<Usertype>{

    @Override
    public String print(Usertype object, Locale locale) {
        return String.valueOf(object.getId());
    
    }

    @Override
    public Usertype parse(String userTypeId, Locale locale) throws ParseException {
       Usertype u = new Usertype();
       u.setId(Integer.parseInt(userTypeId));
       
       return u;
       
    }
    
}

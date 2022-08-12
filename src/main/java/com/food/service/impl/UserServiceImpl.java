/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.service.impl;


import com.food.pojo.User;
import com.food.pojo.Usertype;
import com.food.repository.UserRepository;
import com.food.repository.UserTypeRepository;
import com.food.service.UserService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
/**
 *
 * @author Admin
 */
@Service("userDetailsService")
public class UserServiceImpl implements UserService{
        @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    
    @Override
    public boolean addUser(User user) {
         String pass = user.getPassword();
        user.setPassword(this.passwordEncoder.encode(pass));
//            Usertype User;
        
//        user.setIdUsertype(2);
//        user.setUserRole(User.STORE); 

        
       return this.userRepository.addUser(user);
    }

    @Override
    public List<User> getUsers(String username) {
      return this.userRepository.getUsers(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> users = this.getUsers(username);
       if (users.isEmpty())
           throw new UsernameNotFoundException("User does not exist!!!");
       User user = users.get(0);
        Set<GrantedAuthority> auth = new HashSet<>();
//        auth.add(new SimpleGrantedAuthority(user.getUserRole()));

        return new org.springframework.security.core
                .userdetails.User(user.getUsername(), user.getPassword(), auth); 
    }

    
}

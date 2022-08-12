/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.repository.impl;

import com.food.pojo.Food;
import com.food.pojo.Store;
import com.food.repository.StoreRepository;
import java.awt.Stroke;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Repository
@PropertySource("classpath:messages.properties")
@Transactional
public class StoreRepositoryImpl implements StoreRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private Environment env;

    @Override
    public List<Store> getStores(Map<String, String> params) {
         Session session = this.sessionFactory.getObject().getCurrentSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Store> query = builder.createQuery(Store.class);
        Root root = query.from(Store.class);
        query = query.select(root);
    
        Query q = session.createQuery(query);
        
         return q.getResultList();
    }

    @Override
    public Store getStoreById(int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        
        return session.get(Store.class, id);
    }
    
}

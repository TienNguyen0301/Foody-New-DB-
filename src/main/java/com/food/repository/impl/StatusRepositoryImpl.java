/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.repository.impl;

import com.food.pojo.Status;
import com.food.repository.StatusRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 *
 * @author Admin
 */
@Repository
@Transactional
public class StatusRepositoryImpl implements StatusRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public Status getUserStatusById(int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();

        return session.get(Status.class, id);
    }

    @Override
    @Transactional
    public List<Status> getUserStatus() {
         Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("From Status");
        return q.getResultList();
    }

}

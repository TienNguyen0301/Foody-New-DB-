/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.food.pojo.User;
import com.food.pojo.Usertype;
import com.food.repository.UserTypeRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import static org.eclipse.persistence.expressions.ExpressionOperator.trim;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Repository
@Transactional
public class UserTypeRepositoryImpl implements UserTypeRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<Usertype> getUserTypes() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("From Usertype");
        return q.getResultList();
    }

    @Override
    public Usertype getUsertypeById(int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        
        return session.get(Usertype.class, id);
    }

}

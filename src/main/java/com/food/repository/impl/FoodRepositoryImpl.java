/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.repository.impl;

import com.food.pojo.Food;
import com.food.repository.FoodRepository;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import javax.persistence.Query;
import javax.persistence.criteria.Predicate;
import java.util.Map;
import java.util.ArrayList;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.PropertySource;
/**
 *
 * @author Admin
 */
@Repository
@PropertySource("classpath:messages.properties")
@Transactional
public class FoodRepositoryImpl implements FoodRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private Environment env;

    @Override
    public List<Food> getFoods(Map<String, String> params, int page) {
         Session session = this.sessionFactory.getObject().getCurrentSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Food> query = builder.createQuery(Food.class);
        Root root = query.from(Food.class);
        query = query.select(root);
        
         if (params != null) {
            List<Predicate> predicates = new ArrayList<>();
            String kw = params.get("kw");
            if (kw != null && !kw.isEmpty()) {
                Predicate p = builder.like(root.get("name").as(String.class),
                        String.format("%%%s%%", kw));
                predicates.add(p);
            }

            String fp = params.get("fromPrice");
            if (fp != null) {
                Predicate p = builder.greaterThanOrEqualTo(root.get("price").as(Long.class),
                        Long.parseLong(fp));
                predicates.add(p);
            }

            String tp = params.get("toPrice");
            if (tp != null) {
                Predicate p = builder.lessThanOrEqualTo(root.get("price").as(Long.class),
                        Long.parseLong(tp));
                predicates.add(p);
            }

            String cateId = params.get("cateId");
            if (cateId != null) {
                Predicate p = builder.equal(root.get("categoryId"), Integer.parseInt(cateId));
                predicates.add(p);
            }

            query.where(predicates.toArray(new Predicate[]{}));

        }

        query.orderBy(builder.desc(root.get("id")), builder.desc(root.get("name")));

        Query q = session.createQuery(query);
        
//        if (!kw.isEmpty() && kw != null){
//            Predicate p = builder.like(root.get("name").as(String.class),
//                    String.format("%%%s%%", kw));
//            query = query.where(p);
//        }
//        
//        Query q = session.createQuery(query);
        
//      START PAGINATION
     if (page > 0) {
            int size = Integer.parseInt(env.getProperty("page.size").toString());
            int start = (page - 1) * size;
            q.setFirstResult(start);
            q.setMaxResults(size);
        }
      
//      END PAGINATION

        return q.getResultList();
    
    }

    @Override
    public int countFood() {
         Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("select Count(*) FROM Food");

        return Integer.parseInt(q.getSingleResult().toString());
    
    }

    @Override
    public Food getFoodById(int id) {
         Session session = this.sessionFactory.getObject().getCurrentSession();
        
        return session.get(Food.class, id);
    }
    
    
   
}

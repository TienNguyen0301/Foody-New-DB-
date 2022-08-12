package com.food.pojo;

import com.food.pojo.Food;
import com.food.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Foodcomment.class)
public class Foodcomment_ { 

    public static volatile SingularAttribute<Foodcomment, User> idUser;
    public static volatile SingularAttribute<Foodcomment, Integer> idFood;
    public static volatile SingularAttribute<Foodcomment, String> content;
    public static volatile SingularAttribute<Foodcomment, Food> food;

}
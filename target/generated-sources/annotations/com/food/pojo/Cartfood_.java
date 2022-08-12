package com.food.pojo;

import com.food.pojo.Cart;
import com.food.pojo.Food;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Cartfood.class)
public class Cartfood_ { 

    public static volatile SingularAttribute<Cartfood, Integer> quantity;
    public static volatile SingularAttribute<Cartfood, Integer> idCart;
    public static volatile SingularAttribute<Cartfood, Food> idFood;
    public static volatile SingularAttribute<Cartfood, Cart> cart;

}
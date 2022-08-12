package com.food.pojo;

import com.food.pojo.Cartfood;
import com.food.pojo.Store;
import com.food.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile SingularAttribute<Cart, User> idUser;
    public static volatile SingularAttribute<Cart, Cartfood> cartfood;
    public static volatile SingularAttribute<Cart, Integer> id;
    public static volatile SingularAttribute<Cart, Store> idStore;

}
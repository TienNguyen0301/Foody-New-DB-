package com.food.pojo;

import com.food.pojo.Cart;
import com.food.pojo.Food;
import com.food.pojo.Menu;
import com.food.pojo.Orderfood;
import com.food.pojo.Storecomment;
import com.food.pojo.Storerate;
import com.food.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Store.class)
public class Store_ { 

    public static volatile SingularAttribute<Store, User> idUser;
    public static volatile CollectionAttribute<Store, Cart> cartCollection;
    public static volatile SingularAttribute<Store, Storecomment> storecomment;
    public static volatile SingularAttribute<Store, String> address;
    public static volatile SingularAttribute<Store, Storerate> storerate;
    public static volatile SingularAttribute<Store, String> name;
    public static volatile SingularAttribute<Store, Integer> id;
    public static volatile SingularAttribute<Store, Integer> shipPrice;
    public static volatile CollectionAttribute<Store, Food> foodCollection;
    public static volatile SingularAttribute<Store, String> imageStore;
    public static volatile CollectionAttribute<Store, Orderfood> orderfoodCollection;
    public static volatile CollectionAttribute<Store, Menu> menuCollection;

}
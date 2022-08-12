package com.food.pojo;

import com.food.pojo.Orderdetail;
import com.food.pojo.Statusorder;
import com.food.pojo.Store;
import com.food.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Orderfood.class)
public class Orderfood_ { 

    public static volatile SingularAttribute<Orderfood, User> idUser;
    public static volatile SingularAttribute<Orderfood, Integer> totalPrice;
    public static volatile SingularAttribute<Orderfood, String> addressBuyer;
    public static volatile SingularAttribute<Orderfood, Integer> id;
    public static volatile SingularAttribute<Orderfood, Statusorder> idStatusorder;
    public static volatile SingularAttribute<Orderfood, Store> idStore;
    public static volatile SingularAttribute<Orderfood, Orderdetail> orderdetail;

}
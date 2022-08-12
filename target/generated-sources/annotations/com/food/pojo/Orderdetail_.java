package com.food.pojo;

import com.food.pojo.Food;
import com.food.pojo.Orderfood;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Orderdetail.class)
public class Orderdetail_ { 

    public static volatile SingularAttribute<Orderdetail, Integer> idOrder;
    public static volatile SingularAttribute<Orderdetail, Integer> quantity;
    public static volatile SingularAttribute<Orderdetail, Food> idFood;
    public static volatile SingularAttribute<Orderdetail, Orderfood> orderfood;

}
package com.food.pojo;

import com.food.pojo.Cartfood;
import com.food.pojo.Categoryfood;
import com.food.pojo.Foodcomment;
import com.food.pojo.Foodrate;
import com.food.pojo.Menufood;
import com.food.pojo.Orderdetail;
import com.food.pojo.Store;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Food.class)
public class Food_ { 

    public static volatile SingularAttribute<Food, Foodrate> foodrate;
    public static volatile SingularAttribute<Food, Integer> price;
    public static volatile SingularAttribute<Food, Categoryfood> idCategoryfood;
    public static volatile CollectionAttribute<Food, Cartfood> cartfoodCollection;
    public static volatile SingularAttribute<Food, Menufood> menufood;
    public static volatile SingularAttribute<Food, String> name;
    public static volatile CollectionAttribute<Food, Orderdetail> orderdetailCollection;
    public static volatile SingularAttribute<Food, Integer> id;
    public static volatile SingularAttribute<Food, String> imageFood;
    public static volatile SingularAttribute<Food, Store> idStore;
    public static volatile SingularAttribute<Food, Foodcomment> foodcomment;

}
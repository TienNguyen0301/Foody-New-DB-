package com.food.pojo;

import com.food.pojo.Food;
import com.food.pojo.Menu;
import com.food.pojo.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Menufood.class)
public class Menufood_ { 

    public static volatile SingularAttribute<Menufood, Status> idStatus;
    public static volatile SingularAttribute<Menufood, Integer> idFood;
    public static volatile SingularAttribute<Menufood, Menu> idMenu;
    public static volatile SingularAttribute<Menufood, Food> food;

}
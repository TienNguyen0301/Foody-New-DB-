package com.food.pojo;

import com.food.pojo.Food;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Categoryfood.class)
public class Categoryfood_ { 

    public static volatile SingularAttribute<Categoryfood, String> name;
    public static volatile SingularAttribute<Categoryfood, Integer> id;
    public static volatile CollectionAttribute<Categoryfood, Food> foodCollection;

}
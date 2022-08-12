package com.food.pojo;

import com.food.pojo.Menu;
import com.food.pojo.Menufood;
import com.food.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Status.class)
public class Status_ { 

    public static volatile CollectionAttribute<Status, Menufood> menufoodCollection;
    public static volatile CollectionAttribute<Status, User> userCollection;
    public static volatile SingularAttribute<Status, String> name;
    public static volatile SingularAttribute<Status, Integer> id;
    public static volatile CollectionAttribute<Status, Menu> menuCollection;

}
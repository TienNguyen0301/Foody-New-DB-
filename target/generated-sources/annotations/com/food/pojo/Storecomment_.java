package com.food.pojo;

import com.food.pojo.Store;
import com.food.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Storecomment.class)
public class Storecomment_ { 

    public static volatile SingularAttribute<Storecomment, User> idUser;
    public static volatile SingularAttribute<Storecomment, Store> store;
    public static volatile SingularAttribute<Storecomment, Integer> idStore;
    public static volatile SingularAttribute<Storecomment, String> content;

}
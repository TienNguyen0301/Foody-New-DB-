package com.food.pojo;

import com.food.pojo.Cart;
import com.food.pojo.Foodcomment;
import com.food.pojo.Foodrate;
import com.food.pojo.Orderfood;
import com.food.pojo.Status;
import com.food.pojo.Store;
import com.food.pojo.Storecomment;
import com.food.pojo.Storerate;
import com.food.pojo.Usertype;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Usertype> idUsertype;
    public static volatile SingularAttribute<User, String> firstname;
    public static volatile CollectionAttribute<User, Store> storeCollection;
    public static volatile CollectionAttribute<User, Storerate> storerateCollection;
    public static volatile CollectionAttribute<User, Storecomment> storecommentCollection;
    public static volatile CollectionAttribute<User, Foodcomment> foodcommentCollection;
    public static volatile SingularAttribute<User, Cart> cart;
    public static volatile SingularAttribute<User, String> lastname;
    public static volatile CollectionAttribute<User, Orderfood> orderfoodCollection;
    public static volatile SingularAttribute<User, Status> idStatus;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, Boolean> isSuperUser;
    public static volatile CollectionAttribute<User, Foodrate> foodrateCollection;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}
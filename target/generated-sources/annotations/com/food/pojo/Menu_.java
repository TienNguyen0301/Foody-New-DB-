package com.food.pojo;

import com.food.pojo.Menufood;
import com.food.pojo.Status;
import com.food.pojo.Store;
import com.food.pojo.Time;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-12T23:33:11")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, Date> date;
    public static volatile SingularAttribute<Menu, Status> idStatus;
    public static volatile CollectionAttribute<Menu, Menufood> menufoodCollection;
    public static volatile SingularAttribute<Menu, Integer> id;
    public static volatile SingularAttribute<Menu, Store> idStore;
    public static volatile SingularAttribute<Menu, Time> idTime;

}
package com.firstcorp.entity;

import com.firstcorp.entity.Catalog;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-25T09:08:15")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, String> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Catalog> catalogId;
    public static volatile SingularAttribute<Product, String> qty;

}
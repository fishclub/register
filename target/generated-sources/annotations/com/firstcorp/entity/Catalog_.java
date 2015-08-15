package com.firstcorp.entity;

import com.firstcorp.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-25T09:08:15")
@StaticMetamodel(Catalog.class)
public class Catalog_ { 

    public static volatile SingularAttribute<Catalog, Integer> id;
    public static volatile SingularAttribute<Catalog, String> name;
    public static volatile CollectionAttribute<Catalog, Product> productCollection;

}
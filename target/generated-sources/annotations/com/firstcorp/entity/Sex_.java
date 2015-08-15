package com.firstcorp.entity;

import com.firstcorp.entity.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-25T09:08:15")
@StaticMetamodel(Sex.class)
public class Sex_ { 

    public static volatile SingularAttribute<Sex, Integer> id;
    public static volatile CollectionAttribute<Sex, Customer> customerCollection;
    public static volatile SingularAttribute<Sex, String> sexType;

}
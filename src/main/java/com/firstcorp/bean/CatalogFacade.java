/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstcorp.bean;

import com.firstcorp.entity.Catalog;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author first
 */
@Stateless
public class CatalogFacade extends AbstractFacade<Catalog> {
    @PersistenceContext(unitName = "com.firstcorp_register_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogFacade() {
        super(Catalog.class);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.model.NewEntity;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class NewSessionBean {

    public void insert(String loc) {
        EntityManagerFactory em = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager en=em.createEntityManager();
        NewEntity entity=new NewEntity();
        entity.setLocalistation(loc); 
        en.getTransaction().begin();
        en.merge(entity);
        en.getTransaction().commit();
        en.clear();
        en.close();
    }
    public NewEntity find(int id){
        EntityManagerFactory em = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager en=em.createEntityManager();
        NewEntity entity=en.find(NewEntity.class, id);
        return entity;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}

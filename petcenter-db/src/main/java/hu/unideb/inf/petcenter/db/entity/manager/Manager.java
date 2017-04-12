package hu.unideb.inf.petcenter.db.entity.manager;

import javax.persistence.EntityManager;

public class Manager {

    public static EntityManager getManager(){

        EntityManager entityManager = EntityManagerUtil.getEntityManager();

        return entityManager;
    }

}

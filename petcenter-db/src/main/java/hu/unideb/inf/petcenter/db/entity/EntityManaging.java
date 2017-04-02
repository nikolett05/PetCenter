package hu.unideb.inf.petcenter.db.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManaging {
    public EntityManager em;

    private EntityManagerFactory emf;

    public EntityManaging(){
        emf = Persistence.createEntityManagerFactory("hu.unideb.inf.petcenter.mysql");
        em = emf.createEntityManager();

        em.getTransaction().begin();
    }
}

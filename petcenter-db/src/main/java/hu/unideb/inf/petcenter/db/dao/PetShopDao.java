package hu.unideb.inf.petcenter.db.dao;

import hu.unideb.inf.petcenter.db.entity.PetShop;
import hu.unideb.inf.petcenter.db.entity.manager.EntityManagerUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class PetShopDao{

    public List<PetShop> getAll(){

        EntityManager entityManager = null;
        List<PetShop> petshop=null;

        entityManager = EntityManagerUtil.getEntityManager();
        petshop = (List<PetShop>) entityManager.createNamedQuery("PetShop.findAll", PetShop.class).getResultList();
        return petshop;
    }


    public void insert(PetShop petshop){

        EntityManager entityManager = null;

        entityManager= EntityManagerUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(petshop);
        entityManager.getTransaction().commit();
    }

}
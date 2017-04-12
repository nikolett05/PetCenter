package hu.unideb.inf.petcenter.db.dao;

import hu.unideb.inf.petcenter.db.entity.PetShop;
import hu.unideb.inf.petcenter.db.entity.manager.EntityManagerUtil;
import hu.unideb.inf.petcenter.db.entity.manager.Manager;

import javax.persistence.EntityManager;
import java.util.List;

public class PetShopDao{

    public List<PetShop> getAll(){

        List<PetShop> petshop=null;

        petshop = (List<PetShop>)EntityManagerUtil.getEntityManager().createNamedQuery("PetShop.findAll", PetShop.class).getResultList();
        return petshop;
    }


    public void insert(PetShop petshop){
        EntityManagerUtil.getEntityManager().getTransaction().begin();
        EntityManagerUtil.getEntityManager().persist(petshop);
        EntityManagerUtil.getEntityManager().getTransaction().commit();
        EntityManagerUtil.getEntityManager().close();
    }

}
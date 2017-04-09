package hu.unideb.inf.petcenter.db.dao;

import hu.unideb.inf.petcenter.db.entity.PetShop;
import hu.unideb.inf.petcenter.db.entity.manager.EntityManagerUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import java.util.List;

public class PetShopDao{

    public PetShop get(Integer id) {

        EntityManager entityManager = null;
        PetShop petshop=null;

        entityManager = EntityManagerUtil.getEntityManager();
        petshop = (PetShop)entityManager.find(PetShop.class, id);
        return petshop;
    }

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


    public void update(PetShop employee){

        EntityManager entityManager = null;

        entityManager= EntityManagerUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(employee);
        entityManager.getTransaction().commit();
    }


    public void delete(Integer id){

        EntityManager entityManager = null;

        entityManager= EntityManagerUtil.getEntityManager();
        entityManager.getTransaction().begin();
        PetShop pshop = (PetShop)entityManager.find(PetShop.class, id);
        entityManager.remove(pshop);
        entityManager.getTransaction().commit();
    }
}
package hu.unideb.inf.petcenter.db.dao;

import hu.unideb.inf.petcenter.db.entity.PetData;
import hu.unideb.inf.petcenter.db.entity.PetShop;
import hu.unideb.inf.petcenter.db.entity.manager.EntityManagerUtil;
import hu.unideb.inf.petcenter.db.entity.manager.Manager;

import javax.persistence.EntityManager;
import java.util.List;

public class PetDataDao {

//    public List<PetData> getAll() {
//        EntityManager entityManager = null;
//        List<PetData> petdata=null;
//
//        entityManager = EntityManagerUtil.getEntityManager();
//        petdata = (List<PetData>) entityManager.createNamedQuery("PetData.findAll", PetData.class).getResultList();
//        return petdata;
//    }

//    public void insert(PetData petData){
//
//       Manager.getManager().getTransaction().begin();
//        Manager.getManager().persist(petData);
//        Manager.getManager().getTransaction().commit();
//    }
//
//    public PetData get(Integer empId){
//
//        EntityManager entityManager = null;
//        PetData petData=null;
//
//        try{
//            entityManager = EntityManagerUtil.getEntityManager();
//            petData = (PetData) entityManager.find(PetData.class, empId);
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return petData;
//    }
//
//    public void update(PetData petData){
//
//        EntityManager entityManager = null;
//
//        try {
//            entityManager= EntityManagerUtil.getEntityManager();
//            entityManager.getTransaction().begin();
//            entityManager.merge(petData);
//            entityManager.getTransaction().commit();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void delete(Integer petDataId){
//
//        EntityManager entityManager = null;
//
//
//        try {
//
//            entityManager= EntityManagerUtil.getEntityManager();
//            entityManager.getTransaction().begin();
//            PetData petData = (PetData) entityManager.find(PetData.class, petDataId);
//            entityManager.remove(petData);
//            entityManager.getTransaction().commit();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}

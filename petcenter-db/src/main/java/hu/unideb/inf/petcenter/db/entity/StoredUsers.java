package hu.unideb.inf.petcenter.db.entity;

import java.util.List;

public class StoredUsers {
    public List<PetShop> storedUsers(){
        EntityManaging ema = new EntityManaging();
        return ema.em.createNamedQuery("PetShop.findAll", PetShop.class).getResultList();
    }
}

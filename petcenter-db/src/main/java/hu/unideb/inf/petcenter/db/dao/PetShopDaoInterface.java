package hu.unideb.inf.petcenter.db.dao;

import java.io.Serializable;
import java.util.List;

public interface PetShopDaoInterface <T, Id extends Serializable> {

    public void persist(T entity);
    public List<T> findAll();
}

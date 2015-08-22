package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Dishes;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by RomanMosiienko on 18.08.15.
 */
@Repository
@Transactional
public class DishRepository implements IDishRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Dishes getById(int id) {
        try {
            return (Dishes) entityManager.createNamedQuery("getById").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<Dishes> getAll() {
        return entityManager.createNamedQuery("getAll").getResultList();
    }

    @Override
    public List<Dishes> delete(int id) {
        try {
            return entityManager.createNamedQuery("deleteById").setParameter("id", id).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Dishes> add(Dishes dish) {
        entityManager.persist(dish);
        return entityManager.createNamedQuery("getAll").getResultList();
    }

    @Override
    public List<Dishes> update(Dishes dish) {
        entityManager.merge(dish);
        return entityManager.createNamedQuery("getAll").getResultList();
    }

}

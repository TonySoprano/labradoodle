package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Dishes;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.AppService}
 * This class worked with Dish in DB
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 18.08.15
 */
@Repository
@Transactional
public class DishRepositoryImpl implements DishRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Dishes getById(int id) {
        return (Dishes) entityManager.createNamedQuery("getById").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<Dishes> getAll() {
        return entityManager.createNamedQuery("getAll").getResultList();
    }

    @Override
    public List<Dishes> delete(int id) {
        return entityManager.createNamedQuery("deleteById").setParameter("id", id).getResultList();
    }

    @Override
    public void add(Dishes dish) {
        entityManager.persist(dish);
    }

    @Override
    public void update(Dishes dish) {
        entityManager.merge(dish);
    }

}

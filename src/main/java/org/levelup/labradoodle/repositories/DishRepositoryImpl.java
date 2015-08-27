package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Dishes;
import org.levelup.labradoodle.models.entities.TypeDishes;
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
        return (Dishes) entityManager.createNamedQuery("getDishById").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<Dishes> getAll() {
        return entityManager.createNamedQuery("getAllDishes").getResultList();
    }

    @Override
    public void delete(int id) {
        entityManager.createNamedQuery("deleteDishById").setParameter("id", id);
    }

    @Override
    public void add(Dishes dish) {
        entityManager.persist(dish);
    }

    @Override
    public void update(Dishes dish) {
        entityManager.merge(dish);
    }

    @Override
    public List<Dishes> geByType(TypeDishes typeDishes) {
        return entityManager.createNamedQuery("getDishByType").setParameter("typeDishes", typeDishes).getResultList();
    }

    @Override
    public List<Dishes> getFirst20() {
        return entityManager.createNamedQuery("getFirst20").setMaxResults(20).getResultList();
    }
}

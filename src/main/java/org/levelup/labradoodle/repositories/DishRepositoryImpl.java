package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Dish;
import org.levelup.labradoodle.models.entities.TypesOfDishes;
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
    public Dish getById(int id) {
        return (Dish) entityManager.createNamedQuery("getDishById").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<Dish> getDishesByRestaurant(int id){
        return entityManager.createNamedQuery("getDishesByRestaurant").getResultList();
    }

    @Override
    public List<Dish> getAll() {
        return entityManager.createNamedQuery("getAllDishes").getResultList();
    }

    @Override
    public void delete(int id) {
        entityManager.createNamedQuery("deleteDishById").setParameter("id", id);
    }

    @Override
    public void add(Dish dish) {
        entityManager.persist(dish);
    }

    @Override
    public void update(Dish dish) {
        entityManager.merge(dish);
    }

    @Override
    public List<Dish> geByType(TypesOfDishes typesOfDishes) {
        return entityManager.createNamedQuery("getDishByType").setParameter("typesOfDishes", typesOfDishes).getResultList();
    }

    @Override
    public List<Dish> getHotDishes(String cladr) {
       /* return entityManager.createNamedQuery("getHotDishes")
                            .setParameter("cladr",cladr + "%")
                            .setMaxResults(20)
                            .getResultList();*/
        return entityManager.createQuery(
                    "SELECT a FROM Dish a WHERE a.restaurant = 1")
                    //.setParameter("cladr",cladr)
                    .getResultList();
    }
}

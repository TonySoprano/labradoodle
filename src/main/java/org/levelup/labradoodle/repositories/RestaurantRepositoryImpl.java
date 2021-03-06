package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Restaurant;
import org.levelup.labradoodle.services.DishService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Class {@link DishService}
 * This class worked with Restaurant in DB
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 18.08.15
 */
@Repository
@Transactional
public class RestaurantRepositoryImpl implements RestaurantRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Restaurant getById(Integer id) {
        return (Restaurant) entityManager.createNamedQuery("getRestaurantById").setParameter("id", id).getSingleResult();
    }

    @Override
    public Restaurant getByEmail(String email) {
        return (Restaurant)entityManager.createNamedQuery("getRestaurantByEmail").setParameter("email",email).getSingleResult();
    }

    @Override
    public List<Restaurant> getAll() {
        return entityManager.createNamedQuery("getAllRestaurants").getResultList();
    }

    @Override
    public void delete(int id) {
        entityManager.createNamedQuery("deleteRestaurantById").setParameter("id", id).getResultList();
    }

    @Override
    public void add(Restaurant restaurant) {
        entityManager.persist(restaurant);
    }

    @Override
    public void update(Restaurant restaurant) {
        entityManager.merge(restaurant);
    }
}

package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Restaurant;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.AppService}
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
    public Restaurant getById(int id) {
        return (Restaurant) entityManager.createNamedQuery("getRestaurantById").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<Restaurant> getAll() {
        return entityManager.createNamedQuery("getAllRestaurants").getResultList();
    }

    @Override
    public List<Restaurant> getByCity(String city){
        return entityManager.createNamedQuery("getAllRestorantsByCity").getResultList();
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

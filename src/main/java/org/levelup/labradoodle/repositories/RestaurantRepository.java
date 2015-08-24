package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Restaurants;
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
public class RestaurantRepository implements IRestaurantRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Restaurants getById(int id) {
        return (Restaurants) entityManager.createNamedQuery("getRestaurantById").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<Restaurants> getAll() {
        return entityManager.createNamedQuery("getAllRestaurants").getResultList();
    }

    @Override
    public List<Restaurants> delete(int id) {
        try {
            return entityManager.createNamedQuery("deleteRestaurantById").setParameter("id", id).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Restaurants> add(Restaurants restaurant) {
        entityManager.persist(restaurant);
        return entityManager.createNamedQuery("getAllRestaurants").getResultList();
    }

    @Override
    public List<Restaurants> update(Restaurants restaurant) {
        entityManager.merge(restaurant);
        return entityManager.createNamedQuery("getAllRestaurants").getResultList();
    }
}

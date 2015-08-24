package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Restaurants;
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
    public Restaurants getById(int id) {
        return (Restaurants) entityManager.createNamedQuery("getById").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<Restaurants> getAll() {
        return entityManager.createNamedQuery("getAll").getResultList();
    }

    @Override
    public void delete(int id) {
        entityManager.createNamedQuery("deleteById").setParameter("id", id).getResultList();
    }

    @Override
    public void add(Restaurants restaurant) {
        entityManager.persist(restaurant);
    }

    @Override
    public void update(Restaurants restaurant) {
        entityManager.merge(restaurant);
    }
}

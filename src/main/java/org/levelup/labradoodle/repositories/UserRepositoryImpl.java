package org.levelup.labradoodle.repositories;


import org.levelup.labradoodle.models.entities.UsersPeople;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.AppService}
 * This class worked with User in DB
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 18.08.15
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UsersPeople getById(int id) {
        return (UsersPeople) entityManager.createNamedQuery("getById").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<UsersPeople> getAll() {
        return entityManager.createNamedQuery("getAll").getResultList();
    }

    @Override
    public void delete(int id) {
        entityManager.createNamedQuery("deleteById").setParameter("id", id).getResultList();
    }

    @Override
    public void add(UsersPeople admin) {
        entityManager.persist(admin);
    }

    @Override
    public void update(UsersPeople admin) {
        entityManager.merge(admin);
    }
}

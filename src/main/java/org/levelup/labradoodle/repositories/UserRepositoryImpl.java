package org.levelup.labradoodle.repositories;


import org.levelup.labradoodle.models.entities.User;
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
    public User getById(int id) {
        return (User) entityManager.createNamedQuery("getUserById").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<User> getAll() {
        return entityManager.createNamedQuery("getAllUsers").getResultList();
    }

    @Override
    public void delete(int id) {
        entityManager.createNamedQuery("deleteUserById").setParameter("id", id).getResultList();
    }

    @Override
    public void add(User admin) {
        entityManager.persist(admin);
    }

    @Override
    public void update(User admin) {
        entityManager.merge(admin);
    }
}

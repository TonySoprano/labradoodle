package org.levelup.labradoodle.repositories;


import org.levelup.labradoodle.models.entities.UsersPeople;
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
public class UserRepository implements IUserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UsersPeople getById(int id) {
        try {
            return (UsersPeople) entityManager.createNamedQuery("getRestaurantById").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<UsersPeople> getAll() {
        return entityManager.createNamedQuery("getAllRestaurants").getResultList();
    }

    @Override
    public List<UsersPeople> delete(int id) {
        try {
            return entityManager.createNamedQuery("deleteRestaurantById").setParameter("id", id).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<UsersPeople> add(UsersPeople admin) {
        String query = "insert into users (email, pass) values (\""+ admin.getEmail()+"\"," +admin.getPass()+");";
        return entityManager.createNativeQuery(query).getResultList();
    }

    @Override
    public List<UsersPeople> update(UsersPeople admin) {
        String query = "insert into users (email, pass) values (\""+ admin.getEmail()+"\"," +admin.getPass()+");";
        return entityManager.createNativeQuery(query).getResultList();
    }
}

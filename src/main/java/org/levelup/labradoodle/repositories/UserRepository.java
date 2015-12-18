package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.authentication.User;
import org.levelup.labradoodle.services.DishService;

import java.util.List;

/**
 * Class {@link DishService}
 * This class worked with User in DB
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 18.08.15
 */
public interface UserRepository {

    User getUserById(int id);

    User getUserByEmail(String email);

    List getAll();

    void delete(int id);

    void add(User admin);

    void update(User admin);
}

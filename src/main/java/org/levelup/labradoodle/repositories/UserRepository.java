package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.UsersPeople;

import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.AppService}
 * This class worked with User in DB
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 18.08.15
 */
public interface UserRepository {

    UsersPeople getById(int id);

    List getAll();

    void delete(int id);

    void add(UsersPeople admin);

    void update(UsersPeople admin);
}

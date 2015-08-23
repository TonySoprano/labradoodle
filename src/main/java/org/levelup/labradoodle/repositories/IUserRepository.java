package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.UsersPeople;

import java.util.List;

/**
 * Created by RomanMosiienko on 18.08.15.
 */
public interface IUserRepository {

    UsersPeople getById(int id);

    List getAll();

    List<UsersPeople> delete(int id);

    List<UsersPeople> add(UsersPeople admin);

    List<UsersPeople> update(UsersPeople admin);
}

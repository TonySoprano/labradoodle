package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Restaurants;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.AppService}
 * This interface worked with Restaurant in DB
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 18.08.15
 */
public interface RestaurantRepository {

    Restaurants getById(int id);

    List<Restaurants> getAll();

    void delete(int id);

    void add(Restaurants restaurant);

    void update(Restaurants restaurant);

}


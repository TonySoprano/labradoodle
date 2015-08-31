package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Restaurant;
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

    Restaurant getById(int id);

    List<Restaurant> getAll();

    void delete(int id);

    void add(Restaurant restaurant);

    void update(Restaurant restaurant);

}


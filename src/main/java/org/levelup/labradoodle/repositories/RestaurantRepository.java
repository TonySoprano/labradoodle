package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Restaurant;
import org.levelup.labradoodle.services.DishService;

import java.util.List;

/**
 * Class {@link DishService}
 * This interface worked with Restaurant in DB
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 18.08.15
 */
public interface RestaurantRepository {

    Restaurant getById(Integer id);

    Restaurant getByEmail(String email);

    List<Restaurant> getAll();

    void delete(int id);

    void add(Restaurant restaurant);

    void update(Restaurant restaurant);

}


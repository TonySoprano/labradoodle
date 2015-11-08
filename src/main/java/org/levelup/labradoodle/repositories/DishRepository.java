package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Dish;
import org.levelup.labradoodle.models.entities.TypesOfDishes;

import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.AppService}
 * This class worked with Dish in DB
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 18.08.15
 */
public interface DishRepository {

    Dish getById(int id);

    List<Dish> getAll();

    void delete(int id);

    void add(Dish admin);

    void update(Dish dish);

    List<Dish> geByType(TypesOfDishes typesOfDishes);

    List<Dish> getHotDishes (String cladr);

}

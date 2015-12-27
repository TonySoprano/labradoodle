package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Dish;
import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.services.DishService;

import java.util.List;

/**
 * Class {@link DishService}
 * This class worked with Dish in DB
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 18.08.15
 */
public interface DishRepository {

    Dish getById(Integer id);

    List<Dish> getDishesByRestaurant(Integer id);

    List<Dish> getAll();

    void delete(int id);

    void add(Dish dish);

    void update(Dish dish);

    List<Dish> getByType(TypesOfDishes typesOfDishes, String cladr);

    List<Dish> getHotDishes(String cladr);

    void deletete(Integer id);

}

package org.levelup.labradoodle.repositories;

import org.levelup.labradoodle.models.entities.Dishes;
import org.levelup.labradoodle.models.entities.TypeDishes;

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

    Dishes getById(int id);

    List<Dishes> getAll();

    void delete(int id);

    void add(Dishes admin);

    void update(Dishes dish);

    List<Dishes> geByType(TypeDishes typeDishes);

    List<Dishes> getFirst20 ();

}

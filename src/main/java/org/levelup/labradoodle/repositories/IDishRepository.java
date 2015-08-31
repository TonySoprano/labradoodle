package org.levelup.labradoodle.repositories;


import org.levelup.labradoodle.models.entities.Dish;

import java.util.List;

/**
 * Created by RomanMosiienko on 18.08.15.
 */
public interface IDishRepository {
    /**
     * oasidqsaioe
     * @param id
     * @return
     */
    Dish getById(int id);

    List<Dish> getAll();

    List<Dish> delete(int id);

    List<Dish> add(Dish admin);

    List<Dish> update(Dish dish);

}

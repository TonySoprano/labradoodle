package org.levelup.labradoodle.services;


import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;

import java.util.List;
import java.util.Map;

/**
 * Class {@link org.levelup.labradoodle.services.AppService}
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 24.08.15
 */
public interface AppService {
    /**
     * This method get Dish from BD and converting it to WEB model
     * @param id - Dish id
     * @return DishesDto
     */
    DishDto getDishById(int id);

    /**
     *
     * @param typesOfDishes
     * @return All dishes with current type
     */
    List<DishDto> getDishesByType(TypesOfDishes typesOfDishes);

    /**
     * @author Barkovskiy Alexandr
     * This method get frirst 20 Dish with min deadLine from BD and converting it to WEB model
     * @param cladr - String address filter
     * @return List of DishDto
     */
    List<DishDto> getHotDishes(String cladr);

}

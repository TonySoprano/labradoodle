package org.levelup.labradoodle.services;


import org.levelup.labradoodle.models.entities.TypeDishes;
import org.levelup.labradoodle.models.web.DishesDto;

import java.util.List;

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
    DishesDto getDishById(int id);

    /**
     *
     * @param typeDishes
     * @return All dishes with current type
     */
    List<DishesDto> getDishesByType(TypeDishes typeDishes);
}

package org.levelup.labradoodle.services;


import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.models.web.response.CabinetClientResponse;

import java.util.Date;
import java.util.List;

/**
 * Class {@link DishService}
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 24.08.15
 */
public interface DishService {
    /**
     * This method get Dish from BD and converting it to WEB model
     * @param id - Dish id
     * @return DishesDto
     */
    DishDto getDishById(int id);

    /**
     *
     * @param typesOfDishes,cladr
     * @return All dishes with current type
     */
    List<DishDto> getDishesByType(TypesOfDishes typesOfDishes, String cladr);

    /**
     * @author Barkovskiy Alexandr
     * This method get frirst 20 Dish with min deadLine from BD and converting it to WEB model
     * @param cladr - String address filter
     * @return List of DishDto
     */
    List<DishDto> getHotDishes(String cladr);

    /**
     * @author Barkovskiy Alexandr
     * This method get all Dish from defenite resorant from BD and converting it to WEB model
     * @param restaurantId - String address filter
     * @return List of DishDto
     */
    List<DishDto> getDishesByRestaurant(int restaurantId);

    /**
     * @author Barkovskiy Alexandr
     * This method add Dish in DB
     * @param restaurantId - String address filter
     * @return List of DishDto
     */
    CabinetClientResponse addDish(Integer restaurantId, TypesOfDishes type, Integer priceOriginal, Integer priceNew, Date deadline,String photo,String description);

}


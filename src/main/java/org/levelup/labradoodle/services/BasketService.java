package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.web.BasketDto;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.models.web.response.BasketClientResponse;

import java.util.List;
import java.util.Map;

/**
 * Class  {@Link org.levelup.labradoodle.services}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 02.12.15
 */
public interface BasketService {

    /**
     * This method create basket depending on param
     * @param basket,dishId - Session attribute basket & Dish id
     * @return Map
     */
     Map addDishToBasket(Object basket, Integer dishId);

    /**
     * This method delete dish from basket
     * @param basket,dishId - Session attribute basket & Dish id
     * @return Map
     */
    Map deleteDishFromBasket(Object basket, Integer dishId);

    /**
     * This return all dishes from user's basket
     * @param basket - Session attribute basket
     * @return List<BasketDto>
     */
    List<BasketDto> getBasket(Object basket);

    /**
     * This method return count of Dishes in basket
     * @param basket - Session attribute basket & Dish id
     * @return Map
     */
    Integer getCountDishes(Object basket);


}

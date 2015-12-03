package org.levelup.labradoodle.services;

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

}

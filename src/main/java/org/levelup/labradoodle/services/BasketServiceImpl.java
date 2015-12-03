package org.levelup.labradoodle.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Class  {@Link org.levelup.labradoodle.services}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 02.12.15
 */
@Service
public class BasketServiceImpl implements BasketService {

    @Override
    public Map addDishToBasket(Object basket, Integer dishId) {
        Map newBasket = (HashMap)basket;
        if (newBasket.containsKey(dishId)){
            int countDish = (int)newBasket.get(dishId);
            countDish++;
            newBasket.put(dishId,countDish);
        }
        else newBasket.put(dishId,1);

        return newBasket;
    }
}

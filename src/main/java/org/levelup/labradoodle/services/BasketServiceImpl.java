package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
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

    @Autowired
    DishRepository dishRepository;

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

    @Override
    public Map deleteDishFromBasket(Object basket, Integer dishId) {
        Map newBasket = (HashMap)basket;
        if (newBasket.containsKey(dishId)){
            int countDish = (int)newBasket.get(dishId);
            if (countDish != 1){
                countDish--;
                newBasket.put(dishId,countDish);
            }
            else newBasket.remove(dishId);
        }
        return newBasket;
    }

    @Override
    public List<DishDto> getBasket(Object basket) {
        return null;
    }
}

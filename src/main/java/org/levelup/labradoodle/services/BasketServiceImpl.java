package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.Dish;
import org.levelup.labradoodle.models.web.BasketDto;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.models.web.response.BasketClientResponse;
import org.levelup.labradoodle.models.web.response.ClientResponseStatus;
import org.levelup.labradoodle.repositories.DishRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Class  {@Link org.levelup.labradoodle.services}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 02.12.15
 */
@Service
public class BasketServiceImpl implements BasketService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BasketServiceImpl.class);

    @Autowired
    DishRepository dishRepository;

    @Override
    public Map addDishToBasket(Object basketAttribute, Integer dishId) {
        Map basket = (HashMap) basketAttribute;
        if (basket.containsKey(dishId)) {
            int countDish = (int) basket.get(dishId);
            countDish++;
            basket.put(dishId, countDish);
        } else {
            basket.put(dishId, 1);
        }
        return basket;
    }

    @Override
    public Map deleteDishFromBasket(Object basketAttribute, Integer dishId) {
        Map basket = (HashMap) basketAttribute;
        if (basket.containsKey(dishId)) {
            int countDish = (int) basket.get(dishId);
            if (countDish != 1) {
                countDish--;
                basket.put(dishId, countDish);
            } else basket.remove(dishId);
        }
        return basket;
    }

    @Override
    public List<BasketDto> getBasket(Object basketAttribute) {
        List<BasketDto> basketDtoList = new ArrayList<>();
        Map<Integer,Integer> basket = (HashMap)basketAttribute;
        try {
            for (Map.Entry<Integer,Integer> entry: basket.entrySet()) {
                Dish dish = dishRepository.getById(entry.getKey());
                basketDtoList.add(new BasketDto().setDishDto(new DishDto()
                        .setDishId(dish.getDishId())
                        .setName(dish.getName())
                        .setDeadline(dish.getDeadline())
                        .setDescription(dish.getDescription())
                        .setPhoto(dish.getPhoto())
                        .setPriceNew(dish.getPriceNew())
                        .setPriceOriginal(dish.getPriceOriginal())
                        .setRestaurant(dish.getRestaurant())
                        .setTypesOfDishes(dish.getTypesOfDishes()))
                        .setCount(entry.getValue()));
            }
        }catch (Exception e){
            LOGGER.error("{}",e.toString(),e);
            return basketDtoList;
        }
        return basketDtoList;
    }

    @Override
    public Integer getCountDishes(Object basketAttribute) {
        Map<Integer, Integer> basket = (HashMap) basketAttribute;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : basket.entrySet()) {
            count += entry.getValue();
        }
        return count;
    }

}

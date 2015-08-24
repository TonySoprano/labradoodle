package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.Dishes;
import org.levelup.labradoodle.models.web.DishesDto;
import org.levelup.labradoodle.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class {@link org.levelup.labradoodle.services.AppServiceImpl}
 * This class get models from DB and convert that to the WEB models
 * @author Mosiienko Roman
 * @version 1.0
 * @since 24.08.15
 */
@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private DishRepository dishRepository;

    /**
     * This method get Dish from BD and converting it to WEB model
     * @param id - Dish id
     * @return DishesDto
     */
    @Override
    public DishesDto getDishById(int id) {
        if (id < 0) {
            return null;
        }
        Dishes dish = dishRepository.getById(id);
        DishesDto dishesDto = new DishesDto();
        dishesDto.setDeadline(dish.getDeadline())
                .setTypeDishes(dish.getTypeDishes())
                .setDescription(dish.getDescription())
                .setName(dish.getName())
                .setId(dish.getId())
                .setPhoto(dish.getPhoto())
                .setPrice_new(dish.getPriceNew())
                .setPrice_Original(dish.getPriceOriginal());
        return dishesDto;
    }
}

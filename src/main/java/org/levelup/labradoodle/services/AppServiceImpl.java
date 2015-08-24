package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.Dishes;
import org.levelup.labradoodle.models.entities.TypeDishes;
import org.levelup.labradoodle.models.web.DishesDto;
import org.levelup.labradoodle.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.AppServiceImpl}
 * This class get models from DB and convert that to the WEB models
 *
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
     *
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

    /**
     *
     * @param typeDishes - ( burger, fish, pizza, etc.)
     * @return All dishes with current type
     */
    @Override
    public List<DishesDto> getDishesByType(TypeDishes typeDishes) {
        ArrayList<DishesDto> dishesDtos = new ArrayList<>();
        for (Dishes dish : dishRepository.geByType(typeDishes)) {
            dishesDtos.add(new DishesDto()
                    .setDeadline(dish.getDeadline())
                    .setDescription(dish.getDescription())
                    .setId(dish.getId())
                    .setName(dish.getName())
                    .setPhoto(dish.getPhoto())
                    .setPrice_new(dish.getPriceNew())
                    .setPrice_Original(dish.getPriceOriginal())
                    .setTypeDishes(dish.getTypeDishes()));
        }
        return dishesDtos;
    }
}

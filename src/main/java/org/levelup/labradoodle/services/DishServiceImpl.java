package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.Dish;
import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.repositories.DishRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Class {@link org.levelup.labradoodle.services.DishServiceImpl}
 * This class get models from DB and convert that to the WEB models
 *
 * @author Mosiienko Roman
 * @version 1.0
 * @since 24.08.15
 */
@Service
public class DishServiceImpl implements DishService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DishServiceImpl.class);

    @Autowired
    private DishRepository dishRepository;

    /**
     * This method get Dish from BD and converting it to WEB model
     *
     * @param id - Dish id
     * @return DishDto
     */
    @Override
    public DishDto getDishById(int id) {
        if (id < 0) {
            return null;
        }
        Dish dish = dishRepository.getById(id);
        DishDto dishDto = new DishDto();
        dishDto.setDeadline(dish.getDeadline())
                .setTypesOfDishes(dish.getTypesOfDishes())
                .setDescription(dish.getDescription())
                .setName(dish.getName())
                .setDishId(dish.getDishId())
                .setPhoto(dish.getPhoto())
                .setPriceNew(dish.getPriceNew())
                .setPriceOriginal(dish.getPriceOriginal());

        return dishDto;
    }


    /**
     *
     * @param typesOfDishes - ( burger, fish, pizza, etc.)
     * @return All dishes with current type sorted by cladr (address filter)
     */
    @Override
    public List<DishDto> getDishesByType(TypesOfDishes typesOfDishes, String cladr) {
        ArrayList<DishDto> dishDtos = new ArrayList<>();
        try {
            for (Dish dish : dishRepository.getByType(typesOfDishes, cladr)) {
                dishDtos.add(new DishDto()
                        .setDeadline(dish.getDeadline())
                        .setDescription(dish.getDescription())
                        .setDishId(dish.getDishId())
                        .setName(dish.getName())
                        .setPhoto(dish.getPhoto())
                        .setPriceNew(dish.getPriceNew())
                        .setPriceOriginal(dish.getPriceOriginal())
                        .setTypesOfDishes(dish.getTypesOfDishes())
                        .setRestaurant(dish.getRestaurant()));
            }
        }catch (Exception e){
            LOGGER.error("{}",e.toString(),e);
            return dishDtos;
        }
        return dishDtos;
    }

    /**
     *@author Barkovskiy Alexandr
     * @return List of DishDto with min  deadline
     * @param cladr - String address filter
     */
    @Override
    public List<DishDto> getHotDishes(String cladr) {
        List<DishDto> dishesDtos = new ArrayList<>();
        try{
            for (Dish dish: dishRepository.getHotDishes(cladr)){
                dishesDtos.add(new DishDto()
                        .setDishId(dish.getDishId())
                        .setName(dish.getName())
                        .setDeadline(dish.getDeadline())
                        .setDescription(dish.getDescription())
                        .setPhoto(dish.getPhoto())
                        .setPriceNew(dish.getPriceNew())
                        .setPriceOriginal(dish.getPriceOriginal())
                        .setTypesOfDishes(dish.getTypesOfDishes())
                        .setRestaurant(dish.getRestaurant()));
            }
        }catch (Exception e){
            LOGGER.error("{}",e.toString(),e);
            return dishesDtos;
        }
        return dishesDtos;
    }

    @Override
    public List<DishDto> getDishesByRestaurant(int restaurantId) {
        List<DishDto> dishDtoList = new ArrayList<>();
        try {
            for (Dish dish: dishRepository.getDishesByRestaurant(restaurantId)){
                dishDtoList.add(new DishDto()
                        .setDishId(dish.getDishId())
                        .setName(dish.getName())
                        .setDeadline(dish.getDeadline())
                        .setDescription(dish.getDescription())
                        .setPhoto(dish.getPhoto())
                        .setPriceNew(dish.getPriceNew())
                        .setPriceOriginal(dish.getPriceOriginal())
                        .setTypesOfDishes(dish.getTypesOfDishes())
                        .setRestaurant(dish.getRestaurant()));
            }
        }catch (Exception e){
            LOGGER.error("{}",e.toString(),e);
            return dishDtoList;
        }
        return dishDtoList;
    }
}

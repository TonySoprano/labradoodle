package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.Dish;
import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
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
     * @return All dishes with current type
     */
    @Override
    public List<DishDto> getDishesByType(TypesOfDishes typesOfDishes) {
        ArrayList<DishDto> dishDtos = new ArrayList<>();
        for (Dish dish : dishRepository.geByType(typesOfDishes)) {
            dishDtos.add(new DishDto()
                    .setDeadline(dish.getDeadline())
                    .setDescription(dish.getDescription())
                    .setDishId(dish.getDishId())
                    .setName(dish.getName())
                    .setPhoto(dish.getPhoto())
                    .setPriceNew(dish.getPriceNew())
                    .setPriceOriginal(dish.getPriceOriginal())
                    .setTypesOfDishes(dish.getTypesOfDishes()));
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
            System.out.println(e);  //I don't know WERE should be our log-file, I'll add it later (Honestly!)
        }
        return dishesDtos;
    }

}
package org.levelup.labradoodle.services;

import org.levelup.labradoodle.models.entities.Dish;
import org.levelup.labradoodle.models.entities.Restaurant;
import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.repositories.DishRepository;
import org.levelup.labradoodle.repositories.RestaurantRepository;
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
    @Autowired
    private RestaurantRepository restaurantRepository;

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
                .setId(dish.getId())
                .setPhoto(dish.getPhoto())
                .setPrice_new(dish.getPriceNew())
                .setPrice_Original(dish.getPriceOriginal());
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
                    .setId(dish.getId())
                    .setName(dish.getName())
                    .setPhoto(dish.getPhoto())
                    .setPrice_new(dish.getPriceNew())
                    .setPrice_Original(dish.getPriceOriginal())
                    .setTypesOfDishes(dish.getTypesOfDishes()));
        }
        return dishDtos;
    }

    /**
     *
     * Method return List Dishes of restourant in select city
     * (should at least)
     */
    @Override
    public List<DishDto> getDishesByCity(String city){
        List<DishDto> DishDtoByCity=new ArrayList<>(30);
        List<Dish> tempDish=new ArrayList<>();
        try{
            List <Restaurant> restaurantsInCity=restaurantRepository.getByCity(city);
            for (Restaurant rest: restaurantsInCity){
                int i=rest.getId();
                tempDish.addAll(dishRepository.getDishesByRestaurant(i));
                for (Dish dish : tempDish) {
                    DishDtoByCity.add(new DishDto()
                            .setDeadline(dish.getDeadline())
                            .setDescription(dish.getDescription())
                            .setId(dish.getId())
                            .setName(dish.getName())
                            .setPhoto(dish.getPhoto())
                            .setPrice_new(dish.getPriceNew())
                            .setPrice_Original(dish.getPriceOriginal())
                            .setTypesOfDishes(dish.getTypesOfDishes()));
                }
                tempDish.clear();
            }
        }
        catch (Exception e) {

        }
        return DishDtoByCity;
    }
}

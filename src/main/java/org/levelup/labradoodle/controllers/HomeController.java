package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.entities.Restaurant;
import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.services.AppService;
import org.levelup.labradoodle.services.CladrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Class {@link HomeController}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 21.07.2015
 */
@Controller
public class HomeController {

    @Autowired
    private AppService appService;

    @Autowired
    private CladrService cladrService;


    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    /**
     * This method return Dish (WEB model) from DB by id. Current version work with mock
     *
     * @param id - dish id
     * @return Dish
     */
    @ResponseBody
    @RequestMapping(value = "/get/dish/{id}", method = RequestMethod.GET)
    public DishDto getDishById(@PathVariable(value = "id") int id) {
//    This line was be add to comment because DB not already connect
//    return appService.getDishById(id);

        //Temp mock for front ( for proton)
        return new DishDto().setDescription("Dish description").setDishId(1).setName("Dish name").setPriceOriginal(20).setPriceNew(10).setTypesOfDishes(TypesOfDishes.BURGERS);
    }

    /**
     * I am not sure this method is not correct because maybe sending parameter has not valid type
     * @param typesOfDishes
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/get/dishes/{type}", method = RequestMethod.GET)
    public List<DishDto> getDishesByType(@PathVariable(value = "type") TypesOfDishes typesOfDishes) {
        return appService.getDishesByType(typesOfDishes);
    }

    //temporary plug for types of dishes
    @ResponseBody
    @RequestMapping(value = "/get/typesofdishes", method = RequestMethod.GET)
    public List<TypesOfDishes> getDishesType() {
        List<TypesOfDishes> typesOfDishes = new ArrayList<>();
        for (TypesOfDishes n : TypesOfDishes.values()) {
            typesOfDishes.add(n);
        }
        return typesOfDishes;
    }

    /**
     * This method return List of Dishes (WEB model) from DB by deadline depending on request param.
     * @author Barkovskiy Alexandr
     * @param cladr - Sting address filter
     * @return List of DishesDto
     */
    @ResponseBody
    @RequestMapping(value = "/get/hotdishes",method = RequestMethod.GET)
    public List<DishDto> getHotDishes(@RequestParam String cladr){
        // List<DishDto> dishesDtos = appService.getHotDishes(cladr);
        //return dishesDtos;
        List<DishDto> list = new ArrayList<>();
        list.add(new DishDto().setDishId(1).setRestaurant(new Restaurant().setName("PUZO")));
        return list;
    }

    /**
     * This method return List WEB models of (Region,City,Street) depending on request param.
     * @author Barkovskiy Alexandr
     * @param cladr - Sting address filter
     * @return List of Objects
     */
    @ResponseBody
    @RequestMapping(value = "/get/cladrinfo",method = RequestMethod.GET)
    public List<?> cladrInfo(@RequestParam String cladr){
        List<?> cladrInfo = cladrService.getCladrInfo(cladr);
        return cladrInfo;
    }
}

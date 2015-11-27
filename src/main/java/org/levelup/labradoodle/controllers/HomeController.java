package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.models.web.kladr.KladrObjectDto;
import org.levelup.labradoodle.services.DishService;
import org.levelup.labradoodle.services.KladrService;
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
    private DishService dishService;

    @Autowired
    private KladrService kladrService;

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
//    return dishService.getDishById(id);

        //Temp mock for front ( for proton)
        return new DishDto().setDescription("Dish description").setDishId(1).setName("Dish name").setPriceOriginal(20).setPriceNew(10).setTypesOfDishes(TypesOfDishes.BURGERS);
    }

    /**
     * This method return List of Dishes (WEB model) from DB sorted by type.
     * @param type,kladr - type of Dishes & address filter
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/get/dishes/bytype", method = RequestMethod.GET)
    public List<DishDto> getDishesByType(@RequestParam ("type") String type, @RequestParam String kladr) {
        TypesOfDishes typesOfDishes = TypesOfDishes.valueOf(type.toUpperCase());
        return dishService.getDishesByType(typesOfDishes,kladr);
    }

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
     * @param kladr - Sting address filter
     * @return List of DishesDto
     */
    @ResponseBody
    @RequestMapping(value = "/get/hotdishes",method = RequestMethod.GET)
    public List<DishDto> getHotDishes(@RequestParam String kladr){
        return dishService.getHotDishes(kladr);
    }

    /**
     * This method return List WEB models of (Region,City,Street) depending on request param.
     * @author Barkovskiy Alexandr
     * @param kladr - Sting address filter
     * @return List of Objects
     */
    @ResponseBody
    @RequestMapping(value = "/get/kladrinfo",method = RequestMethod.GET)
    public List<KladrObjectDto> kladrInfo(@RequestParam String kladr){
        return kladrService.getKladrInfo(kladr);
    }
}

package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.entities.TypeDishes;
import org.levelup.labradoodle.models.web.DishesDto;
import org.levelup.labradoodle.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping(value = "/get_dish/{id}", method = RequestMethod.GET)
    public DishesDto getDishById(@PathVariable(value = "id") int id) {
//    This line was be add to comment because DB not already connect
//    return appService.getDishById(id);

        //Temp mock for front ( for proton)
        return new DishesDto().setDescription("Dish description").setId(1).setName("Dish name").setPrice_Original(20).setPrice_new(10).setTypeDishes(TypeDishes.BURGERS);
    }

    /**
     * I am not sure this method is not correct because maybe sending parameter has not valid type
     * @param typeDishes
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/get_dishes_by_type/{type}", method = RequestMethod.GET)
    public List<DishesDto> getDishesByType(@PathVariable(value = "type") TypeDishes typeDishes) {
        return appService.getDishesByType(typeDishes);
    }

    //temporary plug for types of dishes
    @ResponseBody
    @RequestMapping(value = "/get_dishes_type", method = RequestMethod.GET)
    public List<TypeDishes> getDishesType() {
        List<TypeDishes> typeDishes = new ArrayList<>();
        for (TypeDishes n : TypeDishes.values()) {
            typeDishes.add(n);
        }
        return typeDishes;
    }
}

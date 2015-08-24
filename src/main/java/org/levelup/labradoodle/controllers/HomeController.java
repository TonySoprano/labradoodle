package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.entities.Dishes;
import org.levelup.labradoodle.models.entities.TypeDishes;
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

    @ResponseBody
    @RequestMapping(value = "/")
    public String home() {
        return "Hello stranger";
    }

    /**
     * This method return Dish (WEB model) from DB by id
     *
     * @param id - dish id
     * @return Dish
     */
    @ResponseBody
    @RequestMapping(value = "/get_dish/{id}", method = RequestMethod.GET)
    public List<Dishes> deleteEmployee(@PathVariable(value = "id") int id) {
//    This line was be add to comment because DB not already connect
//    return appService.getDishById(id);

        //Temp mock for front
        ArrayList<Dishes> dishes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Dishes dish = new Dishes();
            dish.setId(i)
                    .setName("Dish name  " + i)
                    .setDescription("Some description " + i)
                    .setTypeDishes(TypeDishes.FISH)
                    .setPrice_original(2 + i);
            dishes.add(dish);
        }
        return dishes;
    }
}

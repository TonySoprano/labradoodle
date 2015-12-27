package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.models.web.response.CabinetClientResponse;
import org.levelup.labradoodle.services.DishService;
import org.levelup.labradoodle.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Date;
import java.util.List;

/**
 * Class  {@Link org.levelup.labradoodle.controllers}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 08.12.15
 */
@Controller
public class CabinetController {

    @Autowired
    DishService dishService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/cabinet")
    @ResponseBody
    public List<DishDto> personalCabinet(HttpServletRequest request){
        Principal principal = request.getUserPrincipal();
        return dishService.getDishesByRestaurant(userService.getIdRestaurantByEmail(principal.getName()));
    }

    @RequestMapping(value = "/cabinet/add",method = RequestMethod.GET)
    @ResponseBody
    public CabinetClientResponse addDish(@RequestParam Integer restaurantId, String type, Integer priceOriginal, Integer priceNew, Date deadline,String photo, String description){
        TypesOfDishes typesOfDishes = TypesOfDishes.valueOf(type.toUpperCase());
        return dishService.addDish(restaurantId,typesOfDishes,priceOriginal,priceNew,deadline,photo,description);
    }

    @RequestMapping(value = "/cabinet/delete",method = RequestMethod.GET)
    @ResponseBody
    public CabinetClientResponse deleteDish(@RequestParam Integer restaurantId){
        return dishService.delete(restaurantId);
    }

}

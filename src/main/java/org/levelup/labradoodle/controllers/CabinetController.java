package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.services.DishService;
import org.levelup.labradoodle.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
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




}

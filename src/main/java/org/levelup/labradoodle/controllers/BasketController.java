package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.web.BasketDto;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.services.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class  {@Link org.levelup.labradoodle.controllers}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 30.11.15
 */
@Controller
public class BasketController {

    @Autowired
    BasketService basketService;

    /**
     * This method add chosen dish to client's session attribute.
     * @param id - Dish id
     */
    @RequestMapping(value = "/basket/add/dish", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void addDishInBasket(HttpSession session,@RequestParam Integer id){
        if (session.getAttribute("basket") == null){
            Map basket = new HashMap();
            basket.put(id,1);
            session.setAttribute("basket",basket);
        }
        else {
            Object basket = session.getAttribute("basket");
            session.setAttribute("basket",basketService.addDishToBasket(basket,id));
        }
    }

    /**
     * This method delete chosen dish to client's session attribute.
     * @param id - Dish id
     */
    @RequestMapping(value = "/basket/delete/dish",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteDishFromBasket(HttpSession session, @RequestParam Integer id){
        Object basket = session.getAttribute("basket");
        session.setAttribute("basket",basketService.deleteDishFromBasket(basket,id));
    }

    /**
     * This method delete chosen dish to client's session attribute.
     * @return  List<DishDto>
     */
    @ResponseBody
    @RequestMapping(value = "/basket/get/alldishes", method = RequestMethod.GET)
    public List<BasketDto> getBasket(HttpSession session){
        return basketService.getBasket(session.getAttribute("basket"));
    }

    /**
     * This method delete basket from client's session attribute
     */
    @RequestMapping(value = "/basket/clean",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void cleanBasket(HttpSession session){
        session.removeAttribute("basket");
    }
}

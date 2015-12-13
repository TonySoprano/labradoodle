package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.web.BasketDto;
import org.levelup.labradoodle.models.web.response.BasketClientResponse;
import org.levelup.labradoodle.models.web.response.ClientResponseStatus;
import org.levelup.labradoodle.services.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
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
    @ResponseBody
    public BasketClientResponse addDishInBasket(HttpSession session, @RequestParam Integer id){
        if (id == null){
            return new BasketClientResponse().setStatus(ClientResponseStatus.FAIL);
        }
        if (session.getAttribute("basket") == null){
            Map basket = new HashMap();
            basket.put(id,1);
            session.setAttribute("basket",basket);
            return new BasketClientResponse()
                            .setStatus(ClientResponseStatus.SUCCESS)
                            .setCountDishes(1);
        } else {
            Object basket = session.getAttribute("basket");
            session.setAttribute("basket",basketService.addDishToBasket(basket,id));
        }
        return new BasketClientResponse()
                        .setStatus(ClientResponseStatus.SUCCESS)
                        .setCountDishes(basketService.getCountDishes(session.getAttribute("basket")));
    }

    /**
     * This method delete chosen dish to client's session attribute.
     * @param id - Dish id
     */
    @RequestMapping(value = "/basket/delete/dish",method = RequestMethod.GET)
    @ResponseBody
    public BasketClientResponse deleteDishFromBasket(HttpSession session, @RequestParam Integer id){
        if (id == null){
            return new BasketClientResponse().setStatus(ClientResponseStatus.FAIL);
        }
        Object basket = session.getAttribute("basket");
        session.setAttribute("basket",basketService.deleteDishFromBasket(basket,id));
        return new BasketClientResponse()
                        .setStatus(ClientResponseStatus.SUCCESS)
                        .setCountDishes(basketService.getCountDishes(session.getAttribute("basket")));
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

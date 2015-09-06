package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.entities.Restaurant;
import org.levelup.labradoodle.models.entities.TypesOfDishes;
import org.levelup.labradoodle.models.web.DishDto;
import org.levelup.labradoodle.models.web.RestaurantDto;
import org.levelup.labradoodle.models.web.kladr.CityDto;
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
 * Created by A2driano on 05.09.2015.
 *
 *
 *
 */
@Controller
public class CityController {

    @Autowired
    private AppService appService;

    /**
     This controller takes name of city in selector on the cite
     */
    @ResponseBody
    @RequestMapping(value = "/get/cityName{city}", method = RequestMethod.GET)
    public List<DishDto> getDishesByCity(@PathVariable String city) {
        return appService.getDishesByCity(city);
    }
}

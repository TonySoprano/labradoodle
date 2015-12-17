package org.levelup.labradoodle.controllers;

import org.levelup.labradoodle.models.web.DishDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    @RequestMapping(value = "/cabinet")
    public String personalCabinet(HttpServletRequest request){
        HttpSession session = request.getSession();
        return "cabinet";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){return "test";}
}

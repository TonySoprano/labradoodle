package org.levelup.labradoodle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class {@link HomeController}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 21.07.2015
 */
@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "/")
    public String home() {
        return "Hello stranger";
    }
}

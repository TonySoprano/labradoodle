package org.levelup.labradoodle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class  {@Link org.levelup.labradoodle.controllers}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 08.12.15
 */
@Controller
public class CabinetController {

    @RequestMapping(value = "/personalcabinet")
    public String personalCabinet(){
        return "cabinet";
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(){
        return new String("login");
    }
}

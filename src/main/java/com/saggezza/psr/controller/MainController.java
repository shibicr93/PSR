package com.saggezza.psr.controller;

/**
 * Created by shibi on 9/6/16.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Proudly handcrafted by " +
                "<a href='http://github.com/shibicr93'>shibi</a> :)";
    }

}

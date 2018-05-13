package com.springframework.demo.controller;

import com.springframework.demo.annotation.TestPark;
import com.springframework.demo.annotation.TestPark.ParkType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/say")
    @ResponseBody
    @TestPark(type = ParkType.PRIVATE)
    public String sayHello(){
        System.out.println("/say");
        logger.debug("/say...");
        return "Hello SpringMVC today 11 2 3 4 5 6 7 8";
    }

    @GetMapping("/jsp")
    public String goToJsp(){
        System.out.println("/jsp");
        logger.debug("jsp...");
        return "index";
    }

}

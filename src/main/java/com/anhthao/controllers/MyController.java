package com.anhthao.controllers;

import com.anhthao.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello(){
        return greetingService.getGreeting();
    }
}

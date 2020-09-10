package com.anhthao.controllers;

import com.anhthao.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyDIController {

    @Qualifier("propertyService")
    @Autowired
    public GreetingService greetingService;


    public String getGreeting() {
        return greetingService.getGreeting();
    }
}

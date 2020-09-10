package com.anhthao.controllers;

import com.anhthao.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorDIController {
    private final GreetingService greetingService;

    public ConstructorDIController(@Qualifier("constructorService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.getGreeting();
    }
}

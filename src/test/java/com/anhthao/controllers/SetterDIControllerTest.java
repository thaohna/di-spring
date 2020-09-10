package com.anhthao.controllers;

import com.anhthao.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterDIControllerTest {

    SetterDIController setterDIController;

    @BeforeEach
    void setUp() {
        setterDIController = new SetterDIController();
        setterDIController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterDIController.getGreeting());
    }
}
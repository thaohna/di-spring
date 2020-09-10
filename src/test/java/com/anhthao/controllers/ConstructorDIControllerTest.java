package com.anhthao.controllers;

import com.anhthao.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorDIControllerTest {

    ConstructorDIController constructorDIController;

    @BeforeEach
    void setUp() {
        constructorDIController = new ConstructorDIController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorDIController.getGreeting());
    }
}
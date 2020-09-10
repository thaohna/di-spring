package com.anhthao.services;


import org.springframework.stereotype.Service;


@Service
public class PropertyService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello world - Property";
    }
}

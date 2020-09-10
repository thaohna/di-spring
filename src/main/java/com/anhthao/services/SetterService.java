package com.anhthao.services;

import org.springframework.stereotype.Service;

@Service
public class SetterService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello world - Setter";
    }
}

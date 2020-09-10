package com.anhthao.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello world - Primary";
    }
}
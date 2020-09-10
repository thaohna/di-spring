package com.anhthao.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nservice")
public class EnglishService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello world - EN";
    }
}

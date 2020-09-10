package com.anhthao.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("VI")
@Service("i18nservice")
public class VietnameseService implements GreetingService{
        @Override
        public String getGreeting() {
            return "Xin chào thế giới - VI";
        }
}

package com.example.RestaurantApplication.Configuration;

import com.example.RestaurantApplication.Model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanManager {
    @Bean
    public Map<Integer , Restaurant> getRestaurantMap(){
        return new HashMap<>() ;
    }
}

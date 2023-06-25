package com.example.RestaurantApplication.Repository;


import com.example.RestaurantApplication.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class RestaurantRepo {

    @Autowired
    Map<Integer , Restaurant> restaurants ;

    public Map<Integer , Restaurant> getAllRestaurant(){
        return restaurants ;
    }

}

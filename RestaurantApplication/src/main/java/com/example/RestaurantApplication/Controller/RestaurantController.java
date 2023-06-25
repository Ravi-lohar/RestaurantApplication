package com.example.RestaurantApplication.Controller;

import com.example.RestaurantApplication.Model.Restaurant;
import com.example.RestaurantApplication.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService ;

    @GetMapping("Restaurant/{Id}")
    public Restaurant getRestaurant(@PathVariable Integer Id){
        return restaurantService.getRestaurant(Id);
    }
    @GetMapping("Restaurants")
    public Map<Integer, Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }

    @PostMapping("Restaurants")
    public String addRestaurants(@RequestBody List<Restaurant> restaurants){
        return restaurantService.addRestaurants(restaurants);

    }

    @PutMapping("Restaurant/{Id}")
    public String updateRestaurant(@PathVariable Integer Id , @RequestBody Restaurant restaurant)  {
        return restaurantService.updateRestaurant(Id , restaurant);
    }

    @DeleteMapping("Restaurant/{Id}")
    public String deleteRestaurant(@PathVariable Integer Id){
        return restaurantService.deleteRestaurant(Id);
    }

}

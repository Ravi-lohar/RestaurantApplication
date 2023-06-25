package com.example.RestaurantApplication.Service;


import com.example.RestaurantApplication.Model.Restaurant;
import com.example.RestaurantApplication.Repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo ;
    public Restaurant getRestaurant(Integer id) {
        Map<Integer , Restaurant> restaurantlist = getAllRestaurant();
            Restaurant allrestaurant = restaurantlist.get(id);
            if(allrestaurant != null){
               return allrestaurant ;
            }
        return null;
    }
    public Map<Integer, Restaurant> getAllRestaurant() {
        return restaurantRepo.getAllRestaurant();
    }

    public String addRestaurants(List<Restaurant> restaurants) {
        Map<Integer , Restaurant> restaurantlist = getAllRestaurant();
        for(Restaurant restaurant : restaurants){
            restaurantlist.put(restaurant.getRestaurantId() , restaurant);
        }
        return "Restaurants Added" ;
    }

    public String updateRestaurant(Integer id, Restaurant restaurant)  {
        Map<Integer, Restaurant> restaurantlist = getAllRestaurant();
        Restaurant restaurantdata = restaurantlist.get(id);
        if(restaurantdata != null){
        restaurantlist.put(id , restaurant);
        return "RestaurantUpdated Successfully";}
        else {
            return "restaurant not found";
        }

    }



    public String deleteRestaurant(Integer id) {
        Map<Integer , Restaurant> restaurantlist = getAllRestaurant();
        Restaurant allrestaurant = restaurantlist.get(id);
        if(allrestaurant != null){
           restaurantlist.remove(id);
           return "Restaurant Deleted Successfully";
        }
        return "Restaurant not found";
    }
}

package com.example.RestaurantApplication.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private Integer restaurantId ;
    private String restaurantName ;
    private String restaurantAddress ;
    private String contactNumber ;
    private String specialty ;
    private Integer totalStaff ;
    private Category restaurantType ;
    private Integer numberofTables ;

}

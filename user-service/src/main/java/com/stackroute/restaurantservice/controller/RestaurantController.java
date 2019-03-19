package com.stackroute.restaurantservice.controller;


import com.stackroute.restaurantservice.domain.Restaurant;
import com.stackroute.restaurantservice.service.RestaurantServiceImpl;
import com.stackroute.restaurantservice.exception.RestaurantAlreadyException;
import com.stackroute.restaurantservice.exception.RestaurantNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin
public class RestaurantController {

    private RestaurantServiceImpl restaurantServiceImpl;

    @Autowired
    public RestaurantController(RestaurantServiceImpl restaurantServiceImpl) {
        this.restaurantServiceImpl = restaurantServiceImpl;
    }

    /*
    This method will save restaurant data into the mysql database
     */
    @PostMapping("/restaurant")
    public ResponseEntity<?> saveRestaurant(@RequestBody Restaurant restaurant) throws RestaurantAlreadyException {
        ResponseEntity responseEntity;
        Restaurant res = null;
        res = restaurantServiceImpl.savedata(restaurant);
        return new ResponseEntity<Restaurant>(res, HttpStatus.CREATED);
    }

    /*
   This method will retrive restaurant data from the mysql database
    */
    @GetMapping("/restaurants")
    public ResponseEntity<?> getAllRestaurant() {
        return new ResponseEntity<List<Restaurant>>(restaurantServiceImpl.getAllUsers(), HttpStatus.ACCEPTED);
    }


}

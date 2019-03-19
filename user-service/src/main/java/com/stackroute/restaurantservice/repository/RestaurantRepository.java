package com.stackroute.restaurantservice.repository;

import com.stackroute.restaurantservice.domain.Restaurant;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

//
//    @Query(value = "SELECT * FROM restaurant", nativeQuery = true)
//    List<Restaurant> findalluser();
//
//    @Query(value = "SELECT res FROM Restaurant res where res.restaurantName =?1")
//    List<Restaurant> findByName(String name);
}

package com.stackroute.restaurantservice.domain;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {


    @Id
    private String restaurantId;
    private String restaurantName;
    private String restaurantLocation;
    private String restaurantImage;
}


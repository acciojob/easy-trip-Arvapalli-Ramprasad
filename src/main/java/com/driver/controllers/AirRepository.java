package com.driver.controllers;

import com.driver.model.Airport;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class AirRepository {
    public HashMap<String, Airport> airportHashMap = new HashMap<>();

    public void addAirPort(Airport airport){
        String key = airport.getAirportName();
        airportHashMap.put(key,airport);
    }

}

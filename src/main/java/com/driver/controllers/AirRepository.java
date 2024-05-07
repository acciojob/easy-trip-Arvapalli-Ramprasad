package com.driver.controllers;

import com.driver.model.Airport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@Repository
public class AirRepository {
    public HashMap<String, Airport> airportHashMap = new HashMap<>();

    public void addAirPort(Airport airport){
        String key = airport.getAirportName();
        airportHashMap.put(key,airport);
    }

    public String getLargestAirPort(){
        ArrayList<String> arr = new ArrayList<>();
        for(String key:airportHashMap.keySet()){
            Airport airport = airportHashMap.get(key);
            int noOfTerminals = airport.getNoOfTerminals();
            int max = Integer.MIN_VALUE;
            if(noOfTerminals>=max){
                max = noOfTerminals;
                arr.add(airport.getAirportName());
            }
        }
        Collections.sort(arr);
        return arr.get(0);
    }

}

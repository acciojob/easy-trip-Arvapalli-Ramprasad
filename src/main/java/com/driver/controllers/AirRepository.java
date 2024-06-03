package com.driver.controllers;
import com.driver.model.Airport;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
@Repository
public class AirRepository {
    public HashMap<String, Airport> airportHashMap = new HashMap<>();
    public HashMap<Integer,Passenger> passengerHashMap = new HashMap<>();
    public HashMap<Integer,Flight> flightHashMap = new HashMap<>();

    public void addAirPort(Airport airport){
        String key = airport.getAirportName();
        airportHashMap.put(key,airport);
    }

    public String getLargestAirPort(){
        ArrayList<String> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(String key:airportHashMap.keySet()){
            Airport airport = airportHashMap.get(key);
            int noOfTerminals = airport.getNoOfTerminals();

            if(noOfTerminals>=max){
                max = noOfTerminals;
                arr.add(airport.getAirportName());
            }
        }
        Collections.sort(arr);
        return arr.get(0);
    }
    public String addPassenger(Passenger passenger){
        int key = passenger.getPassengerId();
        passengerHashMap.put(key,passenger);
        return "SUCCESS";
    }
    public String addFlight(Flight flight){
        int key =flight.getFlightId();
        flightHashMap.put(key,flight);
        return "SUCCESS";
    }

}

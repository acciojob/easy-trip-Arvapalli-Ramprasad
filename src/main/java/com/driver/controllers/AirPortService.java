package com.driver.controllers;

import com.driver.model.Airport;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import org.springframework.stereotype.Service;

@Service
public class AirPortService {
    AirRepository airRepository = new AirRepository();
    public void addAirPort(Airport airport){
        airRepository.addAirPort(airport);
    }
    public String getLargestAirPort(){
        return airRepository.getLargestAirPort();
    }
    public String addPassenger(Passenger passenger){
        return airRepository.addPassenger(passenger);
    }
    public String addFlight(Flight flight){
        return airRepository.addFlight(flight);
    }
}

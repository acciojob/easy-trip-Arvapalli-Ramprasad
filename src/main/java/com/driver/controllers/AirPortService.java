package com.driver.controllers;

import com.driver.model.Airport;
import org.springframework.stereotype.Service;

@Service
public class AirPortService {
    AirRepository airRepository = new AirRepository();
    public void addAirPort(Airport airport){
        airRepository.addAirPort(airport);
    }
}

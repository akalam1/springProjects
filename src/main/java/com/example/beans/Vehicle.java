package com.example.beans;

import com.example.vehicleService.vehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Tomtom";
    private vehicleService vehicleService;

    @Autowired
    public Vehicle(vehicleService  vehicleService){
        this.vehicleService = vehicleService;
    }

    public vehicleService getVehicleService(){
        return vehicleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}

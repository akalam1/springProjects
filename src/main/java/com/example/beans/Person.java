package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private  String name = "Abul";
    // lets get vehicle
    private final Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}


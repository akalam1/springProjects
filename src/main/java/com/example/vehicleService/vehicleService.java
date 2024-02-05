package com.example.vehicleService;

import com.example.interfaces.Tyres;
import com.example.interfaces.speakers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class vehicleService {
    @Autowired
    private speakers speakers;
    private Tyres tyres;


    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void  moveVehicle(){

        String move = tyres.rotate();
        System.out.println(move);

    }


    public com.example.interfaces.speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(com.example.interfaces.speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}

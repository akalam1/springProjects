package com.example.implementation;

import com.example.interfaces.speakers;
import org.springframework.stereotype.Component;

@Component
public class baseSpeaker implements speakers {
    public String makeSound(){
        return "Music Playing from sony Speaker";
    }
}

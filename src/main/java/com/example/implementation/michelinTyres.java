package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class michelinTyres implements Tyres {
    public String rotate(){
        return "Rotating Michelin Tyres";
    }
}

package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class bridgeStoneTyres implements Tyres {
    public String rotate(){
        return "Rotating BridgeStone Tyres";
    }
}

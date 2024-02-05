package com.example.implementation;

import com.example.interfaces.speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class sonySpeakers implements speakers {
    public String makeSound(){

        return "Music Playing from sony Speaker";
    }

}

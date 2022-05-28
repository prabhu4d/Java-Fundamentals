package org.prabhu;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    public void drive(){
        System.out.println("Come on baby let's go on bullet u");
    }
}

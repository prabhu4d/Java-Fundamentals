package com.in28mins.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SuperContraGame implements GamingConsole {

    @Override
    public void up(){
        System.out.println("Up");
    }

    @Override
    public void down(){
        System.out.println("Down");
    }

    @Override
    public void left(){
        System.out.println("Left");
    }

    @Override
    public void right(){
        System.out.println("Right");
    }
}

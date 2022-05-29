package com.in28mins.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    @Override
    public void up(){
        System.out.println("Jump");
    }

    @Override
    public void down(){
        System.out.println("go into a hole");
    }

    @Override
    public void left(){
        System.out.println("stop");
    }

    @Override
    public void right(){
        System.out.println("go faster");
    }
}

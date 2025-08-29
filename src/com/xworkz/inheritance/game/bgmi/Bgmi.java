package com.xworkz.inheritance.game.bgmi;

import com.xworkz.inheritance.game.game.Game;

public class Bgmi extends Game {
    public Bgmi() {
        super();
        System.out.println("Bgmi const is invoked\n");
    }

    @Override
    public  boolean palyGame(){
        System.out.println("Play BGMI \n");
        return true;
    }
}

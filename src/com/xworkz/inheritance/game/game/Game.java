package com.xworkz.inheritance.game.game;

import com.xworkz.inheritance.InheritanceRunner;

public class Game extends InheritanceRunner {

    public Game() {
        super();
        System.out.println("game const is invoked");
    }
    public  boolean palyGame(){
        System.out.println("Play Game");
        return true;
    }
}

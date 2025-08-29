package com.xworkz.inheritance.hero.vishnuvardhan;

import com.xworkz.inheritance.hero.actor.Actor;

public class VishnuVardhan extends Actor {

    public VishnuVardhan() {
        super();
        System.out.println("vishnuverdhan const is invoked\n");
    }

    @Override
    public boolean doActing(){
        System.out.println("Best Actor in 90's..\n");
        return true;
    }
}

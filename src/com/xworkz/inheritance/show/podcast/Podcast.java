package com.xworkz.inheritance.show.podcast;

import com.xworkz.inheritance.show.show.Show;

public class Podcast extends Show {
    public Podcast() {
        super();
        System.out.println("podcast const is invoked\n");
    }
    @Override
    public boolean shareInformation(){
        System.out.println("Share Information and Ideas\n");
        return true;
    }
}

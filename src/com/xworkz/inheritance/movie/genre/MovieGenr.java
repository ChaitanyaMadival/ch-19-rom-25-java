package com.xworkz.inheritance.movie.genre;

import com.xworkz.inheritance.InheritanceRunner;

public class MovieGenr extends InheritanceRunner {

    public MovieGenr() {
        super();
        System.out.println("movie genre const is invoked");
    }

    public boolean watchMovie(){
        System.out.println("Genre of the Movie");
        return true;
    }
}

package com.xworkz.inheritance.movie.comedy;

import com.xworkz.inheritance.movie.genre.MovieGenr;

public class Comedy extends MovieGenr {
    public Comedy() {
        super();
        System.out.println("comedy const is invoked\n");
    }

    @Override
    public boolean watchMovie(){
        System.out.println("Genre of the Movie is Comedy");
        return true;
    }
}

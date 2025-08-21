package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Movie movie = new Movie();
        movie.setMovieId("2CR7");
        movie.setTitle("Vikram");
        movie.setGenre("Action");
        movie.setLanguage("Tamil");
        movie.setDirector("Loki");
        movie.setProducer("kamal haasan");
        movie.setReleaseDate("2022");
        movie.setRating("9.5");

        Theatre theater = new Theatre();
        theater.createMovieInfo(movie);
        theater.fetchMovieInfo();

        System.out.println("main ended");
    }
}

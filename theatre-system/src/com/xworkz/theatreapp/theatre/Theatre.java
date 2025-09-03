package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.validation.MovieValidation;

public class Theatre {
//    Movie movie;
//
//    public boolean createMovieInfo(Movie movie){
//        boolean isMovieInfoCreated = false;
//
//        boolean isCreateMovieInfoValidated;
//
//        MovieValidation movieValid = new MovieValidation();
//        isMovieInfoCreated = movieValid.validateMovie(movie);
//
//        if(isMovieInfoCreated){
//            this.movie = movie;
//        }
//
//        return isMovieInfoCreated;
//    }

    Movie[] movies = new Movie[10];
    int index;

    public  boolean addMovie(Movie movie){
        boolean isMovieAdded = false;

        if(movies != null){
            movies[index++] = movie;
            isMovieAdded = true;
        }
        return isMovieAdded;
    }



    public void fetchMovieInfo() {
        for (Movie movie : movies) {

            System.out.println("movie id : " + movie.getMovieId());
            System.out.println("title : " + movie.getTitle());
            System.out.println("genre : " + movie.getGenre());
            System.out.println("language : " + movie.getLanguage());
            System.out.println("director : " + movie.getDirector());
            System.out.println("producer : " + movie.getProducer());
            System.out.println("release date : " + movie.getReleaseDate());
            System.out.println("rating  : " + movie.getRating());
            System.out.println("-------------------");
        }
    }
}

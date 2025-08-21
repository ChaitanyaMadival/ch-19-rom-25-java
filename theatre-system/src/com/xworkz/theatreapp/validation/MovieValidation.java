package com.xworkz.theatreapp.validation;

import com.xworkz.theatreapp.movie.Movie;

public class MovieValidation {
    public  boolean validateMovie(Movie movie){
        boolean isMovieValidated = false;

        boolean movieIdValidated = false;
        boolean titleValidated = false;
        boolean genreValidated = false;
        boolean languageValidated = false;
        boolean directorValidated = false;
        boolean producerValidated = false;
        boolean releaseDateValidated = false;
        boolean ratingValidated = false;

        if(movie.getMovieId() != null && !movie.getMovieId().isEmpty()){
            movieIdValidated = true;
        }else {
            System.out.println("movie id is not valid/empty");
        }
        if(movie.getTitle() != null && !movie.getTitle().isEmpty()){
            titleValidated = true;
        }else {
            System.out.println("title is not valid/empty");
        }
        if(movie.getGenre() != null && !movie.getGenre().isEmpty()){
            genreValidated = true;
        }else {
            System.out.println("genre is not valid/empty");
        }
        if(movie.getLanguage() != null && !movie.getLanguage().isEmpty()){
            languageValidated = true;
        }else {
            System.out.println("Language is not valid/empty");
        }
        if(movie.getDirector() != null && !movie.getDirector().isEmpty()){
            directorValidated = true;
        }else {
            System.out.println("director is not valid/empty");
        }
        if (movie.getProducer() != null && !movie.getProducer().isEmpty()){
            producerValidated = true;
        }else {
            System.out.println("producer is not valid/empty");
        }
        if (movie.getReleaseDate() != null && !movie.getReleaseDate().isEmpty()){
            releaseDateValidated = true;
        }else {
            System.out.println("release date is noty valid/empty");
        }
        if(movie.getRating() != null && !movie.getRating().isEmpty()) {
            ratingValidated = true;
        }else {
            System.out.println("rating is not valid/empty");
        }
        if(movieIdValidated && titleValidated && genreValidated && languageValidated && directorValidated && producerValidated && releaseDateValidated && ratingValidated){
            isMovieValidated = true;
        }

        return  isMovieValidated;
    }
}

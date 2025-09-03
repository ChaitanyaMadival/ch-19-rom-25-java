package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Movie movie1 = new Movie();
        movie1.setMovieId("2CR7");
        movie1.setTitle("Vikram");
        movie1.setGenre("Action");
        movie1.setLanguage("Tamil");
        movie1.setDirector("Loki");
        movie1.setProducer("Kamal Haasan");
        movie1.setReleaseDate("2022");
        movie1.setRating("9.5");

        Movie movie2 = new Movie();
        movie2.setMovieId("3PKL");
        movie2.setTitle("RRR");
        movie2.setGenre("Action/Drama");
        movie2.setLanguage("Telugu");
        movie2.setDirector("S. S. Rajamouli");
        movie2.setProducer("D. V. V. Danayya");
        movie2.setReleaseDate("2022");
        movie2.setRating("9.2");

        Movie movie3 = new Movie();
        movie3.setMovieId("4DFX");
        movie3.setTitle("Kantara");
        movie3.setGenre("Action/Thriller");
        movie3.setLanguage("Kannada");
        movie3.setDirector("Rishab Shetty");
        movie3.setProducer("Vijay Kiragandur");
        movie3.setReleaseDate("2022");
        movie3.setRating("9.1");

        Movie movie4 = new Movie();
        movie4.setMovieId("5MNQ");
        movie4.setTitle("Pathaan");
        movie4.setGenre("Action/Spy");
        movie4.setLanguage("Hindi");
        movie4.setDirector("Siddharth Anand");
        movie4.setProducer("Aditya Chopra");
        movie4.setReleaseDate("2023");
        movie4.setRating("8.3");

        Movie movie5 = new Movie();
        movie5.setMovieId("6ABX");
        movie5.setTitle("Jawan");
        movie5.setGenre("Action/Drama");
        movie5.setLanguage("Hindi");
        movie5.setDirector("Atlee");
        movie5.setProducer("Gauri Khan");
        movie5.setReleaseDate("2023");
        movie5.setRating("8.7");

        Movie movie6 = new Movie();
        movie6.setMovieId("7ZXC");
        movie6.setTitle("Leo");
        movie6.setGenre("Action/Thriller");
        movie6.setLanguage("Tamil");
        movie6.setDirector("Lokesh Kanagaraj");
        movie6.setProducer("Lalit Kumar");
        movie6.setReleaseDate("2023");
        movie6.setRating("8.9");

        Movie movie7 = new Movie();
        movie7.setMovieId("8TRS");
        movie7.setTitle("Pushpa: The Rise");
        movie7.setGenre("Action/Drama");
        movie7.setLanguage("Telugu");
        movie7.setDirector("Sukumar");
        movie7.setProducer("Naveen Yerneni");
        movie7.setReleaseDate("2021");
        movie7.setRating("8.6");

        Movie movie8 = new Movie();
        movie8.setMovieId("9OPL");
        movie8.setTitle("Baahubali 2");
        movie8.setGenre("Action/Fantasy");
        movie8.setLanguage("Telugu");
        movie8.setDirector("S. S. Rajamouli");
        movie8.setProducer("Shobu Yarlagadda");
        movie8.setReleaseDate("2017");
        movie8.setRating("9.0");

        Movie movie9 = new Movie();
        movie9.setMovieId("10QWE");
        movie9.setTitle("Drishyam 2");
        movie9.setGenre("Crime/Thriller");
        movie9.setLanguage("Hindi");
        movie9.setDirector("Abhishek Pathak");
        movie9.setProducer("Bhushan Kumar");
        movie9.setReleaseDate("2022");
        movie9.setRating("8.4");

        Movie movie10 = new Movie();
        movie10.setMovieId("11BNY");
        movie10.setTitle("KGF: Chapter 2");
        movie10.setGenre("Action");
        movie10.setLanguage("Kannada");
        movie10.setDirector("Prashanth Neel");
        movie10.setProducer("Vijay Kiragandur");
        movie10.setReleaseDate("2022");
        movie10.setRating("9.3");


        Theatre theater = new Theatre();
//        theater.createMovieInfo(movie);

        theater.addMovie(movie1);
        theater.addMovie(movie2);
        theater.addMovie(movie3);
        theater.addMovie(movie4);
        theater.addMovie(movie5);
        theater.addMovie(movie6);
        theater.addMovie(movie7);
        theater.addMovie(movie8);
        theater.addMovie(movie9);
        theater.addMovie(movie10);


        theater.fetchMovieInfo();

        System.out.println("main ended");
    }
}

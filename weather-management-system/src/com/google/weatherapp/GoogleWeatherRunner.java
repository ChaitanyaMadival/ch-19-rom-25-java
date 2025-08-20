package com.google.weatherapp;

import com.google.weatherapp.weather.GoogleWeather;

public class GoogleWeatherRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        GoogleWeather weather = new GoogleWeather();

        weather.setLocation("Sirsi");
        weather.setLocationTemperature("22 C");
        weather.setModeOfWeather("Cloudy");

        String location = weather.getLocation();
        String temperature = weather.getLocationTemperature();
        String weatherMode = weather.getModeOfWeather();

        System.out.println("Weather Location: "+location);
        System.out.println("Temperature: "+temperature);
        System.out.println("Mode of weather: "+weatherMode);




        System.out.println("main ended");
    }
}

package com.google.weatherapp.weather;

public class GoogleWeather {
    private  String location;
    private  String locationTemperature;
    private  String modeOfWeather;

    public String getLocation() {
        return location;
    }

    public String getLocationTemperature() {
        return locationTemperature;
    }

    public String getModeOfWeather() {
        return modeOfWeather;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLocationTemperature(String locationTemperature) {
        this.locationTemperature = locationTemperature;
    }

    public void setModeOfWeather(String modeOfWeather) {
        this.modeOfWeather = modeOfWeather;
    }
}

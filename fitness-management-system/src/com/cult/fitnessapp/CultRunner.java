package com.cult.fitnessapp;

import com.cult.fitnessapp.cult.Cult;

public class CultRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Cult gym = new Cult();

        gym.setGymId(1);
        gym.setGymLocation("Rajajinagar");
        gym.setGymPrice(599.0);
        gym.setNumberOfTrainers(3);
        gym.setTrannerName("Dev");

        int gymId = gym.getGymId();
        String gymLocation = gym.getGymLocation();
        double gymPrice = gym.getGymPrice();
        int numberOfTrainers = gym.getNumberOfTrainers();
        String trainerName = gym.getTrannerName();

        System.out.println("Gym ID: "+gymId);
        System.out.println("Gym Location: "+gymLocation);
        System.out.println("Price: "+gymPrice);
        System.out.println("Number of Trainers: "+numberOfTrainers);
        System.out.println("Trainer Name: "+trainerName);

        System.out.println("main ended");
    }
}

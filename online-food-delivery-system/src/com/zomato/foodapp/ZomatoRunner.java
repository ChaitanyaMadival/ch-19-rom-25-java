package com.zomato.foodapp;

import com.zomato.foodapp.zomato.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Zomato food = new Zomato();

        food.setFoodId(1);
        food.setFoodName("Biryani");
        food.setFoodPrice(150.0);

        int foodId = food.getFoodId();
        String foodName = food.getFoodName();
        double foodPrice = food.getFoodPrice();

        System.out.println("Food ID: "+foodId);
        System.out.println("Food Name: "+foodName);
        System.out.println("Food Price: "+foodPrice);

        System.out.println("main ended");
    }
}

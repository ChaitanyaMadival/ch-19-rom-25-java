package com.xworkz.watchshop.shop;

import com.xworkz.watchshop.watch.Watch;

public class WatchShop {

    Watch[] watches=new Watch[9];
    int index;


    public boolean addWatches(Watch watch){

        boolean isAdded=false;

        if (watch !=null){
             watches[index++]=watch;
             isAdded=true;

        }
        else {
            System.out.println("invalid watch");
        }
        return isAdded;

    }
    public void getWatches(){
        for (Watch watch :watches){
            System.out.println("the watch name is "+watch.getWatchName());
            System.out.println("the id is "+watch.getWatchId());
            System.out.println("the price is "+watch.getWatchPrice());
            System.out.println("-------------");
        }
    }
}

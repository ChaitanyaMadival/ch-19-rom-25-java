package com.xworkz.watchshop;

import com.xworkz.watchshop.shop.WatchShop;
import com.xworkz.watchshop.watch.Watch;

public class ShopRunner {
    public static void main(String[] args) {
        Watch watch=new Watch();
        watch.setWatchName("Titan");
        watch.setWatchId(1);
        watch.setWatchPrice(20000);

        Watch watch1 = new Watch();
        watch1.setWatchId(9);
        watch1.setWatchName("fasterk");
        watch1.setWatchPrice(7000);

        Watch watch2 = new Watch();
        watch2.setWatchId(2);
        watch2.setWatchName("Fossil");
        watch2.setWatchPrice(15000);

        Watch watch3 = new Watch();
        watch3.setWatchId(3);
        watch3.setWatchName("Rolex");
        watch3.setWatchPrice(500000);

        Watch watch4 = new Watch();
        watch4.setWatchId(4);
        watch4.setWatchName("Casio");
        watch4.setWatchPrice(12000);

        Watch watch5 = new Watch();
        watch5.setWatchId(5);
        watch5.setWatchName("Seiko");
        watch5.setWatchPrice(25000);

        Watch watch6 = new Watch();
        watch6.setWatchId(6);
        watch6.setWatchName("Omega");
        watch6.setWatchPrice(300000);

        Watch watch7 = new Watch();
        watch7.setWatchId(7);
        watch7.setWatchName("Hublot");
        watch7.setWatchPrice(700000);

        Watch watch8 = new Watch();
        watch8.setWatchId(8);
        watch8.setWatchName("Tissot");
        watch8.setWatchPrice(18000);


        WatchShop watchShop=new WatchShop();
        watchShop.addWatches(watch);
        watchShop.addWatches(watch1);
        watchShop.addWatches(watch2);
        watchShop.addWatches(watch3);
        watchShop.addWatches(watch4);
        watchShop.addWatches(watch5);
        watchShop.addWatches(watch6);
        watchShop.addWatches(watch7);
        watchShop.addWatches(watch8);

        watchShop.getWatches();


    }
}

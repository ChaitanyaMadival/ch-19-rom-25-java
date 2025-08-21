package com.xworkz.store;

import com.xworkz.store.app.Application;
import com.xworkz.store.playstore.PlayStore;
import com.xworkz.store.validation.AppValidation;

public class PlayStoreRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Application application = new Application();
        application.setAppVersion("2.25.21.82");
        application.setAppUpdatedOn("4 Aug 2025");
        application.setAppDownloads("10,00,00,00,000+ downloads");
        application.setAppUpdateSize("12.75 MB");
        application.setRequiredOs("Android 5.0 and up");
        application.setInAppPurchases("50.00 - 2000.00 per item");
        application.setOfferedBy("Whatsapp LLC");
        application.setReleaseOn("18 Oct 2010");


        //Runner is related to play store
        PlayStore appValidation = new PlayStore();
        appValidation.addApplication(application);
        appValidation.getUserDetails();



        System.out.println("main ended");
    }

}

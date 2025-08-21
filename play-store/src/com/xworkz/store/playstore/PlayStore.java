package com.xworkz.store.playstore;

import com.xworkz.store.app.Application;
import com.xworkz.store.validation.AppValidation;

public class PlayStore {
    Application application;

    //create application
    //play store class is related with the validator internally

    //add, save, createApplication

    public  boolean addApplication(Application application){
        boolean isApplicationAdded = false;
        boolean isApplicationInfoValid = false;


        //to invoke the instance method we need to create the object
        AppValidation appValidator = new AppValidation();

        isApplicationInfoValid = appValidator.validateApplicationInfo(application);

        if(isApplicationInfoValid){
           this.application = application;
            isApplicationAdded = true;
        }else{
            System.out.println("Application is not added");
        }
        return  isApplicationAdded;
    }


    public void getUserDetails() {
        System.out.println("Version : "+application.getAppVersion());
        System.out.println("Updated On : "+application.getAppUpdatedOn());
        System.out.println("Downloads : "+application.getAppDownloads());
        System.out.println("Updated Size : "+application.getAppUpdateSize());
        System.out.println("Required OS : "+application.getRequiredOs());
        System.out.println("In app purchase : "+application.getInAppPurchases());
        System.out.println("Offered by : "+application.getOfferedBy());
        System.out.println("Release on : "+application.getReleaseOn());

    }
}

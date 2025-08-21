package com.xworkz.store.validation;

import com.xworkz.store.app.Application;

public class AppValidation {

    public  boolean validateApplicationInfo(Application application){
        boolean appValidated = false;

        boolean versionValidated = false;
        boolean updatedOnValidated = false;
        boolean downloadsValidated = false;
        boolean updatedSizeValidated = false;
        boolean requireOsValidated = false;
        boolean inAppPurchaseValidated = false;
        boolean offeredByValidated = false;
        boolean releaseOnValidated = false;


        if(application.getAppVersion() != null && !application.getAppVersion().isEmpty()){
            versionValidated = true;
        }else {
            System.out.println("Version is not valid/empty");
        }
        if(application.getAppUpdatedOn() != null &&!application.getAppUpdatedOn().isEmpty()){
            updatedOnValidated = true;
        }else {
            System.out.println("Updated on is not valid/empty");
        }
        if(application.getAppDownloads() != null && !application.getAppDownloads().isEmpty()){
            downloadsValidated = true;
        }else {
            System.out.println("Download is not valid/empty");
        }
        if(application.getAppUpdateSize() != null && !application.getAppUpdateSize().isEmpty()){
            updatedSizeValidated = true;
        }else {
            System.out.println("Updated size is not valid/empty");
        }
        if(application.getRequiredOs() != null && !application.getRequiredOs().isEmpty()){
            requireOsValidated = true;
        }else {
            System.out.println("Require OS is not valid/empty");
        }
        if(application.getInAppPurchases() != null && !application.getInAppPurchases().isEmpty()){
            inAppPurchaseValidated = true;
        }else {
            System.out.println("In app purchase valid/empty");
        }
        if(application.getOfferedBy() != null && !application.getOfferedBy().isEmpty()){
            offeredByValidated = true;
        }else {
            System.out.println("Offered by is not valid/empty");
        }
        if(application.getReleaseOn() != null && !application.getReleaseOn().isEmpty()){
            releaseOnValidated = true;
        }else {
            System.out.println("Realise on is not valid/empty");
        }
        if(versionValidated && updatedOnValidated && downloadsValidated && updatedSizeValidated && requireOsValidated && inAppPurchaseValidated && offeredByValidated && releaseOnValidated){
            appValidated = true;
          //  this.application = application;
        }
        return  appValidated;

    }


}

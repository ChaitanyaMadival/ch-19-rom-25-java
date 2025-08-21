package com.xworkz.store.app;

public class Application {
    private  String appVersion;
    private  String appUpdatedOn;
    private  String appDownloads;
    private  String appUpdateSize;
    private  String requiredOs;
    private  String inAppPurchases;
    private  String offeredBy;
    private  String releaseOn;


    public String getAppVersion() {
        return appVersion;
    }

    public String getAppUpdatedOn() {
        return appUpdatedOn;
    }

    public String getAppDownloads() {
        return appDownloads;
    }

    public String getAppUpdateSize() {
        return appUpdateSize;
    }

    public String getRequiredOs() {
        return requiredOs;
    }

    public String getInAppPurchases() {
        return inAppPurchases;
    }

    public String getOfferedBy() {
        return offeredBy;
    }

    public String getReleaseOn() {
        return releaseOn;
    }


    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public void setAppUpdatedOn(String appUpdatedOn) {
        this.appUpdatedOn = appUpdatedOn;
    }

    public void setAppDownloads(String appDownloads) {
        this.appDownloads = appDownloads;
    }

    public void setAppUpdateSize(String appUpdateSize) {
        this.appUpdateSize = appUpdateSize;
    }

    public void setRequiredOs(String requiredOs) {
        this.requiredOs = requiredOs;
    }

    public void setInAppPurchases(String inAppPurchases) {
        this.inAppPurchases = inAppPurchases;
    }

    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }

    public void setReleaseOn(String releaseOn) {
        this.releaseOn = releaseOn;
    }
}

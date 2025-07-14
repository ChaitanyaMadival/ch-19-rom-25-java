public class Market {

    static String marketName;
    static String location;
    static int numberOfShops;
    static boolean isOpenToday;
    static double averageDailyRevenue;
    static String famousFor;

    public static String getMarketName() {
        marketName = "City Central Market";
        return marketName;
    }

    public static String getLocation() {
        location = "Rajajinagar";
        return location;
    }

    public static int getNumberOfShops() {
        numberOfShops = 150;
        return numberOfShops;
    }

    public static boolean getIsOpenToday() {
        isOpenToday = true;
        return isOpenToday;
    }

    public static double getAverageDailyRevenue() {
        averageDailyRevenue = 150000.75;
        return averageDailyRevenue;
    }

    public static String getFamousFor() {
        famousFor = "Fresh Vegetables";
        return famousFor;
    }
}

class MarketRunner {

    public static void main(String market[]) {
        System.out.println("Main Started");

        String name = Market.getMarketName();
        System.out.println("Market Name: " + name);

        String location = Market.getLocation();
        System.out.println("Location: " + location);

        int shops = Market.getNumberOfShops();
        System.out.println("Number of Shops: " + shops);

        boolean isOpen = Market.getIsOpenToday();
        System.out.println("Is Market Open Today: " + isOpen);

        double revenue = Market.getAverageDailyRevenue();
        System.out.println("Average Daily Revenue: " + revenue);

        String famousFor = Market.getFamousFor();
        System.out.println("Famous For: " + famousFor);

        System.out.println("Main Ended");
    }
}

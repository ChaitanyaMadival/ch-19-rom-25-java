class GoldRunner {

    public static void main(String gold[]) {
        System.out.println("Main Started");

        String purity = Gold.getPurityGrade();
        System.out.println("Purity Grade: " + purity);

        double weight = Gold.getWeightInGrams();
        System.out.println("Weight: " + weight + " grams");

        double price = Gold.getPricePerGram();
        System.out.println("Price per Gram: " + price);

        String origin = Gold.getOriginCountry();
        System.out.println("Origin Country: " + origin);

        boolean certified = Gold.getIsCertified();
        System.out.println("Is Certified: " + certified);

        String jeweler = Gold.getJewelerName();
        System.out.println("Jeweler Name: " + jeweler);

        System.out.println("Main Ended");
    }
}

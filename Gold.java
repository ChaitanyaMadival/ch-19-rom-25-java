class Gold {

    static String purityGrade;
    static double weightInGrams;
    static double pricePerGram;
    static String originCountry;
    static boolean isCertified;
    static String jewelerName;

    public static String getPurityGrade() {
        purityGrade = "24K";
        return purityGrade;
    }

    public static double getWeightInGrams() {
        weightInGrams = 50.0;
        return weightInGrams;
    }

    public static double getPricePerGram() {
        pricePerGram = 4800.75;
        return pricePerGram;
    }

    public static String getOriginCountry() {
        originCountry = "India";
        return originCountry;
    }

    public static boolean getIsCertified() {
        isCertified = true;
        return isCertified;
    }

    public static String getJewelerName() {
        jewelerName = "Tanishq";
        return jewelerName;
    }
}

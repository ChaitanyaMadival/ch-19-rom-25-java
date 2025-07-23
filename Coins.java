class Coins {
    int coinId;
    String coinName;
    double coinValue;
    boolean isRare;
    String countryName;  
    long mintedYear;

    public void getCoin() {
        System.out.println("Coin ID: " + coinId);
        System.out.println("Coin Name: " + coinName);
        System.out.println("Coin Value: $" + coinValue);
        System.out.println("Is Rare: " + isRare);
        System.out.println("Country Name: " + countryName);
        System.out.println("Minted Year: " + mintedYear);
        System.out.println("----------------");
    }
}

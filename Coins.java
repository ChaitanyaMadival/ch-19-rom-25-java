public class Coins {
    int coinId;
    String coinName;
    double coinValue;
    boolean isRare;
    String countryName;
    long mintedYear;

    // Constructor to initialize all attributes
    public Coins(int coinId, String coinName, double coinValue, boolean isRare, String countryName, long mintedYear) {
        this.coinId = coinId;
        this.coinName = coinName;
        this.coinValue = coinValue;
        this.isRare = isRare;
        this.countryName = countryName;
        this.mintedYear = mintedYear;
    }

    public void getCoin() {
        System.out.println("Coin Id: " + coinId);
        System.out.println("Coin Name: " + coinName);
        System.out.println("Coin Value: " + coinValue);
        System.out.println("Is Rare: " + isRare);
        System.out.println("Country: " + countryName);
        System.out.println("Minted Year: " + mintedYear);
        System.out.println("-----------------");
    }
}

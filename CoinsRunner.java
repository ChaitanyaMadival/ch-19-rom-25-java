public class CoinsRunner {
    public static void main(String coin[]) {
        System.out.println("Main Started");

        Coins coin1 = new Coins(1, "Penny", 0.01, false, "USA", 2000L);
        coin1.getCoin();

        Coins coin2 = new Coins(2, "Dime", 0.10, false, "USA", 1995L);
        coin2.getCoin();

        Coins coin3 = new Coins(3, "Euro Cent", 0.01, false, "European Union", 2010L);
        coin3.getCoin();

        Coins coin4 = new Coins(4, "Yen", 1.0, false, "Japan", 2005L);
        coin4.getCoin();

        Coins coin5 = new Coins(5, "Rupee", 1.0, true, "India", 2015L);
        coin5.getCoin();

        Coins coin6 = new Coins(6, "Franc", 0.50, false, "Switzerland", 2003L);
        coin6.getCoin();

        Coins coin7 = new Coins(7, "Lira", 0.20, true, "Italy", 1980L);
        coin7.getCoin();

        Coins coin8 = new Coins(8, "Krona", 0.10, false, "Sweden", 2012L);
        coin8.getCoin();

        Coins coin9 = new Coins(9, "Won", 1.0, false, "South Korea", 2016L);
        coin9.getCoin();

        Coins coin10 = new Coins(10, "Peso", 0.05, true, "Mexico", 1999L);
        coin10.getCoin();

        Coins coin11 = new Coins(11, "Dollar Coin", 1.0, false, "USA", 2018L);
        coin11.getCoin();

        Coins coin12 = new Coins(12, "Dirham", 0.25, false, "UAE", 2011L);
        coin12.getCoin();

        Coins coin13 = new Coins(13, "Dinar", 0.50, false, "Kuwait", 2009L);
        coin13.getCoin();

        Coins coin14 = new Coins(14, "Riel", 0.01, true, "Cambodia", 2004L);
        coin14.getCoin();

        Coins coin15 = new Coins(15, "Taka", 0.05, false, "Bangladesh", 2013L);
        coin15.getCoin();

        Coins coin16 = new Coins(16, "Lempira", 0.10, false, "Honduras", 2010L);
        coin16.getCoin();

        Coins coin17 = new Coins(17, "Shilling", 0.20, true, "Kenya", 2007L);
        coin17.getCoin();

        Coins coin18 = new Coins(18, "Dobra", 0.05, false, "Sao Tome", 2001L);
        coin18.getCoin();

        Coins coin19 = new Coins(19, "Rupee", 0.50, true, "Pakistan", 2006L);
        coin19.getCoin();

        Coins coin20 = new Coins(20, "Drachma", 0.10, false, "Greece", 1985L);
        coin20.getCoin();

        System.out.println("Main Ended");
    }
}

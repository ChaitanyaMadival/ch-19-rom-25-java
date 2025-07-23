class CoinsRunner {
    public static void main(String coin[]) {
        System.out.println("Main Started");

        Coins coin1 = new Coins();
        coin1.coinId = 1;
        coin1.coinName = "Penny";
        coin1.coinValue = 0.01;
        coin1.isRare = false;
        coin1.countryName = "USA";
        coin1.mintedYear = 2000L;
        coin1.getCoin();

        Coins coin2 = new Coins();
        coin2.coinId = 2;
        coin2.coinName = "Dime";
        coin2.coinValue = 0.10;
        coin2.isRare = false;
        coin2.countryName = "USA";
        coin2.mintedYear = 1995L;
        coin2.getCoin();

        Coins coin3 = new Coins();
        coin3.coinId = 3;
        coin3.coinName = "Euro Cent";
        coin3.coinValue = 0.01;
        coin3.isRare = false;
        coin3.countryName = "European Union";
        coin3.mintedYear = 2010L;
        coin3.getCoin();

        Coins coin4 = new Coins();
        coin4.coinId = 4;
        coin4.coinName = "Yen";
        coin4.coinValue = 1.0;
        coin4.isRare = false;
        coin4.countryName = "Japan";
        coin4.mintedYear = 2005L;
        coin4.getCoin();

        Coins coin5 = new Coins();
        coin5.coinId = 5;
        coin5.coinName = "Rupee";
        coin5.coinValue = 1.0;
        coin5.isRare = true;
        coin5.countryName = "India";
        coin5.mintedYear = 2015L;
        coin5.getCoin();

        Coins coin6 = new Coins();
        coin6.coinId = 6;
        coin6.coinName = "Franc";
        coin6.coinValue = 0.50;
        coin6.isRare = false;
        coin6.countryName = "Switzerland";
        coin6.mintedYear = 2003L;
        coin6.getCoin();

        Coins coin7 = new Coins();
        coin7.coinId = 7;
        coin7.coinName = "Lira";
        coin7.coinValue = 0.20;
        coin7.isRare = true;
        coin7.countryName = "Italy";
        coin7.mintedYear = 1980L;
        coin7.getCoin();

        Coins coin8 = new Coins();
        coin8.coinId = 8;
        coin8.coinName = "Krona";
        coin8.coinValue = 0.10;
        coin8.isRare = false;
        coin8.countryName = "Sweden";
        coin8.mintedYear = 2012L;
        coin8.getCoin();

        Coins coin9 = new Coins();
        coin9.coinId = 9;
        coin9.coinName = "Won";
        coin9.coinValue = 1.0;
        coin9.isRare = false;
        coin9.countryName = "South Korea";
        coin9.mintedYear = 2016L;
        coin9.getCoin();

        Coins coin10 = new Coins();
        coin10.coinId = 10;
        coin10.coinName = "Peso";
        coin10.coinValue = 0.05;
        coin10.isRare = true;
        coin10.countryName = "Mexico";
        coin10.mintedYear = 1999L;
        coin10.getCoin();

        Coins coin11 = new Coins();
        coin11.coinId = 11;
        coin11.coinName = "Dollar Coin";
        coin11.coinValue = 1.0;
        coin11.isRare = false;
        coin11.countryName = "USA";
        coin11.mintedYear = 2018L;
        coin11.getCoin();

        Coins coin12 = new Coins();
        coin12.coinId = 12;
        coin12.coinName = "Dirham";
        coin12.coinValue = 0.25;
        coin12.isRare = false;
        coin12.countryName = "UAE";
        coin12.mintedYear = 2011L;
        coin12.getCoin();

        Coins coin13 = new Coins();
        coin13.coinId = 13;
        coin13.coinName = "Dinar";
        coin13.coinValue = 0.50;
        coin13.isRare = false;
        coin13.countryName = "Kuwait";
        coin13.mintedYear = 2009L;
        coin13.getCoin();

        Coins coin14 = new Coins();
        coin14.coinId = 14;
        coin14.coinName = "Riel";
        coin14.coinValue = 0.01;
        coin14.isRare = true;
        coin14.countryName = "Cambodia";
        coin14.mintedYear = 2004L;
        coin14.getCoin();

        Coins coin15 = new Coins();
        coin15.coinId = 15;
        coin15.coinName = "Taka";
        coin15.coinValue = 0.05;
        coin15.isRare = false;
        coin15.countryName = "Bangladesh";
        coin15.mintedYear = 2013L;
        coin15.getCoin();

        Coins coin16 = new Coins();
        coin16.coinId = 16;
        coin16.coinName = "Lempira";
        coin16.coinValue = 0.10;
        coin16.isRare = false;
        coin16.countryName = "Honduras";
        coin16.mintedYear = 2010L;
        coin16.getCoin();

        Coins coin17 = new Coins();
        coin17.coinId = 17;
        coin17.coinName = "Shilling";
        coin17.coinValue = 0.20;
        coin17.isRare = true;
        coin17.countryName = "Kenya";
        coin17.mintedYear = 2007L;
        coin17.getCoin();

        Coins coin18 = new Coins();
        coin18.coinId = 18;
        coin18.coinName = "Dobra";
        coin18.coinValue = 0.05;
        coin18.isRare = false;
        coin18.countryName = "Sao Tome";
        coin18.mintedYear = 2001L;
        coin18.getCoin();

        Coins coin19 = new Coins();
        coin19.coinId = 19;
        coin19.coinName = "Rupee";
        coin19.coinValue = 0.50;
        coin19.isRare = true;
        coin19.countryName = "Pakistan";
        coin19.mintedYear = 2006L;
        coin19.getCoin();

        Coins coin20 = new Coins();
        coin20.coinId = 20;
        coin20.coinName = "Drachma";
        coin20.coinValue = 0.10;
        coin20.isRare = false;
        coin20.countryName = "Greece";
        coin20.mintedYear = 1985L;
        coin20.getCoin();

        System.out.println("Main Ended");
    }
}

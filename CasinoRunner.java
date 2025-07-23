class CasinoRunner{

    public static void main(String casino[]) {
        System.out.println("Main Started");

        Casino bellagio = new Casino();
        bellagio.id = 1;
        bellagio.name = "Bellagio";
        bellagio.location = "Las Vegas";
        bellagio.numberOfTables = 140;
        bellagio.hasHotel = true;
        bellagio.getCasinoDetails();

        Casino venetian = new Casino();
        venetian.id = 2;
        venetian.name = "Venetian Macao";
        venetian.location = "Macau";
        venetian.numberOfTables = 500;
        venetian.hasHotel = true;
        venetian.getCasinoDetails();

        Casino wynn = new Casino();
        wynn.id = 3;
        wynn.name = "Wynn";
        wynn.location = "Las Vegas";
        wynn.numberOfTables = 180;
        wynn.hasHotel = true;
        wynn.getCasinoDetails();

        Casino monteCarlo = new Casino();
        monteCarlo.id = 4;
        monteCarlo.name = "Monte Carlo Casino";
        monteCarlo.location = "Monaco";
        monteCarlo.numberOfTables = 100;
        monteCarlo.hasHotel = false;
        monteCarlo.getCasinoDetails();

        Casino foxwoods = new Casino();
        foxwoods.id = 5;
        foxwoods.name = "Foxwoods";
        foxwoods.location = "Connecticut";
        foxwoods.numberOfTables = 250;
        foxwoods.hasHotel = true;
        foxwoods.getCasinoDetails();

        Casino mgm = new Casino();
        mgm.id = 6;
        mgm.name = "MGM Grand";
        mgm.location = "Las Vegas";
        mgm.numberOfTables = 170;
        mgm.hasHotel = true;
        mgm.getCasinoDetails();

        Casino borgata = new Casino();
        borgata.id = 7;
        borgata.name = "Borgata";
        borgata.location = "Atlantic City";
        borgata.numberOfTables = 200;
        borgata.hasHotel = true;
        borgata.getCasinoDetails();

        Casino cityOfDreams = new Casino();
        cityOfDreams.id = 8;
        cityOfDreams.name = "City of Dreams";
        cityOfDreams.location = "Macau";
        cityOfDreams.numberOfTables = 420;
        cityOfDreams.hasHotel = true;
        cityOfDreams.getCasinoDetails();

        Casino sands = new Casino();
        sands.id = 9;
        sands.name = "Sands Casino";
        sands.location = "Macau";
        sands.numberOfTables = 300;
        sands.hasHotel = true;
        sands.getCasinoDetails();

        Casino crown = new Casino();
        crown.id = 10;
        crown.name = "Crown Casino";
        crown.location = "Melbourne";
        crown.numberOfTables = 350;
        crown.hasHotel = true;
        crown.getCasinoDetails();

        Casino resortWorld = new Casino();
        resortWorld.id = 11;
        resortWorld.name = "Resorts World";
        resortWorld.location = "Singapore";
        resortWorld.numberOfTables = 250;
        resortWorld.hasHotel = true;
        resortWorld.getCasinoDetails();

        Casino tropicana = new Casino();
        tropicana.id = 12;
        tropicana.name = "Tropicana";
        tropicana.location = "Las Vegas";
        tropicana.numberOfTables = 90;
        tropicana.hasHotel = true;
        tropicana.getCasinoDetails();

        Casino goldenNugget = new Casino();
        goldenNugget.id = 13;
        goldenNugget.name = "Golden Nugget";
        goldenNugget.location = "Las Vegas";
        goldenNugget.numberOfTables = 70;
        goldenNugget.hasHotel = true;
        goldenNugget.getCasinoDetails();

        Casino aria = new Casino();
        aria.id = 14;
        aria.name = "Aria";
        aria.location = "Las Vegas";
        aria.numberOfTables = 150;
        aria.hasHotel = true;
        aria.getCasinoDetails();

        Casino caesars = new Casino();
        caesars.id = 15;
        caesars.name = "Caesars Palace";
        caesars.location = "Las Vegas";
        caesars.numberOfTables = 160;
        caesars.hasHotel = true;
        caesars.getCasinoDetails();

        Casino hardRock = new Casino();
        hardRock.id = 16;
        hardRock.name = "Hard Rock Casino";
        hardRock.location = "Atlantic City";
        hardRock.numberOfTables = 120;
        hardRock.hasHotel = true;
        hardRock.getCasinoDetails();

        Casino riverRock = new Casino();
        riverRock.id = 17;
        riverRock.name = "River Rock Casino";
        riverRock.location = "Canada";
        riverRock.numberOfTables = 110;
        riverRock.hasHotel = true;
        riverRock.getCasinoDetails();

        Casino casinoBarcelona = new Casino();
        casinoBarcelona.id = 18;
        casinoBarcelona.name = "Casino Barcelona";
        casinoBarcelona.location = "Spain";
        casinoBarcelona.numberOfTables = 95;
        casinoBarcelona.hasHotel = false;
        casinoBarcelona.getCasinoDetails();

        Casino casinoLisboa = new Casino();
        casinoLisboa.id = 19;
        casinoLisboa.name = "Casino Lisboa";
        casinoLisboa.location = "Portugal";
        casinoLisboa.numberOfTables = 85;
        casinoLisboa.hasHotel = false;
        casinoLisboa.getCasinoDetails();

        Casino okada = new Casino();
        okada.id = 20;
        okada.name = "Okada Manila";
        okada.location = "Philippines";
        okada.numberOfTables = 370;
        okada.hasHotel = true;
        okada.getCasinoDetails();

        System.out.println("Main Ended");
    }
}

public class CasinoRunner {
    public static void main(String casino[]) {
        System.out.println("Main Started");

        Casino bellagio = new Casino(1, "Bellagio", "Las Vegas", 140, true);
        bellagio.getCasinoDetails();

        Casino venetian = new Casino(2, "Venetian Macao", "Macau", 500, true);
        venetian.getCasinoDetails();

        Casino wynn = new Casino(3, "Wynn", "Las Vegas", 180, true);
        wynn.getCasinoDetails();

        Casino monteCarlo = new Casino(4, "Monte Carlo Casino", "Monaco", 100, false);
        monteCarlo.getCasinoDetails();

        Casino foxwoods = new Casino(5, "Foxwoods", "Connecticut", 250, true);
        foxwoods.getCasinoDetails();

        Casino mgm = new Casino(6, "MGM Grand", "Las Vegas", 170, true);
        mgm.getCasinoDetails();

        Casino borgata = new Casino(7, "Borgata", "Atlantic City", 200, true);
        borgata.getCasinoDetails();

        Casino cityOfDreams = new Casino(8, "City of Dreams", "Macau", 420, true);
        cityOfDreams.getCasinoDetails();

        Casino sands = new Casino(9, "Sands Casino", "Macau", 300, true);
        sands.getCasinoDetails();

        Casino crown = new Casino(10, "Crown Casino", "Melbourne", 350, true);
        crown.getCasinoDetails();

        Casino resortWorld = new Casino(11, "Resorts World", "Singapore", 250, true);
        resortWorld.getCasinoDetails();

        Casino tropicana = new Casino(12, "Tropicana", "Las Vegas", 90, true);
        tropicana.getCasinoDetails();

        Casino goldenNugget = new Casino(13, "Golden Nugget", "Las Vegas", 70, true);
        goldenNugget.getCasinoDetails();

        Casino aria = new Casino(14, "Aria", "Las Vegas", 150, true);
        aria.getCasinoDetails();

        Casino caesars = new Casino(15, "Caesars Palace", "Las Vegas", 160, true);
        caesars.getCasinoDetails();

        Casino hardRock = new Casino(16, "Hard Rock Casino", "Atlantic City", 120, true);
        hardRock.getCasinoDetails();

        Casino riverRock = new Casino(17, "River Rock Casino", "Canada", 110, true);
        riverRock.getCasinoDetails();

        Casino casinoBarcelona = new Casino(18, "Casino Barcelona", "Spain", 95, false);
        casinoBarcelona.getCasinoDetails();

        Casino casinoLisboa = new Casino(19, "Casino Lisboa", "Portugal", 85, false);
        casinoLisboa.getCasinoDetails();

        Casino okada = new Casino(20, "Okada Manila", "Philippines", 370, true);
        okada.getCasinoDetails();

        System.out.println("Main Ended");
    }
}
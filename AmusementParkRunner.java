class AmusementParkRunner {
	
    public static void main(String park[]) {
		
        System.out.println("Main Started");

        AmusementPark traditionalPark = new AmusementPark(1,25,40.0,200, 5000, 3000);
        traditionalPark.getParkDetails();

        AmusementPark themePark = new AmusementPark(2,30,50.0,250, 6000, 4000);
        themePark.getParkDetails();

        AmusementPark waterPark = new AmusementPark(3,20,35.0,180,4500,3500);
        waterPark.getParkDetails();

        AmusementPark familyFunCenter = new AmusementPark(4,15,30.0,120,3000,2600);
        familyFunCenter.getParkDetails();

        AmusementPark safariPark = new AmusementPark(5,10,55.5,90,2000,1800);
        safariPark.getParkDetails();

        AmusementPark mountainThemePark = new AmusementPark(6,18,42.0,160,3500,2900);
        mountainThemePark.getParkDetails();

        AmusementPark cityPark = new AmusementPark(7,22,38.0,140,4000,3200);
        cityPark.getParkDetails();

        AmusementPark desertPark = new AmusementPark(8,16,29.5,110,2700,2200);
        desertPark.getParkDetails();

        AmusementPark jungleAdventure = new AmusementPark(9,28,45.0,200,5000,4300);
        jungleAdventure.getParkDetails();

        AmusementPark dinosaurLand = new AmusementPark(10,32,52.0,270,6200,5800);
        dinosaurLand.getParkDetails();

        AmusementPark kidsWorld = new AmusementPark(11,12,20.0,80,2000,1800);
        kidsWorld.getParkDetails();

        AmusementPark thrillIsland = new AmusementPark(12,35,55.0,300,7000,6500);
        thrillIsland.getParkDetails();

        AmusementPark fantasyRealm = new AmusementPark(13,26,44.0,230,5200,4700);
        fantasyRealm.getParkDetails();

        AmusementPark junglePark = new AmusementPark(14,14,26.0,100,2600,2100);
        junglePark.getParkDetails();

        AmusementPark ecoAdventure = new AmusementPark(15,19,33.0,130,3100,2700);
        ecoAdventure.getParkDetails();

        AmusementPark oceanWorld = new AmusementPark(16,21,39.0,150,3600,3100);
        oceanWorld.getParkDetails();

        AmusementPark galaxyPark = new AmusementPark(17, 27,48.0,240,5800,5400);
        galaxyPark.getParkDetails();

        AmusementPark arcticFunland = new AmusementPark(18,13,23.0,95,2400,2000);
        arcticFunland.getParkDetails();

        AmusementPark medievalPark = new AmusementPark(19,17,31.0,120,2900,2500);
        medievalPark.getParkDetails();

        AmusementPark robotKingdom = new AmusementPark(20,29,46.0,260,6000,5600);
        robotKingdom.getParkDetails();

        System.out.println("Main Ended");
    }
}

class AmusementParkRunner {
	
    public static void main(String park[]) {
		
        System.out.println("Main Started");

        AmusementPark traditionalPark = new AmusementPark();
        traditionalPark.id = 1;
        traditionalPark.numberOfRides = 25;
        traditionalPark.ticketPrice = 40.0;
        traditionalPark.numberOfEmployees = 200;
        traditionalPark.parkCapacity = 5000;
        traditionalPark.numberOfVisitors = 3000;
        traditionalPark.getParkDetails();

        AmusementPark themePark = new AmusementPark();
        themePark.id = 2;
        themePark.numberOfRides = 30;
        themePark.ticketPrice = 50.0;
        themePark.numberOfEmployees = 250;
        themePark.parkCapacity = 6000;
        themePark.numberOfVisitors = 4000;
        themePark.getParkDetails();

        AmusementPark waterPark = new AmusementPark();
        waterPark.id = 3;
        waterPark.numberOfRides = 20;
        waterPark.ticketPrice = 35.0;
        waterPark.numberOfEmployees = 180;
        waterPark.parkCapacity = 4500;
        waterPark.numberOfVisitors = 3500;
        waterPark.getParkDetails();

        AmusementPark familyFunCenter = new AmusementPark();
        familyFunCenter.id = 4;
        familyFunCenter.numberOfRides = 15;
        familyFunCenter.ticketPrice = 30.0;
        familyFunCenter.numberOfEmployees = 120;
        familyFunCenter.parkCapacity = 3000;
        familyFunCenter.numberOfVisitors = 2600;
        familyFunCenter.getParkDetails();

        AmusementPark safariPark = new AmusementPark();
        safariPark.id = 5;
        safariPark.numberOfRides = 10;
        safariPark.ticketPrice = 55.0;
        safariPark.numberOfEmployees = 90;
        safariPark.parkCapacity = 2000;
        safariPark.numberOfVisitors = 1800;
        safariPark.getParkDetails();

        AmusementPark mountainThemePark = new AmusementPark();
        mountainThemePark.id = 6;
        mountainThemePark.numberOfRides = 18;
        mountainThemePark.ticketPrice = 42.0;
        mountainThemePark.numberOfEmployees = 160;
        mountainThemePark.parkCapacity = 3500;
        mountainThemePark.numberOfVisitors = 2900;
        mountainThemePark.getParkDetails();

        AmusementPark cityPark = new AmusementPark();
        cityPark.id = 7;
        cityPark.numberOfRides = 22;
        cityPark.ticketPrice = 38.0;
        cityPark.numberOfEmployees = 140;
        cityPark.parkCapacity = 4000;
        cityPark.numberOfVisitors = 3200;
        cityPark.getParkDetails();

        AmusementPark desertPark = new AmusementPark();
        desertPark.id = 8;
        desertPark.numberOfRides = 16;
        desertPark.ticketPrice = 29.5;
        desertPark.numberOfEmployees = 110;
        desertPark.parkCapacity = 2700;
        desertPark.numberOfVisitors = 2200;
        desertPark.getParkDetails();

        AmusementPark jungleAdventure = new AmusementPark();
        jungleAdventure.id = 9;
        jungleAdventure.numberOfRides = 28;
        jungleAdventure.ticketPrice = 45.0;
        jungleAdventure.numberOfEmployees = 200;
        jungleAdventure.parkCapacity = 5000;
        jungleAdventure.numberOfVisitors = 4300;
        jungleAdventure.getParkDetails();

        AmusementPark dinosaurLand = new AmusementPark();
        dinosaurLand.id = 10;
        dinosaurLand.numberOfRides = 32;
        dinosaurLand.ticketPrice = 52.0;
        dinosaurLand.numberOfEmployees = 270;
        dinosaurLand.parkCapacity = 6200;
        dinosaurLand.numberOfVisitors = 5800;
        dinosaurLand.getParkDetails();

        AmusementPark kidsWorld = new AmusementPark();
        kidsWorld.id = 11;
        kidsWorld.numberOfRides = 12;
        kidsWorld.ticketPrice = 20.0;
        kidsWorld.numberOfEmployees = 80;
        kidsWorld.parkCapacity = 2000;
        kidsWorld.numberOfVisitors = 1800;
        kidsWorld.getParkDetails();

        AmusementPark thrillIsland = new AmusementPark();
        thrillIsland.id = 12;
        thrillIsland.numberOfRides = 35;
        thrillIsland.ticketPrice = 55.0;
        thrillIsland.numberOfEmployees = 300;
        thrillIsland.parkCapacity = 7000;
        thrillIsland.numberOfVisitors = 6500;
        thrillIsland.getParkDetails();

        AmusementPark fantasyRealm = new AmusementPark();
        fantasyRealm.id = 13;
        fantasyRealm.numberOfRides = 26;
        fantasyRealm.ticketPrice = 44.0;
        fantasyRealm.numberOfEmployees = 230;
        fantasyRealm.parkCapacity = 5200;
        fantasyRealm.numberOfVisitors = 4700;
        fantasyRealm.getParkDetails();

        AmusementPark junglePark = new AmusementPark();
        junglePark.id = 14;
        junglePark.numberOfRides = 14;
        junglePark.ticketPrice = 26.0;
        junglePark.numberOfEmployees = 100;
        junglePark.parkCapacity = 2600;
        junglePark.numberOfVisitors = 2100;
        junglePark.getParkDetails();

        AmusementPark ecoAdventure = new AmusementPark();
        ecoAdventure.id = 15;
        ecoAdventure.numberOfRides = 19;
        ecoAdventure.ticketPrice = 33.0;
        ecoAdventure.numberOfEmployees = 130;
        ecoAdventure.parkCapacity = 3100;
        ecoAdventure.numberOfVisitors = 2700;
        ecoAdventure.getParkDetails();

        AmusementPark oceanWorld = new AmusementPark();
        oceanWorld.id = 16;
        oceanWorld.numberOfRides = 21;
        oceanWorld.ticketPrice = 39.0;
        oceanWorld.numberOfEmployees = 150;
        oceanWorld.parkCapacity = 3600;
        oceanWorld.numberOfVisitors = 3100;
        oceanWorld.getParkDetails();

        AmusementPark galaxyPark = new AmusementPark();
        galaxyPark.id = 17;
        galaxyPark.numberOfRides = 27;
        galaxyPark.ticketPrice = 48.0;
        galaxyPark.numberOfEmployees = 240;
        galaxyPark.parkCapacity = 5800;
        galaxyPark.numberOfVisitors = 5400;
        galaxyPark.getParkDetails();

        AmusementPark arcticFunland = new AmusementPark();
        arcticFunland.id = 18;
        arcticFunland.numberOfRides = 13;
        arcticFunland.ticketPrice = 23.0;
        arcticFunland.numberOfEmployees = 95;
        arcticFunland.parkCapacity = 2400;
        arcticFunland.numberOfVisitors = 2000;
        arcticFunland.getParkDetails();

        AmusementPark medievalPark = new AmusementPark();
        medievalPark.id = 19;
        medievalPark.numberOfRides = 17;
        medievalPark.ticketPrice = 31.0;
        medievalPark.numberOfEmployees = 120;
        medievalPark.parkCapacity = 2900;
        medievalPark.numberOfVisitors = 2500;
        medievalPark.getParkDetails();

        AmusementPark robotKingdom = new AmusementPark();
        robotKingdom.id = 20;
        robotKingdom.numberOfRides = 29;
        robotKingdom.ticketPrice = 46.0;
        robotKingdom.numberOfEmployees = 260;
        robotKingdom.parkCapacity = 6000;
        robotKingdom.numberOfVisitors = 5600;
        robotKingdom.getParkDetails();

        System.out.println("Main Ended");
    }
}

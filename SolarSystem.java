class SolarSystem {
	
	static int totalPlanets;
    static int totalDwarfPlanets;
    static int totalMoons;
    static String largestPlanet;
    static String smallestPlanet;
    static String hottestPlanet;
    static String coldestPlanet;
    static String planetWithRings;
    static String earthSatellite;
    static double sunDiameter; 
    static String sunType;
    static double averageDistanceEarthToSun; 
    static int asteroidBeltLocation; 
    static boolean hasKuiperBelt;
    static boolean hasOortCloud;
    static int numberOfComets;
    static boolean hasArtificialSatellites;
    static String galaxyName;
    static String centralBody;
    static boolean lifeExistsOnEarth;
	
	public static void main(String solar[]) {
	
		System.out.println("Total Planets: " + totalPlanets);
        System.out.println("Total Dwarf Planets: " + totalDwarfPlanets);
        System.out.println("Total Moons: " + totalMoons);
        System.out.println("Largest Planet: " + largestPlanet);
        System.out.println("Smallest Planet: " + smallestPlanet);
        System.out.println("Hottest Planet: " + hottestPlanet);
        System.out.println("Coldest Planet: " + coldestPlanet);
        System.out.println("Planet with Rings: " + planetWithRings);
        System.out.println("Earth's Satellite: " + earthSatellite);
        System.out.println("Sun Diameter: " + sunDiameter + " km");
        System.out.println("Sun Type: " + sunType);
        System.out.println("Earth-Sun Distance: " + averageDistanceEarthToSun + " km");
        System.out.println("Asteroid Belt is After Planet #: " + asteroidBeltLocation);
        System.out.println("Kuiper Belt Present: " + hasKuiperBelt);
        System.out.println("Oort Cloud Present: " + hasOortCloud);
        System.out.println("Number of Known Comets: " + numberOfComets);
        System.out.println("Artificial Satellites Present: " + hasArtificialSatellites);
        System.out.println("Galaxy Name: " + galaxyName);
        System.out.println("Central Body of Solar System: " + centralBody);
        System.out.println("Life Exists on Earth: " + lifeExistsOnEarth);
		
		System.out.println("-------           -------");
		
		totalPlanets = 8;
		totalDwarfPlanets = 5;
		totalMoons = 290;
		largestPlanet = "Jupiter";
		smallestPlanet = "Mercury";
		hottestPlanet = "Venus";
		coldestPlanet = "Neptune";
		planetWithRings = "Saturn";
		earthSatellite = "Moon";
		sunDiameter = 1.39e6; 
		sunType = "Yellow Dwarf";
		averageDistanceEarthToSun = 149.66; 
		asteroidBeltLocation = 5; 
		hasKuiperBelt = true;
		hasOortCloud = true;
		numberOfComets = 3400;
		hasArtificialSatellites = true;
		galaxyName = "Milky Way";
		centralBody = "Sun";
		lifeExistsOnEarth = true;
		
		
		System.out.println("Total Planets: " + totalPlanets);
        System.out.println("Total Dwarf Planets: " + totalDwarfPlanets);
        System.out.println("Total Moons: " + totalMoons);
        System.out.println("Largest Planet: " + largestPlanet);
        System.out.println("Smallest Planet: " + smallestPlanet);
        System.out.println("Hottest Planet: " + hottestPlanet);
        System.out.println("Coldest Planet: " + coldestPlanet);
        System.out.println("Planet with Rings: " + planetWithRings);
        System.out.println("Earth's Satellite: " + earthSatellite);
        System.out.println("Sun Diameter: " + sunDiameter + " km");
        System.out.println("Sun Type: " + sunType);
        System.out.println("Earth-Sun Distance: " + averageDistanceEarthToSun + " km");
        System.out.println("Asteroid Belt is After Planet #: " + asteroidBeltLocation);
        System.out.println("Kuiper Belt Present: " + hasKuiperBelt);
        System.out.println("Oort Cloud Present: " + hasOortCloud);
        System.out.println("Number of Known Comets: " + numberOfComets);
        System.out.println("Artificial Satellites Present: " + hasArtificialSatellites);
        System.out.println("Galaxy Name: " + galaxyName);
        System.out.println("Central Body of Solar System: " + centralBody);
        System.out.println("Life Exists on Earth: " + lifeExistsOnEarth);
	}
}
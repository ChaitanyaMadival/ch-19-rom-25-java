class ForestSafari{

    int id;
    String name;
    String location;
    int numberOfAnimals;
    double areaInSqKm;
    boolean hasJeepSafari;
	
	ForestSafari(int id, String name, String location,int numberOfAnimals,double areaInSqKm,boolean hasJeepSafari){
		this.id = id;
		this.name = name;
		this.location = location;
		this.numberOfAnimals = numberOfAnimals;
		this.areaInSqKm = areaInSqKm;
		this.hasJeepSafari = hasJeepSafari;
	}

    public void getSafariDetails() {
        System.out.println("Safari ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Location: " +location);
        System.out.println("Number of Animals: " +numberOfAnimals);
        System.out.println("Area (sq km): " +areaInSqKm);
        System.out.println("Jeep Safari Available: " +hasJeepSafari);
        System.out.println("-----------------");
    }
}

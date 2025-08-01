class Marble {

    int id;
    String color;
    double diameterInMm;
    double weightInGrams;
	
	Marble(int id, String color, double diameterInMm, double weightInGrams){
		this.id = id;
		this.color = color;
		this.diameterInMm = diameterInMm;
		this.weightInGrams = weightInGrams;
	}

    public void getMarbleDetails() {
        System.out.println("Marble ID: " + id);
        System.out.println("Color: " + color);
        System.out.println("Diameter (mm): " + diameterInMm);
        System.out.println("Weight (grams): " + weightInGrams);
        System.out.println("----------");
    }
}

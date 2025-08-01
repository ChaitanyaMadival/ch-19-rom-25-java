class Flowers {

    int id;
    String name;
    String color;
    String fragrance;
    int petalCount;
	
	Flowers(int id, String name,String color, String fragrance, int petalCount){
		this.id = id;
		this.name = name;
		this.color = color;
		this.fragrance = fragrance;
		this.petalCount = petalCount;
	}

    public void getFlowerDetails() {
        System.out.println("Flower ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Petal Count: " + petalCount);
        System.out.println("-------------------");
    }
}

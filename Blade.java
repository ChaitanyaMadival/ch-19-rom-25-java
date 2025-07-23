class Blade {

	int bladeId;
	String type;
	String material;
	String color;
	String length;
	String sharpness;
	String usage;

	public void printDetails() {
		System.out.println("Blade ID: " + bladeId);
		System.out.println("Type: " + type);
		System.out.println("Material: " + material);
		System.out.println("Color: " + color);
		System.out.println("Length: " + length);
		System.out.println("Sharpness: " + sharpness);
		System.out.println("Usage: " + usage);
		System.out.println("----     ----");
	}
}

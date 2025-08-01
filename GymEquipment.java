class GymEquipment {
	int equipmentId;
	String name;
	String type;
	String brand;
	String material;
	String color;
	String usage;

	GymEquipment(int equipmentId, String name, String type, String brand, String material, String color, String usage) {
		this.equipmentId = equipmentId;
		this.name = name;
		this.type = type;
		this.brand = brand;
		this.material = material;
		this.color = color;
		this.usage = usage;
	}

	void getGymEquipment() {
		System.out.println("ID: " + equipmentId);
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Brand: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Color: " + color);
		System.out.println("Usage: " + usage);
		System.out.println("---------------------");
	}
}

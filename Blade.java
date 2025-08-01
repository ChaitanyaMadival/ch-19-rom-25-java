class Blade {
    int bladeId;
    String type;
    String material;
    String color;
    String length;
    String sharpness;
    String usage;
	
    Blade(int bladeId, String type, String material, String color, String length, String sharpness, String usage) {
        this.bladeId = bladeId;
        this.type = type;
        this.material = material;
        this.color = color;
        this.length = length;
        this.sharpness = sharpness;
        this.usage = usage;
    }

    void printDetails() {
        System.out.println("Blade ID: " + bladeId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Sharpness: " + sharpness);
        System.out.println("Usage: " + usage);
        System.out.println("------------------");
    }
}

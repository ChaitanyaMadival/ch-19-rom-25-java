class Hat {
    int id;
    String name;
    String style;
    String color;
    String material;
    boolean isAdjustable;

    // Constructor
    public Hat(int id, String name, String style, String color, String material, boolean isAdjustable) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.color = color;
        this.material = material;
        this.isAdjustable = isAdjustable;
    }

    // Method to print hat details
    public void getHatDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Style: " + style);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("-----------------------");
    }
}

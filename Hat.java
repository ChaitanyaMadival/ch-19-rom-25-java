class Hat{

    int id;
    String name;
    String style;
    String color;
    String material;
    boolean isAdjustable;

    void getHatDetails() {
        System.out.println("Hat ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Style: " + style);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("-----------------");
    }
}

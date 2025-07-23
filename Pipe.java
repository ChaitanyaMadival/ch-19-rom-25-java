class Pipe {

    int id;
    String material;
    String type;
    String diameter;
    String length;
    String application;

    void getPipeDetails() {
        System.out.println("Pipe ID: " + id);
        System.out.println("Material: " + material);
        System.out.println("Type: " + type);
        System.out.println("Diameter: " + diameter);
        System.out.println("Length: " + length);
        System.out.println("Application: " + application);
        System.out.println("----------------");
    }
}

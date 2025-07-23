class Weapon {

    int id;
    String name;
    String type;
    String origin;
    String material;
    String usage;

    void getWeaponDetails() {
        System.out.println("Weapon ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Origin: " + origin);
        System.out.println("Material: " + material);
        System.out.println("Usage: " + usage);
        System.out.println("-------------");
    }
}

class Network {
    int id;
    String name;
    String type;
    String speed;
    String coverage;
    String provider;

    void getNetworkDetails() {
        System.out.println("Network ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed);
        System.out.println("Coverage: " + coverage);
        System.out.println("Provider: " + provider);
        System.out.println("----------------");
    }
}

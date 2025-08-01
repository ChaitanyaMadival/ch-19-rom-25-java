public class Casino {
    int id;
    String name;
    String location;
    int numberOfTables;
    boolean hasHotel;
	
    public Casino(int id, String name, String location, int numberOfTables, boolean hasHotel) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.numberOfTables = numberOfTables;
        this.hasHotel = hasHotel;
    }

    public void getCasinoDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Tables: " + numberOfTables);
        System.out.println("Has Hotel: " + hasHotel);
        System.out.println("--------------------");
    }
}

class Casino {
	
    int id;
    String name;
    String location;
    int numberOfTables;
    boolean hasHotel;

    public void getCasinoDetails() {
        System.out.println("Casino ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Location: "+location);
        System.out.println("Number of Tables: "+numberOfTables);
        System.out.println("Has Hotel: "+hasHotel);
        System.out.println("----------------");
    }
}

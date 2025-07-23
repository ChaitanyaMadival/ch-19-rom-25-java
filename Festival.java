class Festival {
	
    int id;
    String name;
    String location;
    String season;
    int numberOfDays;
    boolean isReligious;

    public void getFestivalDetails() {
        System.out.println("Festival ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Season: " + season);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Religious Festival: " + isReligious);
        System.out.println("------------------");
    }
}

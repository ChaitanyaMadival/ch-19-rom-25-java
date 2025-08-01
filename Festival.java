class Festival {
    int id;
    String name;
    String location;
    String season;
    int numberOfDays;
    boolean isReligious;

    public Festival(int id, String name, String location, String season, int numberOfDays, boolean isReligious) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.season = season;
        this.numberOfDays = numberOfDays;
        this.isReligious = isReligious;
    }

    public void getFestivalDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Season: " + season);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Is Religious: " + isReligious);
        System.out.println("-------------------");
    }
}

class AmusementPark {
	
    int id;
    int numberOfRides;
    double ticketPrice;
    int numberOfEmployees;
    int parkCapacity;
    int numberOfVisitors;
	
	AmusementPark(int id, int numberOfRides,double ticketPrice,int numberOfEmployees,int parkCapacity,int numberOfVisitors){
		this.id = id;
		this.numberOfRides = numberOfRides;
		this.ticketPrice = ticketPrice;
		this.numberOfEmployees = numberOfEmployees;
		this.parkCapacity = parkCapacity;
		this.numberOfVisitors = numberOfVisitors;
	}

    public void getParkDetails() {
        System.out.println("Amusement Park ID: "+id);
        System.out.println("Number of Rides: "+numberOfRides);
        System.out.println("Ticket Price: "+ticketPrice);
        System.out.println("Number of Employees: "+numberOfEmployees);
        System.out.println("Park Capacity: "+parkCapacity);
        System.out.println("Number of Visitors: "+numberOfVisitors);
        System.out.println("------------------");
    }
}

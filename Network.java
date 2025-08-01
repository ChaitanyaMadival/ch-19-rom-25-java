class Network {
    int id;
    String name;
    String type;
    String speed;
    String coverage;
    String provider;
	
	//special type of method
	Network(){
		System.out.println("Network Constructor is Invoked ...");
		System.out.println("The constructor name should be same as the className ...");
		System.out.println("Constructor dont have return type ...");
	}
	
	//passing the values in the argument of costructor
	Network(int id, String name, String type, String speed, String coverage, String provider){
		System.out.println("Parameterised constructor ..");
		this.id = id;
		this.name = name;
		this.type= type;
		this.speed = speed;
		this.coverage = coverage;
		this.provider = provider;
	}

	public void getNetworkDetails() {
        System.out.println("Network ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed);
        System.out.println("Coverage: " + coverage);
        System.out.println("Provider: " + provider);
        System.out.println("----------------");
    }
}

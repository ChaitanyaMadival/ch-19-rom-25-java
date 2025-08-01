class Pipe {

    int id;
    String material;
    String type;
    String diameter;
    String length;
    String application;
	
	Pipe(int id,String material,String type,String diameter,String length,String application){
		this.id = id;
		this.material = material;
		this.type = type;
		this.diameter = diameter;
		this.length = length;
		this.application = application;
	}

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

class Blazer{
	
	int blazerId;
	String style;
	String fabric;
	String color;
	String size;
	String fit;
	String occasion;
	
	Blazer(int blazerId, String style, String fabric,String color, String size,String fit, String occasion){
		this.blazerId = blazerId;
		this.style = style;
		this.fabric = fabric;
		this.color = color;
		this.size = size;
		this.fit = fit;
		this.occasion = occasion;
	}
	
	public void getBlazerInfo(){
		System.out.println("Id of blazer: "+blazerId);
		System.out.println("Blazer Style: "+style);
		System.out.println("Blazer Fabric: "+fabric);
		System.out.println("Blazer Color: "+color);
		System.out.println("Blazer Size: "+size);
		System.out.println("Blazer Fit: "+fit);
		System.out.println("Ocassion: "+occasion);
		System.out.println("---------------------");
		
	}
	
}
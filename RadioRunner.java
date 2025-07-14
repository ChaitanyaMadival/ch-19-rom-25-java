class RadioRunner{

	public static void main(String radio[]){
		System.out.println("Main Started");
		
		String color = Radio.getColor();
		System.out.println("Color of the Radio is: "+color);
		
		double weight = Radio.getWeight();
		System.out.println("Weight of the Radio is: "+weight + " "+"kg");
		
		int frequencyRange = Radio.getFrequency();
		System.out.println("Frequency Range of the Radio is: "+frequencyRange + " " + "hz");
		
		double price = Radio.getPrice();
		System.out.println("Price of the Radio is: "+price);
		
		String brand = Radio.getBrand();
		System.out.println("Brand of the radio is: "+brand);
		
		System.out.println("Main Ended");
	}

}
class BannerRunner{

	public static void main(String banner[]){
		System.out.println("Main Started");
		
		String color = Banner.getColor();
		System.out.println("Color of the Banner is: "+color);
		
		double size = Banner.getSize();
		System.out.println("Size of the Banner is: "+size+ " "+"cm");
		
		int cost = Banner.getCost();
		System.out.println("Cost of the Banner is: "+cost);
		
		String messageFont = Banner.getMessageFont();
		System.out.println("Font Type of the message written on the Banner is: "+messageFont);
		
		String writtenMessage = Banner.getWrittenMessage();
		System.out.println("Message written on the Banner is: "+writtenMessage);
		
		System.out.println("Main Ended");
	}

}
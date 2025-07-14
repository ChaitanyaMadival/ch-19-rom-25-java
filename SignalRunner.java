class SignalRunner{

	public static void main(String signal[]){
		System.out.println("Main Started");
		
		String location = Signal.getLocation();
        System.out.println("Signal Location: " +location);

        String color = Signal.getCurrentColor();
        System.out.println("Current Signal Color: " +color);

        int red = Signal.getRedDuration();
        System.out.println("Red Light Duration: " + red + " sec");

        int green = Signal.getGreenDuration();
        System.out.println("Green Light Duration: " + green + " sec");

        int yellow = Signal.getYellowDuration();
        System.out.println("Yellow Light Duration: " + yellow + "sec");

        boolean working = Signal.getIsWorking();
        System.out.println("Is Signal Working: " +working);
		
		System.out.println("Main Ended");
	}

}
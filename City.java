class City {

	static int pinCodes[] = {581402, 581344, 581319, 581187, 581453, 581359, 581450, 581329, 581401, 581363,581306,581502, 581207};
	
	public static void main(String args[]) {
	
		//System.out.println(pinCodes[0]+ " "+pinCodes[1]+ " "+pinCodes[2]+ " "+pinCodes[3]+ " "+pinCodes[4]+ " "+pinCodes[5]+ " "+pinCodes[6]+ " "+pinCodes[7]+ " "+ pinCodes[8]+ " "+pinCodes[9]+ " "+pinCodes[10]+ " "+pinCodes[11]+ " "+pinCodes[12]);
	
		for(int pinCode: pinCodes){
			System.out.println(pinCode);
		}
	}
}
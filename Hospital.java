class Hospital {
	
	static String doctorNames[] = {"Dr.Chaitanya", "Dr.Akshata", "Dr.Arun Prabhu", "Dr.Asha Prabhu", "Dr.Dev", "Dr.Harsha","Dr.Ullas","Dr.Narayan", "Dr.Shaila", "Dr.Lakshmi"};
	
	public static void main(String hospital[]) {
	
	//	System.out.println(doctorNames[0]+ " "+doctorNames[1]+ " "+doctorNames[2]+ " "+doctorNames[3]+ " "+doctorNames[4]+ " "+doctorNames[5]
	//		+ " "+doctorNames[6]+ " "+doctorNames[7]+ " "+doctorNames[8]+ " "+doctorNames[9]);
		for(String doctorName: doctorNames){
			System.out.println(doctorName);
		}
	}
}
class Ipl {

	static String teamNames[] = {"RCB", "CSK", "DC", "KKR", "GT", "LSG", "MI", "PBKS", "RR", "SRH"};
	
	public static void main(String team[]) {
	
		// System.out.println(teamNames[0]+ " "+teamNames[1]+ " "+teamNames[2]+ " "+teamNames[3]+ " "+teamNames[4]
		//	+ " "+teamNames[5]+ " "+teamNames[6]+ " "+teamNames[7]+ " "+teamNames[8]+ " "+teamNames[9]);
		
		for(String teamName: teamNames) {
			System.out.println(teamName);
		}
		
	}
}
class Ipl {
	/*
	static String rcb = "RCB";
	static String csk = "CSK";
	static String dc = "DC";
	static String kkr = "KKR";
	static String gt = "GT";
	static String lsg = "LSG";
	static String mi = "MI";
	static String pbks = "PBKS";
	static String rr =  "RR";
	static String srh = "SRH";
	
	static String teamNames[] = {rcb, csk, dc, kkr, gt, lsg, mi, pbks,rr, srh};
	*/
	public static void main(String team[]) {
	
	System.out.println("Main Started");
		 String rcb = "RCB";
		 String csk = "CSK";
		 String dc = "DC";
		 String kkr = "KKR";
		 String gt = "GT";
		 String lsg = "LSG";
		 String mi = "MI";
		 String pbks = "PBKS";
		 String rr =  "RR";
		 String srh = "SRH";
		
		 String teamNames[] = {rcb, csk, dc, kkr, gt, lsg, mi, pbks,rr, srh};
		
		// System.out.println(teamNames[0]+ " "+teamNames[1]+ " "+teamNames[2]+ " "+teamNames[3]+ " "+teamNames[4]
		//	+ " "+teamNames[5]+ " "+teamNames[6]+ " "+teamNames[7]+ " "+teamNames[8]+ " "+teamNames[9]);
		
		for(String teamName: teamNames) {
			System.out.println(teamName);
		}
	System.out.println("Main Ended");
	}
}
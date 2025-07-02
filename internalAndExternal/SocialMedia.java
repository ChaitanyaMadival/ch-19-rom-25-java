class SocialMedia {
	/*
	static String instagram = "Instagram";
	static String faceBook = "Facebook";
	static String whatsApp = "WhatsApp";
	static String x = "X";
	static String telegram = "Telegram";
	static String linkdin = "Linkedin";
	static String snapchat= "Snapchat";
	static String pintrest = "Pinterest";
	static String youTube = "YouTube";
	static String tikTok = "TikTok";
	static String mediaNames[] = {instagram, faceBook, whatsApp, x, telegram, linkdin, snapchat, pintrest, youTube, tikTok};
	*/
	public static void main(String media[]) {
	
	System.out.println("Main Started");
		//System.out.println(mediaNames[0]+ " "+mediaNames[1]+ " "+mediaNames[2]+ " "+mediaNames[3]+ " "+mediaNames[4]+ " "+mediaNames[5]+ 
		//	" "+mediaNames[6]+ " "+mediaNames[7]+ " "+mediaNames[8]+ " "+mediaNames[9]);
	
		 String instagram = "Instagram";
		 String faceBook = "Facebook";
		 String whatsApp = "WhatsApp";
		 String x = "X";
		 String telegram = "Telegram";
		 String linkdin = "Linkedin";
		 String snapchat= "Snapchat";
		 String pintrest = "Pinterest";
		 String youTube = "YouTube";
		 String tikTok = "TikTok";
		 String mediaNames[] = {instagram, faceBook, whatsApp, x, telegram, linkdin, snapchat, pintrest, youTube, tikTok};

		for(String mediaName:mediaNames){
			System.out.println(mediaName);
		}
	System.out.println("Main Ended");
	}
}
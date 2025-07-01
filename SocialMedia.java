class SocialMedia {

	static String mediaNames[] = {"Instagram", "Facebook", "WhatsApp", "X", "Telegram", "Linkedin", "Snapchat", "Pinterest", "YouTube", "TikTok"};

	public static void main(String media[]) {
	
		//System.out.println(mediaNames[0]+ " "+mediaNames[1]+ " "+mediaNames[2]+ " "+mediaNames[3]+ " "+mediaNames[4]+ " "+mediaNames[5]+ 
		//	" "+mediaNames[6]+ " "+mediaNames[7]+ " "+mediaNames[8]+ " "+mediaNames[9]);
	
		for(String mediaName:mediaNames){
			System.out.println(mediaName);
		}
	}
}
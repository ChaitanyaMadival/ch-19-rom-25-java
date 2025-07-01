class SpiceShop {
	
	static String spices[] = {"Cumin", "Coriander", "Turmaric", "Mustard seeds", "Red Chilli powder", "Garam Masala", "Asafoetida", "Fenugreek Seeds", 
		"Ginger", "Clove", "Cardamom", "Bay leaf", "Black pepper", "Cinnamon"};
	
	public static void main(String shop[]) {
	
	//	System.out.println(spices[0]+ " "+spices[1]+ " "+spices[2]+ " "+spices[3]+ " "+spices[4]+ " "+spices[5]+ " "+spices[6]+ " "+spices[7]
	//		+ " "+spices[8]+ " "+spices[9]+ " "+spices[9]+ " "+spices[10]+ " "+spices[11]+ " "+spices[12]+ " "+spices[13]);
		for(String spice:spices){
			System.out.println(spice);
		}
	}
}
class SuperMarket {
	
	static String iceCreams[] = {"Vanilla", "Chocolate", "Strawberry", "Cone", "Black Current", "Gudbud", "Butterschotch","Cup Ice", "Chokobar", "Graps Candy"};
	static String perfumes[] ={"Gucci", "Dior", "Bvlgari", "Calvin Klein", "Chanel", "Fogg", "Skinn by Titan", "Bella Vita", "Ajmal", "Bombay Perfumery"};
	
	
	public static void main(String market[]) {
		
		String groceries[] = {"Rice", "Atta", "Lentils", "Sugar", "Oil", "Spices", "Dry fruits", "Tea powder", "Milk","Egg"};
		String cosmetics[] = {"Maybelline", "L'Oreal", "MAC Cosmetics", "Fenty Beauty", "NARS Cosmetics", "Dior", "Estee Lauder", "NYX", "Clinique", "Lakme"};
	
		/*System.out.println(iceCreams[0]+ " "+iceCreams[1]+ " "+iceCreams[2]+ " "+ " "+iceCreams[3]+ " "+iceCreams[4]+ " "+iceCreams[5]+ " "+iceCreams[6]+ " "+iceCreams[7]+ " "+iceCreams[8]+ " "+iceCreams[9]);
		System.out.println(perfumes[0]+ " "+perfumes[1]+ " "+perfumes[2]+ " "+perfumes[3]+ " "+perfumes[4]+ " "+perfumes[5]+ " "+perfumes[6]+ " "+perfumes[7]+ " "+perfumes[8]+ " "+perfumes[9]);
		System.out.println(groceries[0]+ " "+groceries[1]+ " "+groceries[2]+ " "+groceries[3]+ " "+groceries[4]+ " "+groceries[5]+ " "+groceries[6]+ " "+groceries[7]+ " "+groceries[8]+ " "+groceries[9]);
		System.out.println(cosmetics[0]+ " "+cosmetics[1]+ " "+cosmetics[2]+ " "+cosmetics[3]+ " "+cosmetics[4]+ " "+cosmetics[5]+ " "+cosmetics[6]+ " "+cosmetics[7]+ " "+cosmetics[8]+ " "+cosmetics[9]);
		*/
		
		for(String iceCream:iceCreams){
			System.out.println(iceCream);
		}
		for(String perfume:perfumes){
			System.out.println(perfume);
		}
		for(String grocerie:groceries){
			System.out.println(grocerie);
		}
		for(String cosmetic:cosmetics){
			System.out.println(cosmetic);
		}
	}
}
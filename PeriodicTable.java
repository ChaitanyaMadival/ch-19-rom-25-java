class PeriodicTable {

	static String elements[] = {"Carbon", "Hydrogen", "Nitrogen", "Boron", "Oxygen", "Lithium", "Uranium", "Calcium", "Zinc", "Gold", "Helium", "Aluminium"};
	
	public static void main(String table[]) {
	
		/*System.out.println("Length "+elements.length);
		System.out.println(elements[0]+ " "+elements[1]+ " "+elements[2]+ " "+elements[3]+ " "+elements[4]+ " "+elements[5]+ 
			" "+elements[6]+ " "+elements[7]+ " "+elements[8]+ " "+elements[9]+ " "+elements[10]+ " "+elements[11]);
	*/
		for(String element:elements){
			System.out.println(element);
		}
	}
}
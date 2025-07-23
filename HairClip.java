class HairClip {

	int clipId;
	String type;
	String color;
	String material;
	String size;
	String pattern;
	String usage;

	public void getHairClipDetails() {
		System.out.println("Clip ID: " +clipId);
		System.out.println("Type: " +type);
		System.out.println("Color: "+color);
		System.out.println("Material: "+material);
		System.out.println("Size: "+size);
		System.out.println("Pattern: "+pattern);
		System.out.println("Usage: "+usage);
		System.out.println("----   ----");
	}
}

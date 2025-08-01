class HairClip {
	int clipId;
	String type;
	String color;
	String material;
	String size;
	String pattern;
	String usage;

	public HairClip(int clipId, String type, String color, String material, String size, String pattern, String usage) {
		this.clipId = clipId;
		this.type = type;
		this.color = color;
		this.material = material;
		this.size = size;
		this.pattern = pattern;
		this.usage = usage;
	}

	public void getHairClipDetails() {
		System.out.println("ID: " + clipId);
		System.out.println("Type: " + type);
		System.out.println("Color: " + color);
		System.out.println("Material: " + material);
		System.out.println("Size: " + size);
		System.out.println("Pattern: " + pattern);
		System.out.println("Usage: " + usage);
		System.out.println("------------------");
	}
}

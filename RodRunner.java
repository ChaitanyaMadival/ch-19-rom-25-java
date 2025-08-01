class RodRunner {
    public static void main(String rod[]) {
        System.out.println("Main Started");

        Rod rod1 = new Rod(1, "Steel", 2.5, "Construction",false, "Tata Steel");
        rod1.getRodDetails();

        Rod rod2 = new Rod(2, "Aluminum", 1.8, "Aerospace", true, "Alco India");
        rod2.getRodDetails();

        Rod rod3 = new Rod(3, "Copper", 3.0, "Electrical", true, "Hindalco");
        rod3.getRodDetails();

        Rod rod4 = new Rod(4,"Plastic",2.0,"DIY Projects",true, "PlastoTech");
        rod4.getRodDetails();

        Rod rod5 = new Rod(5,"Fiberglass",4.0,"Fishing", true, "FishPro");
        rod5.getRodDetails();

        Rod rod6 = new Rod(6, "Carbon Fiber", 2.7,"Cycling", false, "RideTech");
        rod6.getRodDetails();

        Rod rod7 = new Rod(7, "Iron", 3.5,"Foundation", false, "JSW");
        rod7.getRodDetails();

        Rod rod8 = new Rod(8,"Titanium",1.5, "Medical Implants",false, "BioMetal");
        rod8.getRodDetails();

        Rod rod9 = new Rod(9, "Bamboo", 3.2, "Furniture", true, "GreenBuild");
        rod9.getRodDetails();

        Rod rod10 = new Rod(10, "PVC", 2.8, "Plumbing", true, "FlowMax");
        rod10.getRodDetails();

        Rod rod11 = new Rod(11, "Graphite",2.1,"Sports", true, "GraphSport");
        rod11.getRodDetails();

        Rod rod12 = new Rod(12, "wood", 3.0,"Fencing",false,"WoodCraft");
        rod12.getRodDetails();

        Rod rod13 = new Rod(13,"Nickel", 1.6, "Chemical Industry", false, "MetalCore");
        rod13.getRodDetails();

        Rod rod14 = new Rod(14,"Bronze",2.9, "Artworks",false, "CraftMetal");
        rod14.getRodDetails();

        Rod rod15 = new Rod(15, "Zinc",1.2, "Coating", false, "ZincWorks");
        rod15.getRodDetails();

        Rod rod16 = new Rod(16, "Lead",2.4, "Radiation Shielding", false,"LeadGuard");
        rod16.getRodDetails();

        Rod rod17 = new Rod(17, "Stainless Steel", 3.8,"Architecture", false, "SSCorp");
        rod17.getRodDetails();

        Rod rod18 = new Rod(18, "Rubber", 2.2, "Shock Absorbers",true, "RubTech");
		rod18.getRodDetails();

        Rod rod19 = new Rod(19, "Magnesium", 1.9, "Firestarters", false, "MagLabs");
        rod19.getRodDetails();

        Rod rod20 = new Rod(20, "Acrylic",3.3,"Display Mounts", true, "ClearLite");
        rod20.getRodDetails();

        System.out.println("Main Ended");
    }
}

class GamingPcRunner {

    public static void main(String pc[]) {
        System.out.println("Main Started");

        String processor = GamingPc.getProcessor();
        System.out.println("Processor: " + processor);

        int ram = GamingPc.getRamSize();
        System.out.println("RAM Size: " + ram + " GB");

        String gpu = GamingPc.getGraphicsCard();
        System.out.println("Graphics Card: " + gpu);

        double price = GamingPc.getPrice();
        System.out.println("Price: " + price);

        boolean rgb = GamingPc.getHasRGBLighting();
        System.out.println("RGB Lighting: " + rgb);

        String brand = GamingPc.getBrand();
        System.out.println("Brand: " + brand);

        System.out.println("Main Ended");
    }
}

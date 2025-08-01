class PipeRunner {

    public static void main(String pipe[]) {
        System.out.println("Main Started");

        Pipe pipe1 = new Pipe(1,"PVC", "Flexible", "2 inch", "10 ft", "Plumbing");
        pipe1.getPipeDetails();

        Pipe pipe2 = new Pipe(2, "Steel", "Rigid", "4 inch","12 ft", "Gas pipeline");
        pipe2.getPipeDetails();

        Pipe pipe3 = new Pipe(3,"Copper", "Rigid", "1 inch", "8 ft", "Refrigeration");
        pipe3.getPipeDetails();

        Pipe pipe4 = new Pipe(4,"HDPE", "Flexible", "6 inch", "20 ft", "Drainage");
        pipe4.getPipeDetails();

        Pipe pipe5 = new Pipe(5, "Aluminum", "Rigid", "3 inch", "15 ft", "HVAC");
        pipe5.getPipeDetails();

        Pipe pipe6 = new Pipe(6, "Concrete", "Rigid", "12 inch","6 ft", "Sewer");
        pipe6.getPipeDetails();

        Pipe pipe7 = new Pipe(7, "Galvanized Steel", "Rigid", "2 inch", "10 ft", "Water supply");
        pipe7.getPipeDetails();

        Pipe pipe8 = new Pipe(8, "Brass", "Flexible", "1.5 inch", "7 ft", "Decorative plumbing");
        pipe8.getPipeDetails();

        Pipe pipe9 = new Pipe(9, "PEX", "Flexible", "0.5 inch","100 ft", "Residential water");
        pipe9.getPipeDetails();

        Pipe pipe10 = new Pipe(10,"Fiberglass","Rigid", "5 inch", "10 ft", "Industrial");
        pipe10.getPipeDetails();

        Pipe pipe11 = new Pipe(11, "ABS", "Flexible","3 inch","9 ft","Ventilation");
        pipe11.getPipeDetails();

        Pipe pipe12 = new Pipe(12,"Rubber", "Flexible", "1.25 inch","15 ft", "Laboratory use");
        pipe12.getPipeDetails();

        Pipe pipe13 = new Pipe(13, "Stainless Steel", "Rigid", "6 inch","8 ft", "Food industry");
        pipe13.getPipeDetails();

        Pipe pipe14 = new Pipe(14, "Cast Iron","Rigid","8 inch", "6 ft","Sewer systems");
        pipe14.getPipeDetails();

        Pipe pipe15 = new Pipe(15, "Plastic","Flexible","0.75 inch","20 ft","Garden irrigation");
        pipe15.getPipeDetails();

        Pipe pipe16 = new Pipe(16,"Polypropylene", "Rigid", "3 inch", "12 ft", "Chemical transport");
        pipe16.getPipeDetails();

        Pipe pipe17 = new Pipe(17,"Clay", "Rigid", "4 inch", "4 ft", "Traditional drainage");
        pipe17.getPipeDetails();

        Pipe pipe18 = new Pipe(18,"Glass","Rigid", "1 inch", "3 ft", "Scientific lab");
        pipe18.getPipeDetails();

        Pipe pipe19 = new Pipe(19, "Carbon Steel", "Rigid", "10 inch", "16 ft","Oil transport");
        pipe19.getPipeDetails();

        Pipe pipe20 = new Pipe(20, "PVC","Flexible","1 inch","25 ft","Electrical conduit");
        pipe20.getPipeDetails();

        System.out.println("Main Ended");
    }
}

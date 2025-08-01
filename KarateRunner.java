class KarateRunner {

    public static void main(String karate[]) {
        System.out.println("Main Started");

        Karate karate1 = new Karate(1, "Shotokan", 5, 7, "Dragon Dojo");
		/*
        karate1.id = 1;
        karate1.style = "Shotokan";
        karate1.beltLevel = 5;
        karate1.yearsOfPractice = 7;
        karate1.dojoName = "Dragon Dojo";
		*/
        karate1.getKarateDetails();

        Karate karate2 = new Karate(2, "Goju-Ryu", 3, 4, "Tiger Dojo");
		/*
        karate2.id = 2;
        karate2.style = "Goju-Ryu";
        karate2.beltLevel = 3;
        karate2.yearsOfPractice = 4;
        karate2.dojoName = "Tiger Dojo";
		*/
        karate2.getKarateDetails();

        Karate karate3 = new Karate(3, "Shito-Ryu", 7, 10, "Eagle Dojo");
        karate3.getKarateDetails();

        Karate karate4 = new Karate(4, "Wado-Ryu", 4, 6, "Falcon Dojo");
        karate4.getKarateDetails();

        Karate karate5 = new Karate(5, "Kyokushin", 8, 12, "Lion Dojo");
        karate5.getKarateDetails();

        Karate karate6 = new Karate(6, "Shotokan", 2, 3, "Dragon Dojo");
        karate6.getKarateDetails();

        Karate karate7 = new Karate(7, "Goju-Ryu", 6, 9,"Tiger Dojo");
        karate7.getKarateDetails();

        Karate karate8 = new Karate(8, "Shito-Ryu", 1, 1, "Eagle Dojo");
        karate8.getKarateDetails();

        Karate karate9 = new Karate(9, "Wado-Ryu", 9, 14, "Falcon Dojo");
        karate9.getKarateDetails();

        Karate karate10 = new Karate(10, "Kyokushin", 5, 8, "Lion Dojo");
        karate10.getKarateDetails();

        Karate karate11 = new Karate(11, "Shotokan", 7, 11, "Dragon Dojo");
        karate11.getKarateDetails();

        Karate karate12 = new Karate(12, "Goju-Ryu",3,4,"tiger dojo");
		/*
        karate12.style = "Goju-Ryu";
        karate12.beltLevel = 3;
        karate12.yearsOfPractice = 4;
        karate12.dojoName = "Tiger Dojo";
		*/
        karate12.getKarateDetails();

        Karate karate13 = new Karate(13,"Shito-Ryu", 6,9, "Eagle Dojo");
        karate13.getKarateDetails();

        Karate karate14 = new Karate(14, "Wado-Ryu", 2, 3, "Falcon Dojo");
        karate14.getKarateDetails();

        Karate karate15 = new Karate(15, "Kyokushin", 8, 13, "Lion Dojo");
        karate15.getKarateDetails();

        Karate karate16 = new Karate(16,"Shotokan",4,6,"Dragon Dojo");
        karate16.getKarateDetails();

        Karate karate17 = new Karate(17,"Goju-Ryu", 7, 11, "Tiger Dojo");
        karate17.getKarateDetails();

        Karate karate18 = new Karate(18, "Shito-Ryu", 5, 7,"Eagle Dojo");
        karate18.getKarateDetails();

        Karate karate19 = new Karate( 19, "Wado-Ryu", 3, 4,"Falcon Dojo");
        karate19.getKarateDetails();

        Karate karate20 = new Karate(20, "Kyokushin", 9, 15, "Lion Dojo");
        karate20.getKarateDetails();

        System.out.println("Main Ended");
    }
}

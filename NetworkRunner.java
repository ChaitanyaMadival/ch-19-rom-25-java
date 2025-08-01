class NetworkRunner {

    public static void main(String network[]) {
        System.out.println("Main Started");
		
		
        Network net1 = new Network(1, "Jio 4G", "Mobile", "100 Mbps", "Urban & Rural", "Reliance");
        
        net1.getNetworkDetails();


        Network net2 = new Network(2, "Airtel Xstream", "Broadband", "300 Mbps", "Urban", "Airtel");
       /*
		net2.id = 2;
        net2.name = "Airtel Xstream";
        net2.type = "Broadband";
        net2.speed = "300 Mbps";
        net2.coverage = "Urban";
        net2.provider = "Airtel";
		*/
		net2.getNetworkDetails();
		
        Network net3 = new Network(3, "BSNL Fiber", "Fiber", "100 Mbps", "Nationwide", "BSNL");
        /*
		net3.id = 3;
        net3.name = "BSNL Fiber";
        net3.type = "Fiber";
        net3.speed = "100 Mbps";
        net3.coverage = "Nationwide";
        net3.provider = "BSNL";
		*/
        net3.getNetworkDetails();

        Network net4 = new Network(4, "Vodafone Idea", "Mobile", "50 Mbps", "Urban", "Vi");
        /*
		net4.id = 4;
        net4.name = "Vodafone Idea";
        net4.type = "Mobile";
        net4.speed = "50 Mbps";
        net4.coverage = "Urban";
        net4.provider = "Vi";
		*/
        net4.getNetworkDetails();

        Network net5 = new Network(5, "ACT Fibernet", "Fiber", "1 Gbps", "Cities", "ACT");
        /*
		net5.id = 5;
        net5.name = "ACT Fibernet";
        net5.type = "Fiber";
        net5.speed = "1 Gbps";
        net5.coverage = "Cities";
        net5.provider = "ACT";
		*/
        net5.getNetworkDetails();

        Network net6 = new Network(6, "Hathway", "Broadband", "200 Mbps", "Limited Cities", "Hathway");
		/*
		net6.id = 6;
        net6.name = "Hathway";
        net6.type = "Broadband";
        net6.speed = "200 Mbps";
        net6.coverage = "Limited Cities";
        net6.provider = "Hathway";
		*/
        net6.getNetworkDetails();

        Network net7 = new Network(7, "Excitel", "Fiber", "400 Mbps", "Delhi, Bangalore", "Excitel");
        
        net7.getNetworkDetails();

        Network net8 = new Network(8, "Tikona", "Wireless", "60 Mbps", "Urban", "Tikona");
        
        net8.getNetworkDetails();

        Network net9 = new Network(9, "RailWire","Broadband","100 Mbps", "Nationwide","RailTel");
        
        net9.getNetworkDetails();

        Network net10 = new Network(10, "YOU Broadband", "Fiber", "200 Mbps", "Tier-1 Cities","YOU");
        net10.getNetworkDetails();

        Network net11 = new Network(11, "Tata Sky Broadband", "Broadband", "300 Mbps", "Metro Cities", "Tata");
        net11.getNetworkDetails();

        Network net12 = new Network(12, "Spectra", "Fiber", "1 Gbps", "Delhi, Gurgaon", "Spectra");
        net12.getNetworkDetails();

        Network net13 = new Network(13, "Netplus", "Fiber", "500 Mbps", "Punjab, Haryana", "Netplus");
        net13.getNetworkDetails();

        Network net14 = new Network(14, "GTPL", "Broadband", "100 Mbps", "Gujarat", "GTPL");
        net14.getNetworkDetails();

        Network net15 = new Network(15, "Asianet", "Cable", "60 Mbps", "Kerala", "Asianet");
        net15.getNetworkDetails();

        Network net16 = new Network(16, "SITI Network", "Cable", "50 Mbps", "Urban", "SITI");
        net16.getNetworkDetails();

        Network net17 = new Network(17, "DEN Network", "Cable", "70 Mbps", "Metro", "DEN");
        net17.getNetworkDetails();

        Network net18 = new Network(18, "Planet Broadband", "Broadband", "150 Mbps", "Telangana", "Planet");
        net18.getNetworkDetails();

        Network net19 = new Network(19, "Beam Telecom", "Fiber", "200 Mbps", "Hyderabad", "Beam");
        net19.getNetworkDetails();

        Network net20 = new Network(20, "Google Fi", "Mobile Virtual Network", "Variable", "International", "Google");
        net20.getNetworkDetails();

        System.out.println("Main Ended");
    }
}

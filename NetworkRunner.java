class NetworkRunner {

    public static void main(String network[]) {
        System.out.println("Main Started");

        Network net1 = new Network();
        net1.id = 1;
        net1.name = "Jio 4G";
        net1.type = "Mobile";
        net1.speed = "100 Mbps";
        net1.coverage = "Urban & Rural";
        net1.provider = "Reliance";
        net1.getNetworkDetails();

        Network net2 = new Network();
        net2.id = 2;
        net2.name = "Airtel Xstream";
        net2.type = "Broadband";
        net2.speed = "300 Mbps";
        net2.coverage = "Urban";
        net2.provider = "Airtel";
        net2.getNetworkDetails();

        Network net3 = new Network();
        net3.id = 3;
        net3.name = "BSNL Fiber";
        net3.type = "Fiber";
        net3.speed = "100 Mbps";
        net3.coverage = "Nationwide";
        net3.provider = "BSNL";
        net3.getNetworkDetails();

        Network net4 = new Network();
        net4.id = 4;
        net4.name = "Vodafone Idea";
        net4.type = "Mobile";
        net4.speed = "50 Mbps";
        net4.coverage = "Urban";
        net4.provider = "Vi";
        net4.getNetworkDetails();

        Network net5 = new Network();
        net5.id = 5;
        net5.name = "ACT Fibernet";
        net5.type = "Fiber";
        net5.speed = "1 Gbps";
        net5.coverage = "Cities";
        net5.provider = "ACT";
        net5.getNetworkDetails();

        Network net6 = new Network();
        net6.id = 6;
        net6.name = "Hathway";
        net6.type = "Broadband";
        net6.speed = "200 Mbps";
        net6.coverage = "Limited Cities";
        net6.provider = "Hathway";
        net6.getNetworkDetails();

        Network net7 = new Network();
        net7.id = 7;
        net7.name = "Excitel";
        net7.type = "Fiber";
        net7.speed = "400 Mbps";
        net7.coverage = "Delhi, Bangalore";
        net7.provider = "Excitel";
        net7.getNetworkDetails();

        Network net8 = new Network();
        net8.id = 8;
        net8.name = "Tikona";
        net8.type = "Wireless";
        net8.speed = "60 Mbps";
        net8.coverage = "Urban";
        net8.provider = "Tikona";
        net8.getNetworkDetails();

        Network net9 = new Network();
        net9.id = 9;
        net9.name = "RailWire";
        net9.type = "Broadband";
        net9.speed = "100 Mbps";
        net9.coverage = "Nationwide";
        net9.provider = "RailTel";
        net9.getNetworkDetails();

        Network net10 = new Network();
        net10.id = 10;
        net10.name = "YOU Broadband";
        net10.type = "Fiber";
        net10.speed = "200 Mbps";
        net10.coverage = "Tier-1 Cities";
        net10.provider = "YOU";
        net10.getNetworkDetails();

        Network net11 = new Network();
        net11.id = 11;
        net11.name = "Tata Sky Broadband";
        net11.type = "Broadband";
        net11.speed = "300 Mbps";
        net11.coverage = "Metro Cities";
        net11.provider = "Tata";
        net11.getNetworkDetails();

        Network net12 = new Network();
        net12.id = 12;
        net12.name = "Spectra";
        net12.type = "Fiber";
        net12.speed = "1 Gbps";
        net12.coverage = "Delhi, Gurgaon";
        net12.provider = "Spectra";
        net12.getNetworkDetails();

        Network net13 = new Network();
        net13.id = 13;
        net13.name = "Netplus";
        net13.type = "Fiber";
        net13.speed = "500 Mbps";
        net13.coverage = "Punjab, Haryana";
        net13.provider = "Netplus";
        net13.getNetworkDetails();

        Network net14 = new Network();
        net14.id = 14;
        net14.name = "GTPL";
        net14.type = "Broadband";
        net14.speed = "100 Mbps";
        net14.coverage = "Gujarat";
        net14.provider = "GTPL";
        net14.getNetworkDetails();

        Network net15 = new Network();
        net15.id = 15;
        net15.name = "Asianet";
        net15.type = "Cable";
        net15.speed = "60 Mbps";
        net15.coverage = "Kerala";
        net15.provider = "Asianet";
        net15.getNetworkDetails();

        Network net16 = new Network();
        net16.id = 16;
        net16.name = "SITI Network";
        net16.type = "Cable";
        net16.speed = "50 Mbps";
        net16.coverage = "Urban";
        net16.provider = "SITI";
        net16.getNetworkDetails();

        Network net17 = new Network();
        net17.id = 17;
        net17.name = "DEN Network";
        net17.type = "Cable";
        net17.speed = "70 Mbps";
        net17.coverage = "Metro";
        net17.provider = "DEN";
        net17.getNetworkDetails();

        Network net18 = new Network();
        net18.id = 18;
        net18.name = "Planet Broadband";
        net18.type = "Broadband";
        net18.speed = "150 Mbps";
        net18.coverage = "Telangana";
        net18.provider = "Planet";
        net18.getNetworkDetails();

        Network net19 = new Network();
        net19.id = 19;
        net19.name = "Beam Telecom";
        net19.type = "Fiber";
        net19.speed = "200 Mbps";
        net19.coverage = "Hyderabad";
        net19.provider = "Beam";
        net19.getNetworkDetails();

        Network net20 = new Network();
        net20.id = 20;
        net20.name = "Google Fi";
        net20.type = "Mobile Virtual Network";
        net20.speed = "Variable";
        net20.coverage = "International";
        net20.provider = "Google";
        net20.getNetworkDetails();

        System.out.println("Main Ended");
    }
}

class FestivalRunner {

    public static void main(String fest[]) {
        System.out.println("Main Started");

        Festival diwali = new Festival(1, "Diwali", "India", "Autumn", 5, true);
        diwali.getFestivalDetails();

        Festival christmas = new Festival(2, "Christmas", "Worldwide", "Winter", 1, true);
        christmas.getFestivalDetails();

        Festival holi = new Festival(3, "Holi", "India", "Spring", 2, true);
        holi.getFestivalDetails();

        Festival oktoberfest = new Festival(4, "Oktoberfest", "Germany", "Autumn", 16, false);
        oktoberfest.getFestivalDetails();

        Festival chineseNewYear = new Festival(5, "Chinese New Year", "China", "Winter", 15, true);
        chineseNewYear.getFestivalDetails();

        Festival eid = new Festival(6, "Eid", "Middle East", "Varies", 1, true);
        eid.getFestivalDetails();

        Festival hanukkah = new Festival(7, "Hanukkah", "Israel", "Winter", 8, true);
        hanukkah.getFestivalDetails();

        Festival thanksgiving = new Festival(8, "Thanksgiving", "USA/Canada", "Autumn", 1, false);
        thanksgiving.getFestivalDetails();

        Festival ganeshChaturthi = new Festival(9, "Ganesh Chaturthi", "India", "Autumn", 10, true);
        ganeshChaturthi.getFestivalDetails();

        Festival navratri = new Festival(10, "Navratri", "India", "Autumn", 9, true);
        navratri.getFestivalDetails();

        Festival pongal = new Festival(11, "Pongal", "Tamil Nadu", "Winter", 4, true);
        pongal.getFestivalDetails();

        Festival rakshaBandhan = new Festival(12, "Raksha Bandhan", "India", "Monsoon", 1, true);
        rakshaBandhan.getFestivalDetails();

        Festival baisakhi = new Festival(13, "Baisakhi", "Punjab", "Spring", 1, true);
        baisakhi.getFestivalDetails();

        Festival durgaPuja = new Festival(14, "Durga Puja", "West Bengal", "Autumn", 5, true);
        durgaPuja.getFestivalDetails();

        Festival karvaChauth = new Festival(15, "Karva Chauth", "North India", "Autumn", 1, true);
        karvaChauth.getFestivalDetails();

        Festival lohri = new Festival(16, "Lohri", "Punjab", "Winter", 1, false);
        lohri.getFestivalDetails();

        Festival easter = new Festival(17, "Easter", "Worldwide", "Spring", 1, true);
        easter.getFestivalDetails();

        Festival vesak = new Festival(18, "Vesak", "Sri Lanka", "Spring", 1, true);
        vesak.getFestivalDetails();

        Festival bonfireNight = new Festival(19, "Bonfire Night", "UK", "Autumn", 1, false);
        bonfireNight.getFestivalDetails();

        Festival songkran = new Festival(20, "Songkran", "Thailand", "Summer", 3, false);
        songkran.getFestivalDetails();

        System.out.println("Main Ended");
    }
}

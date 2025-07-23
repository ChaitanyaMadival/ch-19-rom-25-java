class FestivalRunner {

    public static void main(String fest[]) {
        System.out.println("Main Started");

        Festival diwali = new Festival();
        diwali.id = 1;
        diwali.name = "Diwali";
        diwali.location = "India";
        diwali.season = "Autumn";
        diwali.numberOfDays = 5;
        diwali.isReligious = true;
        diwali.getFestivalDetails();

        Festival christmas = new Festival();
        christmas.id = 2;
        christmas.name = "Christmas";
        christmas.location = "Worldwide";
        christmas.season = "Winter";
        christmas.numberOfDays = 1;
        christmas.isReligious = true;
        christmas.getFestivalDetails();

        Festival holi = new Festival();
        holi.id = 3;
        holi.name = "Holi";
        holi.location = "India";
        holi.season = "Spring";
        holi.numberOfDays = 2;
        holi.isReligious = true;
        holi.getFestivalDetails();

        Festival oktoberfest = new Festival();
        oktoberfest.id = 4;
        oktoberfest.name = "Oktoberfest";
        oktoberfest.location = "Germany";
        oktoberfest.season = "Autumn";
        oktoberfest.numberOfDays = 16;
        oktoberfest.isReligious = false;
        oktoberfest.getFestivalDetails();

        Festival chineseNewYear = new Festival();
        chineseNewYear.id = 5;
        chineseNewYear.name = "Chinese New Year";
        chineseNewYear.location = "China";
        chineseNewYear.season = "Winter";
        chineseNewYear.numberOfDays = 15;
        chineseNewYear.isReligious = true;
        chineseNewYear.getFestivalDetails();

        Festival eid = new Festival();
        eid.id = 6;
        eid.name = "Eid";
        eid.location = "Middle East";
        eid.season = "Varies";
        eid.numberOfDays = 1;
        eid.isReligious = true;
        eid.getFestivalDetails();

        Festival hanukkah = new Festival();
        hanukkah.id = 7;
        hanukkah.name = "Hanukkah";
        hanukkah.location = "Israel";
        hanukkah.season = "Winter";
        hanukkah.numberOfDays = 8;
        hanukkah.isReligious = true;
        hanukkah.getFestivalDetails();

        Festival thanksgiving = new Festival();
        thanksgiving.id = 8;
        thanksgiving.name = "Thanksgiving";
        thanksgiving.location = "USA/Canada";
        thanksgiving.season = "Autumn";
        thanksgiving.numberOfDays = 1;
        thanksgiving.isReligious = false;
        thanksgiving.getFestivalDetails();

        Festival ganeshChaturthi = new Festival();
        ganeshChaturthi.id = 9;
        ganeshChaturthi.name = "Ganesh Chaturthi";
        ganeshChaturthi.location = "India";
        ganeshChaturthi.season = "Autumn";
        ganeshChaturthi.numberOfDays = 10;
        ganeshChaturthi.isReligious = true;
        ganeshChaturthi.getFestivalDetails();

        Festival navratri = new Festival();
        navratri.id = 10;
        navratri.name = "Navratri";
        navratri.location = "India";
        navratri.season = "Autumn";
        navratri.numberOfDays = 9;
        navratri.isReligious = true;
        navratri.getFestivalDetails();

        Festival pongal = new Festival();
        pongal.id = 11;
        pongal.name = "Pongal";
        pongal.location = "Tamil Nadu";
        pongal.season = "Winter";
        pongal.numberOfDays = 4;
        pongal.isReligious = true;
        pongal.getFestivalDetails();

        Festival rakshaBandhan = new Festival();
        rakshaBandhan.id = 12;
        rakshaBandhan.name = "Raksha Bandhan";
        rakshaBandhan.location = "India";
        rakshaBandhan.season = "Monsoon";
        rakshaBandhan.numberOfDays = 1;
        rakshaBandhan.isReligious = true;
        rakshaBandhan.getFestivalDetails();

        Festival baisakhi = new Festival();
        baisakhi.id = 13;
        baisakhi.name = "Baisakhi";
        baisakhi.location = "Punjab";
        baisakhi.season = "Spring";
        baisakhi.numberOfDays = 1;
        baisakhi.isReligious = true;
        baisakhi.getFestivalDetails();

        Festival durgaPuja = new Festival();
        durgaPuja.id = 14;
        durgaPuja.name = "Durga Puja";
        durgaPuja.location = "West Bengal";
        durgaPuja.season = "Autumn";
        durgaPuja.numberOfDays = 5;
        durgaPuja.isReligious = true;
        durgaPuja.getFestivalDetails();

        Festival karvaChauth = new Festival();
        karvaChauth.id = 15;
        karvaChauth.name = "Karva Chauth";
        karvaChauth.location = "North India";
        karvaChauth.season = "Autumn";
        karvaChauth.numberOfDays = 1;
        karvaChauth.isReligious = true;
        karvaChauth.getFestivalDetails();

        Festival lohri = new Festival();
        lohri.id = 16;
        lohri.name = "Lohri";
        lohri.location = "Punjab";
        lohri.season = "Winter";
        lohri.numberOfDays = 1;
        lohri.isReligious = false;
        lohri.getFestivalDetails();

        Festival easter = new Festival();
        easter.id = 17;
        easter.name = "Easter";
        easter.location = "Worldwide";
        easter.season = "Spring";
        easter.numberOfDays = 1;
        easter.isReligious = true;
        easter.getFestivalDetails();

        Festival vesak = new Festival();
        vesak.id = 18;
        vesak.name = "Vesak";
        vesak.location = "Sri Lanka";
        vesak.season = "Spring";
        vesak.numberOfDays = 1;
        vesak.isReligious = true;
        vesak.getFestivalDetails();

        Festival bonfireNight = new Festival();
        bonfireNight.id = 19;
        bonfireNight.name = "Bonfire Night";
        bonfireNight.location = "UK";
        bonfireNight.season = "Autumn";
        bonfireNight.numberOfDays = 1;
        bonfireNight.isReligious = false;
        bonfireNight.getFestivalDetails();

        Festival songkran = new Festival();
        songkran.id = 20;
        songkran.name = "Songkran";
        songkran.location = "Thailand";
        songkran.season = "Summer";
        songkran.numberOfDays = 3;
        songkran.isReligious = false;
        songkran.getFestivalDetails();

        System.out.println("Main Ended");
    }
}

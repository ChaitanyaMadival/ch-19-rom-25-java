class CourtCaseRunner{

    public static void main(String court[]) {
	
        System.out.println("Main Started");

        CourtCase case1 = new CourtCase();
        case1.id = 1;
        case1.caseTitle = "State vs John";
        case1.caseType = "Criminal";
        case1.petitioner = "State";
        case1.respondent = "John";
        case1.yearOfFiling = 2020;
        case1.getCourtCaseDetails();

        CourtCase case2 = new CourtCase();
        case2.id = 2;
        case2.caseTitle = "Alice vs Bob";
        case2.caseType = "Civil";
        case2.petitioner = "Alice";
        case2.respondent = "Bob";
        case2.yearOfFiling = 2019;
        case2.getCourtCaseDetails();

        CourtCase case3 = new CourtCase();
        case3.id = 3;
        case3.caseTitle = "Company A vs B";
        case3.caseType = "Corporate";
        case3.petitioner = "Company A";
        case3.respondent = "Company B";
        case3.yearOfFiling = 2021;
        case3.getCourtCaseDetails();

        CourtCase case4 = new CourtCase();
        case4.id = 4;
        case4.caseTitle = "Priya vs State";
        case4.caseType = "Criminal";
        case4.petitioner = "Priya";
        case4.respondent = "State";
        case4.yearOfFiling = 2020;
        case4.getCourtCaseDetails();

        CourtCase case5 = new CourtCase();
        case5.id = 5;
        case5.caseTitle = "XYZ Ltd vs ABC Corp";
        case5.caseType = "Commercial";
        case5.petitioner = "XYZ Ltd";
        case5.respondent = "ABC Corp";
        case5.yearOfFiling = 2023;
        case5.getCourtCaseDetails();

        CourtCase case6 = new CourtCase();
        case6.id = 6;
        case6.caseTitle = "Ram vs Shyam";
        case6.caseType = "Property";
        case6.petitioner = "Ram";
        case6.respondent = "Shyam";
        case6.yearOfFiling = 2018;
        case6.getCourtCaseDetails();

        CourtCase case7 = new CourtCase();
        case7.id = 7;
        case7.caseTitle = "Union vs Worker Union";
        case7.caseType = "Labor";
        case7.petitioner = "Union";
        case7.respondent = "Worker Union";
        case7.yearOfFiling = 2022;
        case7.getCourtCaseDetails();

        CourtCase case8 = new CourtCase();
        case8.id = 8;
        case8.caseTitle = "Tenant vs Landlord";
        case8.caseType = "Civil";
        case8.petitioner = "Tenant";
        case8.respondent = "Landlord";
        case8.yearOfFiling = 2021;
        case8.getCourtCaseDetails();

        CourtCase case9 = new CourtCase();
        case9.id = 9;
        case9.caseTitle = "NGO vs Government";
        case9.caseType = "Public Interest";
        case9.petitioner = "NGO";
        case9.respondent = "Govt";
        case9.yearOfFiling = 2020;
        case9.getCourtCaseDetails();

        CourtCase case10 = new CourtCase();
        case10.id = 10;
        case10.caseTitle = "Citizens vs Builder";
        case10.caseType = "Consumer";
        case10.petitioner = "Citizens";
        case10.respondent = "Builder";
        case10.yearOfFiling = 2019;
        case10.getCourtCaseDetails();

        CourtCase case11 = new CourtCase();
        case11.id = 11;
        case11.caseTitle = "Heirs vs Trust";
        case11.caseType = "Inheritance";
        case11.petitioner = "Heirs";
        case11.respondent = "Trust";
        case11.yearOfFiling = 2022;
        case11.getCourtCaseDetails();

        CourtCase case12 = new CourtCase();
        case12.id = 12;
        case12.caseTitle = "Activist vs Govt";
        case12.caseType = "Public Interest";
        case12.petitioner = "Activist";
        case12.respondent = "Govt";
        case12.yearOfFiling = 2023;
        case12.getCourtCaseDetails();

        CourtCase case13 = new CourtCase();
        case13.id = 13;
        case13.caseTitle = "Ravi vs Ravi";
        case13.caseType = "Family";
        case13.petitioner = "Ravi";
        case13.respondent = "Ravi";
        case13.yearOfFiling = 2021;
        case13.getCourtCaseDetails();

        CourtCase case14 = new CourtCase();
        case14.id = 14;
        case14.caseTitle = "City Council vs Resident";
        case14.caseType = "Civic";
        case14.petitioner = "City Council";
        case14.respondent = "Resident";
        case14.yearOfFiling = 2020;
        case14.getCourtCaseDetails();

        CourtCase case15 = new CourtCase();
        case15.id = 15;
        case15.caseTitle = "Shiv vs Inspector";
        case15.caseType = "Criminal";
        case15.petitioner = "Shiv";
        case15.respondent = "Inspector";
        case15.yearOfFiling = 2022;
        case15.getCourtCaseDetails();

        CourtCase case16 = new CourtCase();
        case16.id = 16;
        case16.caseTitle = "Anil vs Bank";
        case16.caseType = "Finance";
        case16.petitioner = "Anil";
        case16.respondent = "Bank";
        case16.yearOfFiling = 2023;
        case16.getCourtCaseDetails();

        CourtCase case17 = new CourtCase();
        case17.id = 17;
        case17.caseTitle = "Public vs Toll Company";
        case17.caseType = "Consumer";
        case17.petitioner = "Public";
        case17.respondent = "Toll Company";
        case17.yearOfFiling = 2019;
        case17.getCourtCaseDetails();

        CourtCase case18 = new CourtCase();
        case18.id = 18;
        case18.caseTitle = "Writer vs Publisher";
        case18.caseType = "Copyright";
        case18.petitioner = "Writer";
        case18.respondent = "Publisher";
        case18.yearOfFiling = 2021;
        case18.getCourtCaseDetails();

        CourtCase case19 = new CourtCase();
        case19.id = 19;
        case19.caseTitle = "Lata vs Hospital";
        case19.caseType = "Medical";
        case19.petitioner = "Lata";
        case19.respondent = "Hospital";
        case19.yearOfFiling = 2020;
        case19.getCourtCaseDetails();

        CourtCase case20 = new CourtCase();
        case20.id = 20;
        case20.caseTitle = "Farmer vs Land Authority";
        case20.caseType = "Agricultural Dispute";
        case20.petitioner = "Farmer";
        case20.respondent = "Land Authority";
        case20.yearOfFiling = 2022;
        case20.getCourtCaseDetails();

        System.out.println("Main Ended");
    }
}

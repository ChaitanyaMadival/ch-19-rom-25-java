public class CourtCaseRunner {
    public static void main(String court[]) {
        System.out.println("Main Started");

        CourtCase case1 = new CourtCase(1, "State vs John", "Criminal", "State", "John", 2020);
        case1.getCourtCaseDetails();

        CourtCase case2 = new CourtCase(2, "Alice vs Bob", "Civil", "Alice", "Bob", 2019);
        case2.getCourtCaseDetails();

        CourtCase case3 = new CourtCase(3, "Company A vs B", "Corporate", "Company A", "Company B", 2021);
        case3.getCourtCaseDetails();

        CourtCase case4 = new CourtCase(4, "Priya vs State", "Criminal", "Priya", "State", 2020);
        case4.getCourtCaseDetails();

        CourtCase case5 = new CourtCase(5, "XYZ Ltd vs ABC Corp", "Commercial", "XYZ Ltd", "ABC Corp", 2023);
        case5.getCourtCaseDetails();

        CourtCase case6 = new CourtCase(6, "Ram vs Shyam", "Property", "Ram", "Shyam", 2018);
        case6.getCourtCaseDetails();

        CourtCase case7 = new CourtCase(7, "Union vs Worker Union", "Labor", "Union", "Worker Union", 2022);
        case7.getCourtCaseDetails();

        CourtCase case8 = new CourtCase(8, "Tenant vs Landlord", "Civil", "Tenant", "Landlord", 2021);
        case8.getCourtCaseDetails();

        CourtCase case9 = new CourtCase(9, "NGO vs Government", "Public Interest", "NGO", "Govt", 2020);
        case9.getCourtCaseDetails();

        CourtCase case10 = new CourtCase(10, "Citizens vs Builder", "Consumer", "Citizens", "Builder", 2019);
        case10.getCourtCaseDetails();

        CourtCase case11 = new CourtCase(11, "Heirs vs Trust", "Inheritance", "Heirs", "Trust", 2022);
        case11.getCourtCaseDetails();

        CourtCase case12 = new CourtCase(12, "Activist vs Govt", "Public Interest", "Activist", "Govt", 2023);
        case12.getCourtCaseDetails();

        CourtCase case13 = new CourtCase(13, "Ravi vs Ravi", "Family", "Ravi", "Ravi", 2021);
        case13.getCourtCaseDetails();

        CourtCase case14 = new CourtCase(14, "City Council vs Resident", "Civic", "City Council", "Resident", 2020);
        case14.getCourtCaseDetails();

        CourtCase case15 = new CourtCase(15, "Shiv vs Inspector", "Criminal", "Shiv", "Inspector", 2022);
        case15.getCourtCaseDetails();

        CourtCase case16 = new CourtCase(16, "Anil vs Bank", "Finance", "Anil", "Bank", 2023);
        case16.getCourtCaseDetails();

        CourtCase case17 = new CourtCase(17, "Public vs Toll Company", "Consumer", "Public", "Toll Company", 2019);
        case17.getCourtCaseDetails();

        CourtCase case18 = new CourtCase(18, "Writer vs Publisher", "Copyright", "Writer", "Publisher", 2021);
        case18.getCourtCaseDetails();

        CourtCase case19 = new CourtCase(19, "Lata vs Hospital", "Medical", "Lata", "Hospital", 2020);
        case19.getCourtCaseDetails();

        CourtCase case20 = new CourtCase(20, "Farmer vs Land Authority", "Agricultural Dispute", "Farmer", "Land Authority", 2022);
        case20.getCourtCaseDetails();

        System.out.println("Main Ended");
    }
}

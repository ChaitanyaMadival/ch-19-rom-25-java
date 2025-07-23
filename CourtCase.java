class CourtCase{

    int id;
    String caseTitle;
    String caseType;
    String petitioner;
    String respondent;
    int yearOfFiling;

    void getCourtCaseDetails(){
		
        System.out.println("Case ID: " + id);
        System.out.println("Case Title: " + caseTitle);
        System.out.println("Case Type: " + caseType);
        System.out.println("Petitioner: " + petitioner);
        System.out.println("Respondent: " + respondent);
        System.out.println("Year of Filing: " + yearOfFiling);
        System.out.println("------------");
    }
}

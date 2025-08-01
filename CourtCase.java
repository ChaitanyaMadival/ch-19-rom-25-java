public class CourtCase {
    int id;
    String caseTitle;
    String caseType;
    String petitioner;
    String respondent;
    int yearOfFiling;

    public CourtCase(int id, String caseTitle, String caseType, String petitioner, String respondent, int yearOfFiling) {
        this.id = id;
        this.caseTitle = caseTitle;
        this.caseType = caseType;
        this.petitioner = petitioner;
        this.respondent = respondent;
        this.yearOfFiling = yearOfFiling;
    }

    public void getCourtCaseDetails() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + caseTitle);
        System.out.println("Type: " + caseType);
        System.out.println("Petitioner: " + petitioner);
        System.out.println("Respondent: " + respondent);
        System.out.println("Year of Filing: " + yearOfFiling);
        System.out.println("------------------\n");
    }
}

class Politician {

    int id;
    String name;
    String party;
    String position;
    String constituency;
    int yearsInPolitics;
	
	Politician(int id, String name, String party,String position, String constituency,int yearsInPolitics){
		this.id = id;
		this.name = name;
		this.party = party;
		this.position = position;
		this.constituency = constituency;
		this.yearsInPolitics = yearsInPolitics;
	}

    void getPoliticianDetails() {
        System.out.println("Politician ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Position: " + position);
        System.out.println("Constituency: " + constituency);
        System.out.println("Years in Politics: " + yearsInPolitics);
        System.out.println("---------------");
    }
}

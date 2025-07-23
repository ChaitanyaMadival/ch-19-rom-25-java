class GitTag {

    int id;
    String tagName;
    String commitHash;
    String author;
    String date;

    public void getTagDetails() {
        System.out.println("Tag ID: " + id);
        System.out.println("Tag Name: " + tagName);
        System.out.println("Commit Hash: " + commitHash);
        System.out.println("Author: " + author);
        System.out.println("Date: " + date);
        System.out.println("-----------------");
    }
}

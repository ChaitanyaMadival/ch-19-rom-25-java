class GitTag {
    int id;
    String tagName;
    String commitHash;
    String author;
    String date;

    GitTag(int id, String tagName, String commitHash, String author, String date) {
        this.id = id;
        this.tagName = tagName;
        this.commitHash = commitHash;
        this.author = author;
        this.date = date;
    }

    void getTagDetails() {
        System.out.println("ID: " + id);
        System.out.println("Tag: " + tagName);
        System.out.println("Commit Hash: " + commitHash);
        System.out.println("Author: " + author);
        System.out.println("Date: " + date);
        System.out.println("-------------------");
    }
}

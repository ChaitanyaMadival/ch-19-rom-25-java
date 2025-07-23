class GitTagRunner {

    public static void main(String tag[]) {
        System.out.println("Main Started");

        GitTag tag1 = new GitTag();
        tag1.id = 1;
        tag1.tagName = "v1.0";
        tag1.commitHash = "a1b2c3d4";
        tag1.author = "Alice";
        tag1.date = "2023-01-15";
        tag1.getTagDetails();

        GitTag tag2 = new GitTag();
        tag2.id = 2;
        tag2.tagName = "v1.1";
        tag2.commitHash = "b2c3d4e5";
        tag2.author = "Bob";
        tag2.date = "2023-02-10";
        tag2.getTagDetails();

        GitTag tag3 = new GitTag();
        tag3.id = 3;
        tag3.tagName = "v1.2";
        tag3.commitHash = "c3d4e5f6";
        tag3.author = "Carol";
        tag3.date = "2023-03-05";
        tag3.getTagDetails();

        GitTag tag4 = new GitTag();
        tag4.id = 4;
        tag4.tagName = "v2.0";
        tag4.commitHash = "d4e5f6g7";
        tag4.author = "Dave";
        tag4.date = "2023-04-01";
        tag4.getTagDetails();

        GitTag tag5 = new GitTag();
        tag5.id = 5;
        tag5.tagName = "v2.1";
        tag5.commitHash = "e5f6g7h8";
        tag5.author = "Eve";
        tag5.date = "2023-05-12";
        tag5.getTagDetails();

        GitTag tag6 = new GitTag();
        tag6.id = 6;
        tag6.tagName = "v2.2";
        tag6.commitHash = "f6g7h8i9";
        tag6.author = "Frank";
        tag6.date = "2023-06-18";
        tag6.getTagDetails();

        GitTag tag7 = new GitTag();
        tag7.id = 7;
        tag7.tagName = "v3.0";
        tag7.commitHash = "g7h8i9j0";
        tag7.author = "Grace";
        tag7.date = "2023-07-20";
        tag7.getTagDetails();

        GitTag tag8 = new GitTag();
        tag8.id = 8;
        tag8.tagName = "v3.1";
        tag8.commitHash = "h8i9j0k1";
        tag8.author = "Hank";
        tag8.date = "2023-08-25";
        tag8.getTagDetails();

        GitTag tag9 = new GitTag();
        tag9.id = 9;
        tag9.tagName = "v3.2";
        tag9.commitHash = "i9j0k1l2";
        tag9.author = "Ivy";
        tag9.date = "2023-09-10";
        tag9.getTagDetails();

        GitTag tag10 = new GitTag();
        tag10.id = 10;
        tag10.tagName = "v4.0";
        tag10.commitHash = "j0k1l2m3";
        tag10.author = "Jack";
        tag10.date = "2023-10-05";
        tag10.getTagDetails();

        GitTag tag11 = new GitTag();
        tag11.id = 11;
        tag11.tagName = "v4.1";
        tag11.commitHash = "k1l2m3n4";
        tag11.author = "Karen";
        tag11.date = "2023-11-11";
        tag11.getTagDetails();

        GitTag tag12 = new GitTag();
        tag12.id = 12;
        tag12.tagName = "v4.2";
        tag12.commitHash = "l2m3n4o5";
        tag12.author = "Leo";
        tag12.date = "2023-12-01";
        tag12.getTagDetails();

        GitTag tag13 = new GitTag();
        tag13.id = 13;
        tag13.tagName = "v5.0";
        tag13.commitHash = "m3n4o5p6";
        tag13.author = "Mia";
        tag13.date = "2024-01-15";
        tag13.getTagDetails();

        GitTag tag14 = new GitTag();
        tag14.id = 14;
        tag14.tagName = "v5.1";
        tag14.commitHash = "n4o5p6q7";
        tag14.author = "Nick";
        tag14.date = "2024-02-20";
        tag14.getTagDetails();

        GitTag tag15 = new GitTag();
        tag15.id = 15;
        tag15.tagName = "v5.2";
        tag15.commitHash = "o5p6q7r8";
        tag15.author = "Olivia";
        tag15.date = "2024-03-25";
        tag15.getTagDetails();

        GitTag tag16 = new GitTag();
        tag16.id = 16;
        tag16.tagName = "v6.0";
        tag16.commitHash = "p6q7r8s9";
        tag16.author = "Paul";
        tag16.date = "2024-04-30";
        tag16.getTagDetails();

        GitTag tag17 = new GitTag();
        tag17.id = 17;
        tag17.tagName = "v6.1";
        tag17.commitHash = "q7r8s9t0";
        tag17.author = "Quincy";
        tag17.date = "2024-05-10";
        tag17.getTagDetails();

        GitTag tag18 = new GitTag();
        tag18.id = 18;
        tag18.tagName = "v6.2";
        tag18.commitHash = "r8s9t0u1";
        tag18.author = "Rachel";
        tag18.date = "2024-06-15";
        tag18.getTagDetails();

        GitTag tag19 = new GitTag();
        tag19.id = 19;
        tag19.tagName = "v7.0";
        tag19.commitHash = "s9t0u1v2";
        tag19.author = "Steve";
        tag19.date = "2024-07-20";
        tag19.getTagDetails();

        GitTag tag20 = new GitTag();
        tag20.id = 20;
        tag20.tagName = "v7.1";
        tag20.commitHash = "t0u1v2w3";
        tag20.author = "Tina";
        tag20.date = "2024-08-25";
        tag20.getTagDetails();

        System.out.println("Main Ended");
    }
}

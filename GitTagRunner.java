class GitTagRunner {

    public static void main(String tag[]) {
        System.out.println("Main Started");

        GitTag tag1 = new GitTag(1, "v1.0", "a1b2c3d4", "Alice", "2023-01-15");
        tag1.getTagDetails();

        GitTag tag2 = new GitTag(2, "v1.1", "b2c3d4e5", "Bob", "2023-02-10");
        tag2.getTagDetails();

        GitTag tag3 = new GitTag(3, "v1.2", "c3d4e5f6", "Carol", "2023-03-05");
        tag3.getTagDetails();

        GitTag tag4 = new GitTag(4, "v2.0", "d4e5f6g7", "Dave", "2023-04-01");
        tag4.getTagDetails();

        GitTag tag5 = new GitTag(5, "v2.1", "e5f6g7h8", "Eve", "2023-05-12");
        tag5.getTagDetails();

        GitTag tag6 = new GitTag(6, "v2.2", "f6g7h8i9", "Frank", "2023-06-18");
        tag6.getTagDetails();

        GitTag tag7 = new GitTag(7, "v3.0", "g7h8i9j0", "Grace", "2023-07-20");
		tag7.getTagDetails();

		GitTag tag8 = new GitTag(8, "v3.1", "h8i9j0k1", "Hank", "2023-08-25");
		tag8.getTagDetails();

		GitTag tag9 = new GitTag(9, "v3.2", "i9j0k1l2", "Ivy", "2023-09-10");
		tag9.getTagDetails();

		GitTag tag10 = new GitTag(10, "v4.0", "j0k1l2m3", "Jack", "2023-10-05");
		tag10.getTagDetails();

		GitTag tag11 = new GitTag(11, "v4.1", "k1l2m3n4", "Karen", "2023-11-11");
		tag11.getTagDetails();

		GitTag tag12 = new GitTag(12, "v4.2", "l2m3n4o5", "Leo", "2023-12-01");
		tag12.getTagDetails();

		GitTag tag13 = new GitTag(13, "v5.0", "m3n4o5p6", "Mia", "2024-01-15");
		tag13.getTagDetails();

		GitTag tag14 = new GitTag(14, "v5.1", "n4o5p6q7", "Nick", "2024-02-20");
		tag14.getTagDetails();

		GitTag tag15 = new GitTag(15, "v5.2", "o5p6q7r8", "Olivia", "2024-03-25");
		tag15.getTagDetails();

		GitTag tag16 = new GitTag(16, "v6.0", "p6q7r8s9", "Paul", "2024-04-30");
		tag16.getTagDetails();

		GitTag tag17 = new GitTag(17, "v6.1", "q7r8s9t0", "Quincy", "2024-05-10");
		tag17.getTagDetails();

		GitTag tag18 = new GitTag(18, "v6.2", "r8s9t0u1", "Rachel", "2024-06-15");
		tag18.getTagDetails();

		GitTag tag19 = new GitTag(19, "v7.0", "s9t0u1v2", "Steve", "2024-07-20");
		tag19.getTagDetails();


        GitTag tag20 = new GitTag(20, "v7.1", "t0u1v2w3", "Tina", "2024-08-25");
        tag20.getTagDetails();

        System.out.println("Main Ended");
    }
}

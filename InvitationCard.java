class InvitationCard {

    int id;
    String eventName;
    String hostName;
    String date;
    String time;
    String venue;

    void getInvitationDetails() {
        System.out.println("Invitation ID: " + id);
        System.out.println("Event Name: " + eventName);
        System.out.println("Host Name: " + hostName);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Venue: " + venue);
        System.out.println("-----------------");
    }
}

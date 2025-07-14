class GoogleWebsite {

    static String name;
    static String url;
    static String ceo;
    static String headquarters;
    static int foundedYear;

    public static boolean registerWebsite(String n, String u, String c, String hq, int year) {
        boolean isRegistered = false;
        boolean nameValid = false;
        boolean urlValid = false;
        boolean ceoValid = false;
        boolean hqValid = false;
        boolean yearValid = false;

        if (n != null) {
            name = n;
            nameValid = true;
        }

        if (u != null && (u.startsWith("http://") || u.startsWith("https://"))) {
            url = u;
            urlValid = true;
        }

        if (c != null) {
            ceo = c;
            ceoValid = true;
        }

        if (hq != null) {
            headquarters = hq;
            hqValid = true;
        }

        if (year > 1990 && year <= 2025) {
            foundedYear = year;
            yearValid = true;
        }

        if (nameValid && urlValid && ceoValid && hqValid && yearValid) {
            System.out.println("All fields are valid. Website registered.");
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getWebsiteInfo() {
        System.out.println("Website Name: " + name);
        System.out.println("URL: " + url);
        System.out.println("CEO: " + ceo);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Founded Year: " + foundedYear);
    }
}

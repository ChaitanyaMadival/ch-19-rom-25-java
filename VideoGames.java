class VideoGames {
	
	static String title;
    static String genre;
    static String platform;
    static String developer;
    static String publisher;
    static int releaseYear;
    static boolean isMultiplayer;
    static boolean hasOnlineMode;
    static String gameEngine;
    static double sizeInGb;
    static String rating;
    static String mainCharacter;
    static int totalLevels;
    static boolean hasDlc;
    static double price; 
    static boolean supportsController;
    static String language;
    static int averagePlayTime; 
    static boolean hasVrSupport;
    static String soundtrackComposer; 
	
	public static void main(String games[]) {
	
		System.out.println("Game Title: " +title);
        System.out.println("Genre: " +genre);
        System.out.println("Platform: " +platform);
        System.out.println("Developer: " +developer);
        System.out.println("Publisher: " +publisher);
        System.out.println("Release Year: " +releaseYear);
        System.out.println("Multiplayer: " +isMultiplayer);
        System.out.println("Online Mode: " +hasOnlineMode);
        System.out.println("Game Engine: " +gameEngine);
        System.out.println("Size: " +sizeInGb+ " GB");
        System.out.println("Rating: " +rating);
        System.out.println("Main Character: " +mainCharacter);
        System.out.println("Total Levels: " +totalLevels);
        System.out.println("Has DLC: " +hasDlc);
        System.out.println("Price: ₹" + price);
        System.out.println("Controller Support: " +supportsController);
        System.out.println("Language: " +language);
        System.out.println("Average Play Time: " + averagePlayTime + " hours");
        System.out.println("VR Support: " +hasVrSupport);
        System.out.println("Soundtrack Composer: " +soundtrackComposer);
		
		System.out.println("-------           -------");
		
		title = "Legend of Shadows";
		genre = "Action-Adventure";
		platform = "PC";
		developer = "Phantom Studios";
		publisher = "Nova Games";
		releaseYear = 2024;
		isMultiplayer = true;
		hasOnlineMode = true;
		gameEngine = "Unreal Engine 5";
		sizeInGb = 75.5;
		rating = "Teen";
		mainCharacter = "Kairo Blade";
		totalLevels = 40;
		hasDlc = true;
		price = 1999.99; 
		supportsController = true;
		language = "English";
		averagePlayTime = 60; 
		hasVrSupport = false;
		soundtrackComposer = "Lena Arkwell"; 
		
		System.out.println("Game Title: " +title);
        System.out.println("Genre: " +genre);
        System.out.println("Platform: " +platform);
        System.out.println("Developer: " +developer);
        System.out.println("Publisher: " +publisher);
        System.out.println("Release Year: " +releaseYear);
        System.out.println("Multiplayer: " +isMultiplayer);
        System.out.println("Online Mode: " +hasOnlineMode);
        System.out.println("Game Engine: " +gameEngine);
        System.out.println("Size: " +sizeInGb+ " GB");
        System.out.println("Rating: " +rating);
        System.out.println("Main Character: " +mainCharacter);
        System.out.println("Total Levels: " +totalLevels);
        System.out.println("Has DLC: " +hasDlc);
        System.out.println("Price: ₹" + price);
        System.out.println("Controller Support: " +supportsController);
        System.out.println("Language: " +language);
        System.out.println("Average Play Time: " + averagePlayTime + " hours");
        System.out.println("VR Support: " +hasVrSupport);
        System.out.println("Soundtrack Composer: " +soundtrackComposer);
	}
}
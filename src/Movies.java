import java.util.ArrayList;
import java.util.Arrays;

/**
 * Threw these in a separate class to keep things tidy
 */
public class Movies {

    public static final Movie SHREK = new DVD("Shrek", "Animated",90, new ArrayList<>(Arrays.asList(
            "Invasion of Lord Farquaad",
            "Shrek and Donkey Pull Up",
            "Shrek and Donkey Save Fiona",
            "Fiona's Actually an Ogre Too",
            "Shrek Crashes the Wedding",
            "Dragon Also Crashes the Wedding",
            "Happily Ever After"
    )));

    public static final Movie SPACE_JAM = new DVD("Space Jam", "Documentary", 120, new ArrayList<>(Arrays.asList(
            "Come on and slam, and welcome to the jam",
            "Come on and slam, if you wanna jam",
            "Hey you, watcha gonna do",
            "Hey you, watcha gonna do",
            "Hey you, watcha gonna do",
            "Hey you, watcha gonna do"
    )));

    public static final Movie SPACE_ODYSSEY = new VHS("2001: A Space Odyssey", "Sci-fi", 142, new ArrayList<>(Arrays.asList(
            "Apes find Monolith",
            "Apes discover tool",
            "Apes become man",
            "Man creates AI",
            "Man goes to space"
    )));

    public static final Movie TAXI_DRIVER = new VHS("Taxi Driver", "Documentary", 114, new ArrayList<>(Arrays.asList(
            "Taxi Driver becomes a Taxi Driver",
            "Taxi Driver Goes to the Movies",
            "Taxi Driver Pulls Up"
    )));


}

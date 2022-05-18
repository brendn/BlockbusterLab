import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Blockbuster {

    public static final ArrayList<Movie> MOVIES = new ArrayList<>(Arrays.asList(
            Movies.SHREK, Movies.SPACE_JAM, Movies.SPACE_ODYSSEY, Movies.TAXI_DRIVER
    ));

    public static void main(String[] args) {
        boolean takeInput = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to GC Blockbuster!");

        String s = "";
        while (takeInput) {
            // Displays each movie
            System.out.println("Please Select a Movie from the list:");
            for (int i = 0; i < MOVIES.size(); i++) {
                Movie movie = MOVIES.get(i);
                // We're using i + 1 so it displays as 1-X instead of 0-X
                System.out.printf("\t%d) %s%n", i + 1, movie.getTitle());
            }
            // Ask for movie index
            s = scanner.nextLine();
            int index = getInt(s);
            // Select movie
            if (index != -1) {
                Movie movie = MOVIES.get(index);
                // Display movie information and ask user for confirmation to play
                movie.printInfo();
                System.out.println("Do you want to watch the movie? Y/N");
                s = scanner.nextLine();
                if (s.toLowerCase(Locale.ROOT).startsWith("y")) {
                    movie.play();
                    takeInput = false;
                }
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }

    public static int getInt(String s) {
        return Integer.parseInt(0 + s.replaceAll("\\D+","")) - 1;
    }

}

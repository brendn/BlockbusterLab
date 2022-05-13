import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DVD extends Movie {

    private final String MESSAGE_WHICH_SCENE = "Which Scene of the DVD %s would you like to watch? Select 1 to %d%n";
    private final String MESSAGE_CONTINUE = "Watch another scene? (y/n)";

    public DVD(String title, String category, int runtime, ArrayList<String> scenes) {
        super(title, category, runtime, scenes);
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean takeInput = true;
        String input = "";

        while (takeInput) {
            System.out.printf(MESSAGE_WHICH_SCENE, getTitle(), getScenes().size() + 1);
            input = scanner.nextLine();

            int index = Blockbuster.getInt(input);
            if (index + 1 <= getScenes().size() && index != -1) {
                System.out.printf("Scene %d: %s%n", index + 1, getScenes().get(index));
                System.out.println(MESSAGE_CONTINUE);
                input = scanner.nextLine();
                if (input.toLowerCase(Locale.ROOT).startsWith("n")) {
                    takeInput = false;
                }
            }
        }

        scanner.close();
    }
}

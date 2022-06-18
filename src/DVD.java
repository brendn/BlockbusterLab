import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DVD implements Play {

    private final String MESSAGE_WHICH_SCENE = "Which Scene of the DVD would you like to watch? Select 1 to %d%n";
    private final String MESSAGE_CONTINUE = "Watch another scene? (y/n)";

    @Override
    public void play(List<String> scenes) {
        Scanner scanner = new Scanner(System.in);
        boolean takeInput = true;
        String input = "";

        while (takeInput) {
            System.out.printf(MESSAGE_WHICH_SCENE, scenes.size() + 1);
            input = scanner.nextLine();

            int index = Blockbuster.getInt(input);
            if (index + 1 <= scenes.size() && index != -1) {
                System.out.printf("Scene %d: %s%n", index + 1, scenes.get(index));
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

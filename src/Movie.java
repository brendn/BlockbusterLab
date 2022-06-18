import java.util.ArrayList;

public class Movie {

    private Play play;

    private String title;

    private ArrayList<String> scenes;

    private int runtime;

    public Movie(String title, int runtime, ArrayList<String> scenes, Play play) {
        this.title = title;
        this.runtime = runtime;
        this.scenes = scenes;
        this.play = play;
    }

    public void printInfo() {
        System.out.println(getTitle());
        System.out.printf("Runtime: %d minutes%n", getRuntime());
    }

    public void play() {
        play.play(scenes);
    }

    public String getTitle() {
        return title;
    }

    public int getRuntime() {
        return runtime;
    }

    public ArrayList<String> getScenes() {
        return scenes;
    }

    public Play getPlay() {
        return play;
    }
}

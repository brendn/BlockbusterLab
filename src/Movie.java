import java.util.ArrayList;

public abstract class Movie {

    private String title;

    private String category;

    private ArrayList<String> scenes = new ArrayList<>();

    private int runtime;

    public Movie(String title, String category, int runtime, ArrayList<String> scenes) {
        this.title = title;
        this.category = category;
        this.runtime = runtime;
        this.scenes = scenes;
    }

    public abstract void play();

    private void printInfo() {
        System.out.println(getTitle());
        System.out.printf("Runtime: %d minutes", getRuntime());
    }

    private void printScenes() {
        scenes.forEach(s -> System.out.printf("%d %s", runtime, title));
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

    public Movie setScenes(ArrayList<String> scenes) {
        this.scenes = scenes;
        return this;
    }

    public String getCategory() {
        return category;
    }
}

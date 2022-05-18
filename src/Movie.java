import java.util.ArrayList;

public abstract class Movie {

    private String title;

    private String category;

    private ArrayList<String> scenes;

    private int runtime;

    public Movie(String title, String category, int runtime, ArrayList<String> scenes) {
        this.title = title;
        this.category = category;
        this.runtime = runtime;
        this.scenes = scenes;
    }

    public abstract void play();

    public void printInfo() {
        System.out.println(getTitle());
        System.out.printf("Category: %s%nRuntime: %d minutes%n", getCategory(), getRuntime());
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

    public String getCategory() {
        return category;
    }
}

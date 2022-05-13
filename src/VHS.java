import java.util.ArrayList;

public class VHS extends Movie {

    private int currentTime = 0;

    public VHS(String title, String category, int runtime, ArrayList<String> scenes) {
        super(title, category, runtime, scenes);
    }

    @Override
    public void play() {
        if (currentTime < getScenes().size()) {
            System.out.printf("Scene %d: %s%n", currentTime + 1, getScenes().get(currentTime));
            currentTime++;
        } else if (currentTime >= getScenes().size()) {
            rewind();
        }
    }

    public int getCurrentTime() {
        return currentTime;
    }

    /**
     * Be kind, rewind!
     */
    public void rewind() {
        this.currentTime = 0;
    }
}

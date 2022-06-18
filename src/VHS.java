import java.util.List;

public class VHS implements Play {

    private int currentTime = 0;

    @Override
    public void play(List<String> scenes) {
        if (currentTime < scenes.size()) {
            System.out.printf("Scene %d: %s%n", currentTime + 1, scenes.get(currentTime));
            currentTime++;
        } else if (currentTime >= scenes.size()) {
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

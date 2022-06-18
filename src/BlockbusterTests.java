import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BlockbusterTests {

    @Test
    void testVHS() {
        //Check constructor functionality
        Movie movie = new Movie("title", 90, new ArrayList<>(Arrays.asList("a", "b", "c")), new VHS());
        VHS vhs = (VHS)movie.getPlay();
        String expectedTitle = "title";
        int expectedRuntime = 90;
        assertEquals(movie.getTitle(), expectedTitle);
        assertEquals(movie.getRuntime(), expectedRuntime);

        //Check play function increments runtime
        assertEquals(vhs.getCurrentTime(), 0);
        movie.play();
        assertEquals(vhs.getCurrentTime(), 1);

        //Check rewind direct call functionality
        vhs.rewind();
        assertEquals(vhs.getCurrentTime(), 0);

        //Check automatic rewind functionality
        for (int i = 0; i < movie.getScenes().size() + 1; i++) {
            movie.play();
        }
        assertEquals(vhs.getCurrentTime(), 0);
    }

    @Test
    void testDVD() {
        //Check constructor functionality
        Movie dvd = new Movie("title", 90, new ArrayList<>(Arrays.asList("a", "b", "c")), new DVD());
        String expectedTitle = "title";
        int expectedRuntime = 90;
        assertEquals(dvd.getTitle(), expectedTitle);
        assertEquals(dvd.getRuntime(), expectedRuntime);
    }

}

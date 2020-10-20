package pathTraversal;

import java.util.UUID;
import java.io.File;

public class PTTest2 {
    private final String BASE_DIRECTORY ="/users/ws/profiles/";
    public void test(String file) {
        sink(file);
    }

    private void sink(String filename) {
        File myFile = new File(BASE_DIRECTORY , filename);
        myFile.delete();
    }
}

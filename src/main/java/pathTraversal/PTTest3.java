package pathTraversal;

import java.util.UUID;
import java.io.File;

public class PTTest3 {
    private final String BASE_DIRECTORY = "/users/ws/profiles/";
    public void test(String fileName, String customDirName) {
        try {
            String dirPath = getValue(BASE_DIRECTORY) + customDirName + "subsubdir/";
            File myFile = new File(dirPath + fileName);
            myFile.delete();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getValue(String str){
        return str+ "userdir/";
    }

}
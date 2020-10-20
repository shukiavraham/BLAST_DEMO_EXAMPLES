package pathTraversal;

import java.io.File;

// Base Directory: /users/ws/profiles/
// Unsafe filename: ../../../etc/passwd
// Canonical unsafe-file: /users/ws/profiles/../../../etc/passwd ----->>>  /etc/passwd ---->>>> Vulnerability!

public class PTTest1 {
    private final String BASE_DIRECTORY = "/users/ws/profiles/";
    public void test(String filename) {
        try {
            File myFile = new File(BASE_DIRECTORY + filename);
            myFile.delete();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
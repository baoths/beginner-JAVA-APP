package Database;

import java.io.File;
import java.io.IOException;

public class DTBCheck {
    String fileP = "src/GD.data";

    File file = new File(fileP);

    public DTBCheck(){}
    public void checkDTB(){
        if (file.exists()) {
        System.out.println("database file already existed");
        } else {
            try {
                file.createNewFile();
                System.out.println("database file created successful");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("failed to create database file");
            }
        }
    }
}

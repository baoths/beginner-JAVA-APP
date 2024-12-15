import java.io.PrintWriter;
import java.util.Scanner;

import Control.addGDControl;
import Database.DTBCheck;
import Database.addGDDAOFile;
import UI.MenuUI;
import UI.addGDUI;
import UI.addGDUIPrompt;

public class App {
    public static void main(String[] args) throws Exception {
        DTBCheck database = new DTBCheck();
        database.checkDTB();
        //add
        addGDDAOFile addGDDAORemote = new addGDDAOFile("src/GD.data");
        addGDControl addGDControlRemote = new addGDControl(addGDDAORemote);
        //declare IO
        PrintWriter sOutRemote = new PrintWriter(System.out, true);
        Scanner kInRemote = new Scanner(System.in);
        //add
        addGDUIPrompt addGDUIP = new addGDUIPrompt(sOutRemote);
        addGDControlRemote.setPromptAddGDUI(addGDUIP);
        addGDUI addGDUIRemote = new addGDUI(sOutRemote, kInRemote, addGDControlRemote);
        MenuUI menuRemote = new MenuUI(sOutRemote, kInRemote, addGDUIRemote);
        menuRemote.controlLoop();
    }
}

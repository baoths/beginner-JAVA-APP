import java.io.PrintWriter;
import java.util.Scanner;

import Control.PrintGDControl;
import Control.addGDControl;
import Database.DTBCheck;
import Database.addGDDAOFile;
import Database.printGDDAOFile;
import UI.MenuUI;
import UI.PrintGDUI;
import UI.addGDUI;
import UI.addGDUIPrompt;

public class App {
    public static void main(String[] args) throws Exception {
        DTBCheck database = new DTBCheck();
        database.checkDTB();
        //add
        addGDDAOFile addGDDAORemote = new addGDDAOFile("src/GD.data");
        addGDControl addGDControlRemote = new addGDControl(addGDDAORemote);
        //print
        printGDDAOFile printGDDAOFileRemote = new printGDDAOFile("src/GD.data");
        //declare IO
        PrintWriter sOutRemote = new PrintWriter(System.out, true);
        Scanner kInRemote = new Scanner(System.in);
        //add
        addGDUIPrompt addGDUIP = new addGDUIPrompt(sOutRemote);
        addGDControlRemote.setPromptAddGDUI(addGDUIP);
        addGDUI addGDUIRemote = new addGDUI(sOutRemote, kInRemote, addGDControlRemote);
        //print
        PrintGDUI printGDUI = new PrintGDUI(sOutRemote);
        PrintGDControl printGDControl = new PrintGDControl(printGDDAOFileRemote, printGDUI);
        printGDControl.setprintGDDAOFile(printGDDAOFileRemote);
        //menu
        MenuUI menuRemote = new MenuUI(sOutRemote, kInRemote, addGDUIRemote);
        menuRemote.setPrintGD(printGDControl);
        menuRemote.controlLoop();
    }
}

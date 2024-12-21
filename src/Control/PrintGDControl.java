package Control;

import java.util.ArrayList;

import Database.printDAO;
import Entity.GiaoDich;
import UI.PrintGDUI;

public class PrintGDControl {
    private PrintGDUI printGDUI = null;
    private printDAO pDAO = null;

    public PrintGDControl(){}

    public PrintGDControl(printDAO pDAO, PrintGDUI printGDUI){
        this.pDAO = pDAO;
        this.printGDUI = printGDUI;
    }

    public void setprintGDDAOFile(printDAO pDAO){
        this.pDAO = pDAO;
    }

    public void printGD(){
        ArrayList<GiaoDich> dsGD = pDAO.getDSGD();
        printGDUI.printGD(dsGD);
    }
}

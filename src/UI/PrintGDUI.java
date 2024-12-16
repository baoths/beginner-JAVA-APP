package UI;

import java.io.PrintWriter;
import java.util.ArrayList;

import Entity.GiaoDich;



public class PrintGDUI {
    private PrintWriter sOut = null;

    public PrintGDUI(PrintWriter sOut){
        this.sOut = sOut;
    }

    public void printGD(ArrayList<GiaoDich> gd){
        for(GiaoDich giaoDich : gd){
            sOut.println(giaoDich.getGD());
        }
    }
}

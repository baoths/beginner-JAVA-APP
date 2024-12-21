package UI;

import java.io.PrintWriter;

import java.util.Scanner;

import Control.PrintGDControl;

public class MenuUI {
    //fields
    private PrintWriter sOut = null;
    private Scanner kIn = null;
    private String prompt = "->";
    private String cmd = " ";

    private addGDUI aGdui = null;
    private PrintGDControl pGd = null;

    //methods
        //constructor
        public MenuUI(){}

        public MenuUI(PrintWriter sOut, Scanner kIn){
            this.sOut = sOut;
            this.kIn = kIn;
        }

        public MenuUI (PrintWriter sOut, Scanner kIn, addGDUI aGdui){
            this(sOut,kIn);
            this.aGdui = aGdui;
        }

    public void controlLoop(){
        sOut.println("go \"help\" de duoc ho tro.");
        sOut.flush();

        while(true){
            sOut.print(prompt);sOut.flush();
            cmd = kIn.nextLine();cmd.trim();
            
            if("help".equalsIgnoreCase(cmd)){
                help();
                continue;
            }
            if ("add".equalsIgnoreCase(cmd)) {
                addGD();
                continue;
            }
            if ("print".equalsIgnoreCase(cmd)) {
                printGD();
                continue;
            }

            if("quit".equalsIgnoreCase(cmd)){
                break;
            }
        }
    }

    private void addGD(){
        aGdui.InputInfo();
    }

    private void printGD(){
        pGd.printGD();
    }

    public void setPrintGD(PrintGDControl pGd){
        this.pGd = pGd;
    }

    private void help(){
        sOut.println("~~~~~Console Help Menu~~~~~");
		sOut.println("[HELP] Ho tro su dung phan mem");
		sOut.println("[ADD] Them mot giao dich moi");
		sOut.println("[PRINT] In danh sach giao dich");
        sOut.println("[QUIT] Thoat chuong trinh.");
		sOut.println("~~~~~Console Help Menu~~~~~");
    }
}


package UI;

import java.io.PrintWriter;

import java.util.Scanner;

public class MenuUI {
    //fields
    private PrintWriter sOut = null;
    private Scanner kIn = null;
    private String prompt = "->";
    private String cmd = " ";

    private addGDUI aGdui = null;

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

            if("quit".equalsIgnoreCase(cmd)){
                break;
            }
        }
    }

    private void addGD(){
        aGdui.InputInfo();
    }

    private void help(){
        sOut.println("~~~~~Console Help Menu~~~~~");
		//screenOut.flush();
		sOut.println("[HELP] Ho tro su dung phan mem");
		sOut.println("[ADD] Them moi SinhVien");
		//sOut.println("[PRINT] In danh sach SinhVien");
        sOut.println("[QUIT] Thoat chuong trinh.");
		sOut.println("~~~~~Console Help Menu~~~~~");
    }
}


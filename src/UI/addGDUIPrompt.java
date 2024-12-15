package UI;

import java.io.PrintWriter;

public class addGDUIPrompt {
    private PrintWriter sOut = null;
    public addGDUIPrompt(){}
    public addGDUIPrompt(PrintWriter sOut){
        this.sOut = sOut;
    }
    public void aPrompt(String prompt){
        sOut.println(prompt);
    }
}

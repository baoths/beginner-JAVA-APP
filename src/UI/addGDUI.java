package UI;


import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Control.addGDControl;

public class addGDUI {
    private PrintWriter sOut;
    private Scanner kIn;

    private String magdP,ngaygdP,giaP,loaigdP,loaidatP,loainhaP,diachiP,dientichP;

    private addGDControl addGDC = null;

    public addGDUI(){}
    public addGDUI(PrintWriter sOut, Scanner kIn, addGDControl addGDC){
        this(sOut, kIn);
        this.addGDC = addGDC;
    }
    public addGDUI(PrintWriter sOut, Scanner kIn){
        this.sOut = sOut;
        this.kIn = kIn;
        magdP = "ma giao dich: ";
        ngaygdP = "ngay giao dich [dd/mm/yyy]: ";
        giaP = "don gia: ";
        loaigdP = "loai giao dich [nha/dat]: ";
        loaidatP = "loai dat [A/B/C]: ";
        loainhaP = "loai nha [thuong/cao cap]: ";
        diachiP = "dia chi: ";
        dientichP = "dien tich: ";

    }

    public void InputInfo(){
        sOut.print(magdP);sOut.flush();
        String maGD = kIn.nextLine();
        //convert Date
        Date ngayGDJ = null;
        SimpleDateFormat spDateF = new SimpleDateFormat("dd/mm/yyyy");
        boolean validInput = false;
        while(!validInput){
            sOut.print(ngaygdP);sOut.flush();
            String ngayGD = kIn.nextLine();
            try {
                ngayGDJ = spDateF.parse(ngayGD);
                validInput = true;
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                sOut.println("vui long nhap lai theo format (dd/mm/yyy).");
            }
        }
        sOut.print(loaigdP);sOut.flush();
        String loai = kIn.nextLine();

        if ("dat".equalsIgnoreCase(loai)) {
            sOut.print(loaidatP);sOut.flush();
            String loaiD = kIn.nextLine();loaiD.trim();
            sOut.print(giaP);sOut.flush();
            float gia = kIn.nextFloat();kIn.nextLine();
            sOut.print(dientichP);sOut.flush();
            float dt = kIn.nextFloat();kIn.nextLine();

            addGDC.createGD(maGD, ngayGDJ, loaiD, gia, dt);
        }

        if("nha".equalsIgnoreCase(loai)){
            sOut.print(loainhaP);sOut.flush();
            String loaiN = kIn.nextLine();loaiN.trim();
            sOut.print(diachiP);sOut.flush();
            String dc = kIn.nextLine();
            sOut.print(giaP);sOut.flush();
            float gia = kIn.nextFloat();kIn.nextLine();
            sOut.print(dientichP);sOut.flush();
            float dt = kIn.nextFloat();kIn.nextLine();

            addGDC.createGD(maGD, ngayGDJ, loaiN, dc, gia, dt);
        }
    }
    public void setAddGDC(addGDControl addGDC){
        this.addGDC = addGDC;
    }

}

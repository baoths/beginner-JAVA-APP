package Control;

import java.util.Date;

import Database.addGDDAOFile;
import Entity.GiaoDich;
import Entity.GiaoDichDat;
import Entity.GiaoDichNha;
import UI.addGDUIPrompt;

public class addGDControl {
    private addGDDAOFile daoFile = null;
    private addGDUIPrompt addGDUIP = null;

    public addGDControl(){}
    public void setPromptAddGDUI(addGDUIPrompt addGDUIP){
        this.addGDUIP = addGDUIP;
    }
    public addGDControl(addGDDAOFile daoFile){
        this.daoFile = daoFile;
    }

    public void createGD(String maGD, Date ngayGD,String loaiD, float gia, float dt){
        GiaoDichDat gdd = new GiaoDichDat(maGD, ngayGD, loaiD, gia, dt);
        addGD(gdd);
    }
    public void createGD(String maGD, Date ngayGD, String loaiN, String dc, float gia, float dt){
        GiaoDichNha gdn = new GiaoDichNha(maGD, ngayGD, loaiN, dc, gia, dt);
        addGD(gdn);
    }

    private void addGD(GiaoDich gd){
        daoFile.addGD(gd);
        addGDUIP.aPrompt("Them giao dich thanh cong!");
    }
}

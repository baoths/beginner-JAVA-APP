package Entity;

import java.util.Date;

public class GiaoDichDat extends GiaoDich {
    private String loaiD;
    public GiaoDichDat(){}
    public GiaoDichDat(String maGD, Date ngayGD, String loaiD, float gia, float dt){
        super(maGD,ngayGD,gia,dt);
        this.loaiD = loaiD;
    }
    
    
    @Override
    public double tinhThanhTien() {
        // TODO Auto-generated method stub
        if ("b".equalsIgnoreCase(loaiD) || "c".equalsIgnoreCase(loaiD)) {
            return dt*gia;
        }
        else return dt*gia*1.5;
    }
    @Override
    public String getGD() {
        // TODO Auto-generated method stub
        return "{ma gd: " + maGD + ", ngay gd: " + ngayGD + ", loai dat: " + loaiD + ", don gia: " + gia + "}";
    }
}

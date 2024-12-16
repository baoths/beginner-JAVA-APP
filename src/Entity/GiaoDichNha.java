package Entity;

import java.util.Date;

public class GiaoDichNha extends GiaoDich {
    private String loaiN,dc;
    public GiaoDichNha(){}
    public GiaoDichNha(String maGD, Date ngayGD, String loaiN, String dc, float gia, float dt){
        super(maGD, ngayGD, gia, dt);
        this.loaiN = loaiN;
        this.dc = dc;
    }
    @Override
    public double tinhThanhTien() {
        // TODO Auto-generated method stub
       if ("cao cap".equalsIgnoreCase(loaiN)) {
        return dt*gia;
       }
       else return dt*gia*90/100;
    }
    @Override
    public String getGD() {
        // TODO Auto-generated method stub
        return "{ma gd: " + maGD + ", ngay gd: " + ngayGD + ", loai nha: " + loaiN + ", dia chi: " + dc + ", don gia: " + gia + "}";
    }

}

package Entity;

import java.io.Serializable;
import java.util.Date;

public abstract class GiaoDich implements Serializable {
    protected String maGD;
    protected Date ngayGD;
    protected float gia;
    protected float dt;

    public GiaoDich(){}
    public GiaoDich(String maGD, Date ngayGD, float gia, float dt){
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.gia = gia;
        this.dt = dt;
    }
    public abstract double tinhThanhTien();

    /*public String getmaGD(){
        return maGD;
    }*/
    public abstract String getGD();
}

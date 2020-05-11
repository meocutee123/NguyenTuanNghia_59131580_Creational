package BaiTap1;

public class ChiTietHD {
    String sP;
    int sL;
    double donGia;
    int chietKhau;

    public ChiTietHD(String sP, int sL, double donGia, int chietKhau){
        this.sP = sP;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.sL = sL;
    }

    @Override
    public String toString(){
        return "Chi tiet: San pham " + sP + " " + sL + " " + donGia + " " + chietKhau + "\n";
    }
}
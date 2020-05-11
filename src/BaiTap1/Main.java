package BaiTap1;

public class Main {
    public static void main(String [] args) {
        HoaDon HD = new HoaDon.Builder().setHeader( new HoaDonHeader("000", "28/05/1999", "Nguyen Tuan Nghia"))
        .addDSHD( new ChiTietHD("Xoai", 10, 2000, 1))
        .build();
        System.out.println(HD.toString());
    }
}
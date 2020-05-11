package BaiTap1;

import java.util.ArrayList;

public class HoaDon {
    HoaDonHeader header;
    ArrayList<ChiTietHD> ds;

    protected HoaDon(Builder builder){
        this.header = builder.header;
        this.ds = builder.ds;
    }
    @Override
    public String toString(){
        String str = header.toString();
        for(ChiTietHD cthd : ds){
            str += cthd.toString();
        }
        return str;
    }
    public static class Builder{
        HoaDonHeader header;
        ArrayList<ChiTietHD> ds;
        public Builder(){
            this.ds = new ArrayList<>();
        }
        public Builder setHeader(HoaDonHeader header){
            this.header = header;
            return this;
        }
        public Builder addDSHD(ChiTietHD ct){
            this.ds.add(ct);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}

package entity;

import java.sql.*;

public class KhachHang {
    private int maKH;
    private String sdt, hoten;
    private Date ngaySinh;
    private int dtl;

    public KhachHang() {
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getDtl() {
        return dtl;
    }

    public void setDtl(int dtl) {
        this.dtl = dtl;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", sdt=" + sdt + ", hoten=" + hoten + ", ngaySinh=" + ngaySinh + ", dtl=" + dtl + '}';
    }
    
}

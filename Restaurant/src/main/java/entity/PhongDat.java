package entity;

import java.sql.*;

public class PhongDat {

    private int id;
    private Time giovao;
    private Time giora;
    private boolean trangthai;
    private Date ngaydat;
    private Phong phong;
    private HoaDon hoadon;

    public PhongDat() {
    }

    public PhongDat(int id, Time giovao, Time giora, boolean trangthai, Date ngaydat, Phong phong, HoaDon hoadon) {
        this.id = id;
        this.giovao = giovao;
        this.giora = giora;
        this.trangthai = trangthai;
        this.ngaydat = ngaydat;
        this.phong = phong;
        this.hoadon = hoadon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getGiovao() {
        return giovao;
    }

    public void setGiovao(Time giovao) {
        this.giovao = giovao;
    }

    public Time getGiora() {
        return giora;
    }

    public void setGiora(Time giora) {
        this.giora = giora;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public Date getNgaydat() {
        return ngaydat;
    }

    public void setNgaydat(Date ngaydat) {
        this.ngaydat = ngaydat;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public HoaDon getHoadon() {
        return hoadon;
    }

    public void setHoadon(HoaDon hoadon) {
        this.hoadon = hoadon;
    }

}

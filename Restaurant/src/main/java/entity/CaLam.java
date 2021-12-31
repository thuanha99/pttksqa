package entity;

import java.sql.*;

public class CaLam {

    private int id;
    private Time gioBatDau, gioKetThuc;
    private float thuong;

    public CaLam() {
        super();
    }

    public CaLam(int id, Time gioBatDau, Time gioKetThuc, float thuong) {
        super();
        this.id = id;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(Time gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public Time getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(Time gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

}

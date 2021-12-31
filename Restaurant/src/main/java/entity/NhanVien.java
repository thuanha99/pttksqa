package entity;

import java.sql.*;

public class NhanVien {

    private int id;
    private String sdt, cmnd, email, diaChi, hoTen, ngaySinh, username, password, chucVu;
    private float soGioDaDat;
    private int nvcaid;
    private Date checkngay;
    
    public NhanVien() {

    }

    public NhanVien(int id, String sdt, String cmnd, String email, String diachi, String hoten, String ngaysinh,
            String username, String password, String chucvu) {
        super();
        this.id = id;
        this.sdt = sdt;
        this.cmnd = cmnd;
        this.email = email;
        this.diaChi = diachi;
        this.hoTen = hoten;
        this.ngaySinh = ngaysinh;
        this.username = username;
        this.password = password;
        this.chucVu = chucvu;
    }

    public Date getCheckngay() {
        return checkngay;
    }

    public void setCheckngay(Date checkngay) {
        this.checkngay = checkngay;
    }

    public int getNvcaid() {
        return nvcaid;
    }

    public void setNvcaid(int nvcaid) {
        this.nvcaid = nvcaid;
    }

    public float getSoGioDaDat() {
        return soGioDaDat;
    }

    public void setSoGioDaDat(float soGioDaDat) {
        this.soGioDaDat = soGioDaDat;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", hoTen=" + hoTen + '}';
    }



}

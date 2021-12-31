package entity;

import java.sql.Date;

public class HoaDon {

    private int maHD;
    private String note;
    private Date ngayThanhToan;
    private float tongtien;
    private KhachHang khachhang;
    private NhanVien nvltId;

    public HoaDon() {
    }

    public HoaDon(int maHD, String note, Date ngayThanhToan, float tongtien, KhachHang khachhang, NhanVien nvltId) {
        this.maHD = maHD;
        this.note = note;
        this.ngayThanhToan = ngayThanhToan;
        this.tongtien = tongtien;
        this.khachhang = khachhang;
        this.nvltId = nvltId;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public NhanVien getNvltId() {
        return nvltId;
    }

    public void setNvltId(NhanVien nvltId) {
        this.nvltId = nvltId;
    }

}

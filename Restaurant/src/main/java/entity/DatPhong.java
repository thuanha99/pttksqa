/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 *
 * @author thuan
 */
public class DatPhong {

    public Time giovao;
    public Time giora;
    public Date ngay;
    public List<Phong> phongList;
    public List<NhanVien> nvList;
    public int phongid;
    public List<Integer> nhanviencaids;
    public int khachhangid;
    public List<KhachHang> khList;
    public DatPhong() {
    }

    public DatPhong(Time giovao, Time giora, Date ngay) {
        this.giovao = giovao;
        this.giora = giora;
        this.ngay = ngay;
    }

    public DatPhong(Time giovao, Time giora, Date ngay, List<Phong> phongList) {
        this.giovao = giovao;
        this.giora = giora;
        this.ngay = ngay;
        this.phongList = phongList;
    }

    public List<KhachHang> getKhList() {
        return khList;
    }

    public void setKhList(List<KhachHang> khList) {
        this.khList = khList;
    }

    public List<NhanVien> getNvList() {
        return nvList;
    }

    public void setNvList(List<NhanVien> nvList) {
        this.nvList = nvList;
    }

    public int getPhongid() {
        return phongid;
    }

    public void setPhongid(int phongid) {
        this.phongid = phongid;
    }

    public List<Integer> getNhanviencaids() {
        return nhanviencaids;
    }

    public void setNhanviencaids(List<Integer> nhanviencaids) {
        this.nhanviencaids = nhanviencaids;
    }

    public int getKhachhangid() {
        return khachhangid;
    }

    public void setKhachhangid(int khachhangid) {
        this.khachhangid = khachhangid;
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

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public List<Phong> getPhongList() {
        return phongList;
    }

    public void setPhongList(List<Phong> phongList) {
        this.phongList = phongList;
    }

}

package dao;

import entity.KhachHang;
import java.sql.*;
import java.util.ArrayList;

public class KhachHangDAO extends DAO {
    
    public KhachHangDAO() {
    }
    
    public ArrayList<KhachHang> getAllKhachHang() {
        ArrayList<KhachHang> nhanvienList = new ArrayList<KhachHang>();
        String sql = "SELECT * FROM `khachhang`";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang nv = new KhachHang();
                nv.setMaKH(rs.getInt(1));
                nv.setSdt(rs.getString(2));
                nv.setHoten(rs.getString(3));
                nv.setNgaySinh(rs.getDate(4));
                nv.setDtl(rs.getInt(5));
                nhanvienList.add(nv);
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return nhanvienList;
    }
    
    public void insertKH(String hoten, String sdt, Date ngaysinh, int dtl) {
        String sql = "INSERT INTO `sqa`.`khachhang` (`Hoten`, `Sdt`, `Ngaysinh`, `Diemtichluy`) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, hoten);
            ps.setString(2, sdt);
            ps.setDate(3, ngaysinh);
            ps.setInt(4, dtl);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<KhachHang> searchKH(String sdt) {
        ArrayList<KhachHang> kq = new ArrayList<KhachHang>();
        String sql = "SELECT * FROM sqa.khachhang where sdt like ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + sdt + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang u = new KhachHang();
                u.setMaKH(rs.getInt(1));
                u.setSdt(rs.getString(2));
                u.setHoten(rs.getString(3));
                u.setNgaySinh(rs.getDate(4));
                u.setDtl(rs.getInt(5));
                kq.add(u);
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return kq;
    }
}

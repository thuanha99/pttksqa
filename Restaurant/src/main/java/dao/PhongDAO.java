package dao;

import entity.Phong;
import entity.DatPhong;
import java.sql.*;
import java.util.ArrayList;

public class PhongDAO extends DAO {

    public PhongDAO() {
    }

    public DatPhong timPhongTrong(Time giovao, Time giora, Date ngay) {
        ArrayList<Phong> kq = new ArrayList<Phong>();
        String sql = "select * from sqa.phong where phong.id not in ( select phongdat.phongID from sqa.phongdat where ((phongdat.giovao >= ? and phongdat.giovao < ? ) or (phongdat.giora > ? and phongdat.giora <= ?)) and phongdat.ngaydat = ? ) ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setTime(1, giovao);
            ps.setTime(2, giora);
            ps.setTime(3, giovao);
            ps.setTime(4, giora);
            ps.setDate(5, ngay);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Phong p = new Phong();
                p.setId(rs.getInt(1));
                p.setTen(rs.getString(2));
                p.setCo(rs.getString(3));
                p.setHang(rs.getString(4));
                p.setGia(rs.getFloat(5));
                kq.add(p);
            }
        } catch (Exception e) {
        }
        return new DatPhong(giovao, giora, ngay, kq);
    }
}

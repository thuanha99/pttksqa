package dao;

import java.sql.*;

/**
 *
 * @author thuan
 */
public class PhongDatDAO extends DAO {

    public PhongDatDAO() {
    }

    public int luuPhongDat(Time giovao, Time giora, int tt, Date ngaydat, int phongid, int hoadonid) throws SQLException {
        String sql = "INSERT INTO `sqa`.`phongdat` (`Giovao`, `Giora`, `Trangthai`, `Ngaydat`, `phongID`, `hoadonID`) "
                + "VALUES (?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setTime(1, giovao);
            ps.setTime(2, giora);
            ps.setInt(3, 0);
            ps.setDate(4, ngaydat);
            ps.setInt(5, phongid);
            ps.setInt(6, hoadonid);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("phongdat ID " + id);
                return id;
            } else {
                throw new SQLException("Tao phong dat that bai");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Tao phong dat that bai");
        }
    }

    public int luuHoaDon(int khachhangid) throws SQLException {
        String sql = "INSERT INTO `sqa`.`hoadon` (`khachhangID`, `nvltID`) VALUES (?, 1);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, khachhangid);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("hoadon ID " + id);
                return id;
            } else {
                throw new SQLException("Tao hoa don that bai");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Tao hoa don that bai");
        }

    }

    public void luuNVCPhongdat(int nvcaid, int phongdatid) throws SQLException {
        String sql = "INSERT INTO `sqa`.`nhanviencaphongdat` (`nhanviencaID`, `phongdatID`) VALUES (?, ?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, nvcaid);
            ps.setInt(2, phongdatid);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Tao nvcaphongdat that bai");
        }
    }
}

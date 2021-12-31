package dao;

import entity.NhanVien;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thuan
 */
public class NhanVienDAO extends DAO {

    public NhanVienDAO() {
    }

    public ArrayList<NhanVien> timNVRoi(Time giovao, Time giora, Date ngay) {
        ArrayList<NhanVien> kq = new ArrayList<NhanVien>();

        String sql = "select sqa.nhanvienca.ID, sqa.nhanvien.id, sqa.nhanvien.Hoten, sqa.phongdat.Giovao, sqa.phongdat.Giora, sqa.phongdat.Ngaydat \n"
                + "from (\n"
                + "			sqa.nhanvien \n"
                + "			left join sqa.nhanvienca on nhanvienca.nhanvienid = nhanvien.id \n"
                + "			left join sqa.nhanviencaphongdat on nhanviencaphongdat.nhanviencaID = nhanvienca.id\n"
                + "			left join sqa.phongdat on phongdat.id = nhanviencaphongdat.phongdatID\n"
                + "		)\n"
                + "where nhanvien.id not in (\n"
                + "	select distinct nhanvien.id \n"
                + "		from (\n"
                + "			sqa.nhanvien \n"
                + "			join sqa.nhanvienca on nhanvienca.nhanvienid = nhanvien.id \n"
                + "			join sqa.nhanviencaphongdat on nhanviencaphongdat.nhanviencaID = nhanvienca.id\n"
                + "			join sqa.phongdat on phongdat.id = nhanviencaphongdat.phongdatID\n"
                + "		)\n"
                + "		where \n"
                + "				((phongdat.giovao >= ? and phongdat.giovao < ? )\n"
                + "					or (phongdat.giora > ? and phongdat.giora <= ?))\n"
                + "				and phongdat.ngaydat = ?\n"
                + ") and sqa.nhanvien.Chucvu ='NV'";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setTime(1, giovao);
            ps.setTime(2, giora);
            ps.setTime(3, giovao);
            ps.setTime(4, giora);
            ps.setDate(5, ngay);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                NhanVien n = null;
                for (NhanVien nv : kq) {
                    if (nv.getId() == rs.getInt(2)) {
                        n = nv;
                        break;
                    }
                }
                if (n == null) {
                    n = new NhanVien();
                }
                n.setNvcaid(rs.getInt(1));
                n.setId(rs.getInt(2));
                n.setHoTen(rs.getString(3));
                n.setCheckngay(rs.getDate(6));

                if (rs.getDate(6) != null && rs.getDate(6).compareTo(ngay) == 0) {

                    n.setSoGioDaDat(n.getSoGioDaDat() + convertTime(rs.getTime(4), rs.getTime(5)));
                } else {
                    n.setSoGioDaDat(n.getSoGioDaDat());
                }

                kq.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }

    private static float convertTime(Time gioVao, Time gioRa) {
        if (gioVao != null && gioRa != null) {
            return gioRa.toLocalTime().getHour() - gioVao.toLocalTime().getHour()
                    + (float) (gioRa.toLocalTime().getMinute() - gioVao.toLocalTime().getMinute()) / 60;
        }
        return 0;
    }
}

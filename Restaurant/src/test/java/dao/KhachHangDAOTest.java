/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import org.junit.Test;
import entity.KhachHang;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import static org.junit.Assert.*;

/**
 *
 * @author thuan
 */
public class KhachHangDAOTest extends DAO {

    KhachHangDAO dao = new KhachHangDAO();

    public KhachHangDAOTest() {
    }

//    @Test
//    // test getall kich ban chuan
//    public void testGetAllKhachHang() throws SQLException {
//        ArrayList<KhachHang> khlist = dao.getAllKhachHang();
//        assertEquals(khlist.toString(), dao.getAllKhachHang().toString());
//    }
//    @Test
//    //insert kich ban chuan
//    public void testInsertKH() throws SQLException {
//        connection.setAutoCommit(false);
//        try {
//            int n = dao.getAllKhachHang().size();
//            dao.insertKH("Hoang Van Thai", "0340993322", Date.valueOf("1992-10-20"), 0);
//            assertEquals(dao.getAllKhachHang().size(), n+1);
//        } finally {
//            // TODO: handle finally clause
//            connection.rollback();
//            connection.close();
//        }
//    }

//    @Test
//    //test search kich ban chuan
//    public void testSearchKH() {
//        String sdt = "999";
//        ArrayList<KhachHang> khlisttest = new ArrayList<KhachHang>();
//        ArrayList<KhachHang> khlistdb = new ArrayList<KhachHang>();
//        Date ns = Date.valueOf("1999-12-20");
//        KhachHang kh1 = new KhachHang();
//        kh1.setMaKH(12);
//        kh1.setHoten("Khach Vip Pro");
//        kh1.setSdt("0949999999");
//        kh1.setNgaySinh(ns);
//        kh1.setDtl(200);
//        khlisttest.add(kh1);
//
//        khlistdb = dao.searchKH(sdt);
//        assertEquals(khlisttest.size(), khlistdb.size());
//
//        for (int i = 0; i < khlisttest.size(); i++) {
//            assertEquals(khlisttest.get(i).getMaKH(), khlistdb.get(i).getMaKH());
//            assertEquals(khlisttest.get(i).getHoten(), khlistdb.get(i).getHoten());
//            assertEquals(khlisttest.get(i).getSdt(), khlistdb.get(i).getSdt());
//            assertEquals(khlisttest.get(i).getNgaySinh(), khlistdb.get(i).getNgaySinh());
//            assertEquals(khlisttest.get(i).getDtl(), khlistdb.get(i).getDtl());
//        }
//    }
//    @Test
//    // test search khong co
//    public void testSearchKH2() {
//        String sdt = "8863";
//        ArrayList<KhachHang> khlisttest = new ArrayList<KhachHang>();
//        khlisttest = dao.searchKH(sdt);
//        assertEquals(khlisttest.size(),0);
//    }
}

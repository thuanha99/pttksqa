/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.sql.Date;
import java.sql.Time;
import org.junit.Test;
import entity.NhanVien;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 *
 * @author thuan
 */
public class NhanVienDAOTest extends DAO{
    
    NhanVienDAO nvdao = new NhanVienDAO();
    public NhanVienDAOTest() {
    }

    @Test
    public void testTimNVRoi() {
        Date ngay = Date.valueOf("2021-12-20");
        Time giovao = Time.valueOf("05:00:00");
        Time giora = Time.valueOf("06:00:00");
        
        ArrayList<NhanVien> n = nvdao.timNVRoi(giovao, giora, ngay);
        assertEquals(n.size(), 4);
    }
    
}

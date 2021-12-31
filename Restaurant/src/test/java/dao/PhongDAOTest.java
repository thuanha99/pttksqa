/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import org.junit.Test;
import static org.junit.Assert.*;
import entity.*;
import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;


/**
 *
 * @author thuan
 */
public class PhongDAOTest extends DAO{
    
    PhongDAO pdao = new PhongDAO();
    public PhongDAOTest() {
    }

    @Test
    public void testTimPhongTrong() {
        Date ngay = Date.valueOf("2021-12-20");
        Time giovao = Time.valueOf("05:00:00");
        Time giora = Time.valueOf("06:00:00");
        
        DatPhong dpdb = pdao.timPhongTrong(giovao, giora, ngay);
        assertEquals(dpdb.phongList.size(), 9);
    }
    
}

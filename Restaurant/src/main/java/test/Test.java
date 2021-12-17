package test;

import dao.KhachHangDAO;
import entity.KhachHang;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        KhachHangDAO khd = new KhachHangDAO();
        ArrayList<KhachHang> list = khd.getAllKhachHang();
        for(KhachHang o: list){
            System.out.println(o);
        }
    }
}

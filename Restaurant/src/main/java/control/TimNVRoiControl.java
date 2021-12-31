package control;

import dao.NhanVienDAO;
import dao.PhongDAO;
import entity.NhanVien;
import entity.DatPhong;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thuan
 */
@WebServlet(name = "TimNVRoiControl", urlPatterns = {"/timnv"})
public class TimNVRoiControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        try {
            String giov = request.getParameter("giovao");
            String gior = request.getParameter("giora");
            String n = request.getParameter("ngay");
            Time giovao = Time.valueOf(giov);
            Time giora = Time.valueOf(gior);
            Date ngay = Date.valueOf(n);
            String phongid = request.getParameter("phongid");
            DatPhong datPhong = new DatPhong(giovao, giora, ngay);
            datPhong.setPhongid(Integer.parseInt(phongid));

            NhanVienDAO khd = new NhanVienDAO();
            ArrayList<NhanVien> nvList = khd.timNVRoi(giovao, giora, ngay);
            ArrayList<NhanVien> nvList2 = new ArrayList<NhanVien>();
            Set<Integer> nvidSet = new HashSet<Integer>();
            for (NhanVien nv : nvList) {
                if (!nvidSet.contains(nv.getId())) {
                    nvList2.add(nv);
                    nvidSet.add(nv.getId());
                }
            }
            Collections.sort(nvList2, new Comparator<NhanVien>() {
                @Override
                public int compare(NhanVien sv1, NhanVien sv2) {
                    if (sv1.getSoGioDaDat() - sv2.getSoGioDaDat() > 0) {
                        return -1;
                    } else if (sv1.getSoGioDaDat() - sv2.getSoGioDaDat() == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            });
            datPhong.setNvList(nvList2);

            request.setAttribute("datPhong", datPhong);
            request.getRequestDispatcher("gdChonNVPV.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("gdChonNVPV.jsp").forward(request, response);
            e.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

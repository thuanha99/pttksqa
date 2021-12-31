package control;

import dao.KhachHangDAO;
import entity.DatPhong;
import entity.KhachHang;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoadKHControl", urlPatterns = {"/loadkh"})
public class LoadKHControl extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoadKHControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoadKHControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
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
//        processRequest(request, response);
        String giov = request.getParameter("giovao");
        String gior = request.getParameter("giora");
        String n = request.getParameter("ngay");
        Time giovao = Time.valueOf(giov);
        Time giora = Time.valueOf(gior);
        Date ngay = Date.valueOf(n);
        String phongid = request.getParameter("phongid");
        String[] nhanviencaids = request.getParameterValues("nhanviencaid");
        List<Integer> nhanviencaids2 = new ArrayList<Integer>();
        for(String nvcaid: nhanviencaids){
            int nhanviencaid = Integer.parseInt(nvcaid);
            nhanviencaids2.add(nhanviencaid);
        }
        
        DatPhong datPhong = new DatPhong(giovao, giora, ngay);
        datPhong.setNhanviencaids(nhanviencaids2);
        datPhong.setPhongid(Integer.parseInt(phongid));

        KhachHangDAO khd = new KhachHangDAO();
        ArrayList<KhachHang> khlist = khd.getAllKhachHang();
        datPhong.setKhList(khlist);
        request.setAttribute("datPhong", datPhong);
        request.getRequestDispatcher("gdThongTinKhach.jsp").forward(request, response);
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
//        processRequest(request, response);
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

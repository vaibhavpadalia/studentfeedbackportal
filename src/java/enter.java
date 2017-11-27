/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
/**
 *
 * @author Vaibhav Jonas
 */
public class enter extends HttpServlet {

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
        
            /* TODO output your page here. You may use following sample code. */
            PrintWriter out = response.getWriter();
            HttpSession session = request.getSession();
            String ffinal =request.getParameter("fselect");
            String sfinal =request.getParameter("sselect");
            int count=0;
            try
            {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
               PreparedStatement stmt = con.prepareStatement("SELECT * FROM fill WHERE cid=? AND fname=? AND sname=? AND sem=?");
               stmt.setString(1,session.getAttribute("cid").toString());
               stmt.setString(2, ffinal);
               stmt.setString(3, sfinal);
               stmt.setString(4, session.getAttribute("sem").toString());
               ResultSet rs = stmt.executeQuery();
               if(rs.next())
               {
                   count++;
               }
               if(count==1)
               {
                   response.sendRedirect("error.jsp");
               }
               else
               {
                   session.setAttribute("ffinal", ffinal);
                   session.setAttribute("sfinal", sfinal);
                   response.sendRedirect("form.jsp");
               }
               con.close();
            }
            catch(Exception e)
            {
                response.sendRedirect("error.jsp");
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

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
 * @author ms
 */
public class chpass extends HttpServlet {

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
            HttpSession session = request.getSession();
            String id = session.getAttribute("cid").toString();
            try
            {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
               PreparedStatement stmt = con.prepareCall("SELECT password FROM studdb WHERE cid=?");
               stmt.setString(1, id);
               ResultSet rs = stmt.executeQuery();
               if(rs.next())
               {
                   if(rs.getString(1).equals(request.getParameter("password")) && request.getParameter("npassword").equals(request.getParameter("rpassword")))
                   {
                       PreparedStatement stmt1 = con.prepareCall("UPDATE studdb SET password=? WHERE cid=?");
                       stmt1.setString(1, request.getParameter("npassword"));
                       stmt1.setString(2, id);
                       stmt1.executeUpdate();
                       response.sendRedirect("success.jsp");
                   }
                   else
                       response.sendRedirect("error.jsp");
               }
               else
                   response.sendRedirect("error.jsp");
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

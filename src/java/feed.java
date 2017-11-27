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
public class feed extends HttpServlet {

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
        HttpSession session = request.getSession();
        int sum=0,temp=0;
        for(int i=10;i<30;i++)
        {
            String j = i+"";
            temp=Integer.parseInt(request.getParameter(j));
            sum+=temp;
        }
            try
            {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
               PreparedStatement stmt = con.prepareStatement("INSERT INTO fill (cid,fname,sname,sem) VALUES(?,?,?,?)");
               stmt.setString(1,session.getAttribute("cid").toString());
               stmt.setString(2,session.getAttribute("ffinal").toString());
               stmt.setString(3,session.getAttribute("sfinal").toString());
               stmt.setString(4,session.getAttribute("sem").toString());
               stmt.executeUpdate();
               PreparedStatement stmt1 = con.prepareStatement("INSERT INTO feed (fname,sname,sem,grade) VALUES(?,?,?,?)");
               stmt1.setString(1,session.getAttribute("ffinal").toString());
               stmt1.setString(2,session.getAttribute("sfinal").toString());
               stmt1.setString(3,session.getAttribute("sem").toString());
               stmt1.setInt(4, sum);
               stmt1.executeUpdate();
               response.sendRedirect("success.jsp");
               con.close();
            }
            catch(Exception e)
            {
                response.sendRedirect("error.jsp");
            }
            /* TODO output your page here. You may use following sample code. */
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

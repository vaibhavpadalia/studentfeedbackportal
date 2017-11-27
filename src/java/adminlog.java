/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Vaibhav Jonas
 */
public class adminlog extends HttpServlet {

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
            ArrayList<String> fname = new ArrayList<String>();
            ArrayList<String> sname = new ArrayList<String>();
            PrintWriter out = response.getWriter();
            if(request.getParameter("uid").equals("vaibhav") && request.getParameter("password").equals("password"))
            {
                try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM faculty");
                ResultSet rs = stmt.executeQuery();
                PreparedStatement stmt1 = con.prepareStatement("SELECT * FROM subject");
                ResultSet rs1 = stmt1.executeQuery();
                while(rs.next())
                {
                    fname.add(rs.getString("fname"));
                }
                while(rs1.next())
                {
                    sname.add(rs1.getString("sname"));
                }
                con.close();
            }
            catch(Exception e)
            {
            }
                session.setAttribute("name",request.getParameter("uid"));
                session.setAttribute("fname", fname);
                session.setAttribute("sname", sname);
                response.sendRedirect("adminmenu.jsp");
            }  
            else
                response.sendRedirect("error.jsp");
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

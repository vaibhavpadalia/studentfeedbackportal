/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author Vaibhav Jonas
 */
public class next extends HttpServlet {

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
            try
            {
            ArrayList<String> fname = new ArrayList<String>();
            ArrayList<String> sname = new ArrayList<String>();
            HttpSession session = request.getSession();
            Date d = new Date();
            DateFormat df = new SimpleDateFormat("YYYY");
            DateFormat df1 = new SimpleDateFormat("MM");
            int month = Integer.parseInt(df1.format(d));
            int pyr =Integer.parseInt(df.format(d));
            int yr;
            String sem = null;
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                PreparedStatement stmt = con.prepareStatement("SELECT branch,year,sem FROM studdb WHERE cid=? AND password=?");
                stmt.setString(1, request.getParameter("cid"));
                stmt.setString(2, request.getParameter("pass"));
                ResultSet rs = stmt.executeQuery();
                if(rs.next())
                {
                    yr = Integer.parseInt(rs.getString(2));
                    session.setAttribute("cid", request.getParameter("cid"));
                    session.setAttribute("branch",rs.getString(1));
                    int s = Integer.parseInt(rs.getString(3));
                    if((pyr<yr) || (month<12 && pyr==yr) || ((pyr-yr)>=4))
                    {
                        response.sendRedirect("error.jsp");
                    }
                    else
                    {
                        session.setAttribute("year", yr);
                    }
                    if(s==1)
                    {
                        if((pyr-yr)==0 && (month>=10))
                            sem="1";
                        else if((pyr-yr)==1 && (month<6 && month >2))
                            sem="2";
                        else if((pyr-yr)==1 && (month<12 && month >=10))
                            sem="3";
                        else if((pyr-yr)==2 && (month<6 && month >2))
                            sem="4";
                        else if((pyr-yr)==2 && (month<12 && month >=10))
                            sem="5";
                        else if((pyr-yr)==3 && (month<6 && month >2))
                            sem="6";
                        else if((pyr-yr)==3 && (month<12 && month >=10))
                            sem="7";
                        else if((pyr-yr)==4 && (month<6 && month >2))
                            sem="8";
                    }   
                    else if (s==3)
                    {
                        if((pyr-yr)==0 && (month>=10))
                            sem="3";
                        else if((pyr-yr)==1 && (month<6 && month >2))
                            sem="4";
                        else if((pyr-yr)==1 && (month<12 && month >=10))
                            sem="5";
                        else if((pyr-yr)==2 && (month<6 && month >2))
                            sem="6";
                        else if((pyr-yr)==2 && (month<12 && month >=10))
                            sem="7";
                        else if((pyr-yr)==3 && (month<6 && month >2))
                            sem="8";
                    }
                    try
                       {
                          PreparedStatement stmt2 = con.prepareStatement("SELECT * FROM faculty");
                          ResultSet rs2 = stmt2.executeQuery();
                          PreparedStatement stmt1 = con.prepareStatement("SELECT * FROM subject");
                          ResultSet rs1 = stmt1.executeQuery();
                          while(rs2.next())
                            {
                                if(rs2.getString("fname").contains(rs.getString(1)))
                                    fname.add(rs2.getString("fname"));
                            }
                          while(rs1.next())
                            {
                                if(rs1.getString("sname").contains(rs.getString(1)))
                                    sname.add(rs1.getString("sname"));
                            }     
                          session.setAttribute("sem", sem);
                          session.setAttribute("fname",fname);
                          session.setAttribute("sname",sname);
                          response.sendRedirect("profile.jsp");
                        }
                    catch(Exception e)
                        {
                          response.sendRedirect("error.jsp");
                        }
                }
                else
                    response.sendRedirect("error.jsp");
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

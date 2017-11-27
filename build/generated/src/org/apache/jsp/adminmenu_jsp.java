package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class adminmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./header.jsp");
    _jspx_dependants.add("/./footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Panel</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #009999;\">\n");
      out.write("        ");
      out.write("<h1 align=\"center\" style=\"font-family: sans-serif; font-size:30px; background-color: windowframe;\">FEEDBACK FORM</h1>");
      out.write("\n");
      out.write("        <h1 align=\"middle\">Hello ");
      out.print( session.getAttribute("name") );
      out.write("</h1>\n");
      out.write("        <h2 style=\"font-family: cursive; padding-left: 15px;\">Faculty Panel</h2>\n");
      out.write("        <form method=\"POST\" action=\"./addfac\">\n");
      out.write("        <span style=\"padding-left:20px;\">View All:</span>\n");
      out.write("        <span style=\"padding-left: 20px;\">\n");
      out.write("        <select>\n");
      out.write("             ");

                for(String i : (ArrayList <String>)session.getAttribute("fname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              
      out.write("      \n");
      out.write("        </select>\n");
      out.write("        </span>\n");
      out.write("        <span style=\"padding-left:450px;\">Add new faculty:</span>\n");
      out.write("        <span style=\"padding-left: 20px;\"><input style=\"padding-right: 15px;\" type=\"text\" name=\"fnew\" placeholder=\"Faculty Name(Abb.)Branch\" required=\"\"/></span>\n");
      out.write("        <span style=\"padding-left: 20px;\"><input type=\"submit\" value=\"Submit\" name=\"Submit\"></span>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <h2 style=\"font-family: cursive; padding-left: 15px;\">Subject Panel</h2>\n");
      out.write("        <form method=\"POST\" action=\"./addsub\">\n");
      out.write("        <span style=\"padding-left:20px;\">View All:</span>\n");
      out.write("        <span style=\"padding-left: 20px;\">\n");
      out.write("        <select>\n");
      out.write("             ");

                for(String j : (ArrayList <String>)session.getAttribute("sname"))
                    {
                       out.println("<option>"+ j +"</option>");
                    }
              
      out.write("      \n");
      out.write("        </select>\n");
      out.write("        </span>\n");
      out.write("        <span style=\"padding-left:440px;\">Add new Subject:</span>\n");
      out.write("        <span style=\"padding-left: 20px;\"><input style=\"padding-right: 15px;\" type=\"text\" placeholder=\"Subject Name(Subject Code)\" name=\"snew\" required=\"\"/></span>\n");
      out.write("        <span style=\"padding-left: 20px;\"><input type=\"submit\" value=\"Submit\" name=\"Submit\"></span>\n");
      out.write("        </form>\n");
      out.write("        <h2 style=\"font-family: cursive; padding-left: 15px;\">Delete Panel</h2>\n");
      out.write("        <form action=\"./delfac\" method=\"POST\">\n");
      out.write("         <span style=\"padding-left:20px;\">Select Faculty:</span> \n");
      out.write("         <span style=\"padding-left: 20px;\">   \n");
      out.write("         <select name=\"dfaculty\">\n");
      out.write("             ");

                for(String i : (ArrayList <String>)session.getAttribute("fname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              
      out.write("   \n");
      out.write("        </select>\n");
      out.write("         </span>\n");
      out.write("        <span style=\" padding-left: 90px;\"><input type=\"submit\" value=\"Delete\" name=\"submit\" /></span>\n");
      out.write("        </form>\n");
      out.write("        <form style=\" padding-top: 30px;\" method=\"POST\" action=\"./delsub\">\n");
      out.write("         <span style=\"padding-left:20px;\">Select Subject:</span> \n");
      out.write("         <span style=\"padding-left: 20px;\"> \n");
      out.write("        <select name=\"dsubject\">\n");
      out.write("             ");

                for(String i : (ArrayList <String>)session.getAttribute("sname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              
      out.write("   \n");
      out.write("        </select>\n");
      out.write("         </span>\n");
      out.write("        <span style=\"padding-left: 83px;\"><input type=\"submit\" value=\"Delete\" name=\"submit\" /></span>\n");
      out.write("        </form>\n");
      out.write("        <h2 style=\"font-family: cursive; padding-left: 15px;\">Grade Check Panel:</h2>\n");
      out.write("        <form method=\"POST\" action=\"./gradecheck\">\n");
      out.write("         <span style=\"padding-left:20px;\">Select Faculty:</span> \n");
      out.write("         <span style=\"padding-left: 20px;\">   \n");
      out.write("         <select name=\"sfaculty\">\n");
      out.write("             ");

                for(String i : (ArrayList <String>)session.getAttribute("fname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              
      out.write("   \n");
      out.write("        </select>\n");
      out.write("         </span>\n");
      out.write("        <span style=\"padding-left:180px;\">Select Subject:</span> \n");
      out.write("        <span style=\"padding-left: 20px;\"> \n");
      out.write("        <select name=\"ssubject\">\n");
      out.write("             ");

                for(String i : (ArrayList <String>)session.getAttribute("sname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              
      out.write("   \n");
      out.write("        </select>\n");
      out.write("         </span>\n");
      out.write("        <span style=\" padding-left: 90px;\"><input type=\"submit\" value=\"Check\" name=\"submit\" /></span>\n");
      out.write("        </form>\n");
      out.write("        <br><br>\n");
      out.write("        <a style=\"padding-left: 48%;\" href=\"./refresh\">Refresh Entries</a>\n");
      out.write("        <a style=\"padding-left: 50%;\" href=\"./logout\">Log Out</a>\n");
      out.write("        ");
      out.write("<h4 style=\" bottom: 0;clear: both;width: 100%;height: 1% ;text-align:center;\">&copy; All rights reserved. || Developed by: Vaibhav Padalia</h4>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

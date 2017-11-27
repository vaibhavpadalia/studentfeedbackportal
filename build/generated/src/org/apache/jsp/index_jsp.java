package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Feedback Form</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-color: palegreen;\">\r\n");
      out.write("        ");
      out.write("<h1 align=\"center\" style=\"font-family: sans-serif; font-size:30px; background-color: windowframe;\">FEEDBACK FORM</h1>");
      out.write("\r\n");
      out.write("        <h2 align=\"center\">Welcome to the feedback form</h2>\r\n");
      out.write("        <h3>&twoheadrightarrow;<u>Instructions</u></h3> \r\n");
      out.write("        &blacktriangleright; Meaningful stuff something that makes sense that is point 1<br>\r\n");
      out.write("        &blacktriangleright; Meaningful stuff something that makes sense that is point 2<br>\r\n");
      out.write("        &blacktriangleright; Meaningful stuff something that makes sense that is point 3<br>\r\n");
      out.write("        &blacktriangleright; Meaningful stuff something that makes sense that is point 4<br>\r\n");
      out.write("        &blacktriangleright; Meaningful stuff something that makes sense that is point 5<br>\r\n");
      out.write("        &blacktriangleright; Meaningful stuff something that makes sense that is point 6<br>\r\n");
      out.write("        &blacktriangleright; Meaningful stuff something that makes sense that is point 7<br>\r\n");
      out.write("        &blacktriangleright; Meaningful stuff something that makes sense that is point 8<br><br><br>\r\n");
      out.write("        <form style=\"border: double; padding-left: 2em; padding-right: 2em ;float: left; padding-bottom: 1em;width: 30%;margin-left: 30px;\" action=\"./next\" method=\"POST\">\r\n");
      out.write("            <h2>Enter Details</h2>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td style=\"padding-bottom: 10px;\">University Roll:</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td style=\"padding-bottom: 10px;\"><input type=\"text\" id=\"cid\" name=\"cid\" placeholder=\"Enter University Roll No.\" required=\"\"></td> \r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"submit\" value =\"Submit\" name=\"submit\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        <form style=\"border: double; padding-left: 2em; padding-right:2em ;padding-bottom: 1em;float: right;width: 40%;margin-right: 30px;\" action=\"#\" method=\"POST\">\r\n");
      out.write("            <h2 style=\"padding-left: 15px;\">Admin Login</h2>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td style=\"padding-left: 10px;padding-bottom: 10px; padding-right: 30px;\">Enter Username:</td> \r\n");
      out.write("                    <td style=\"padding-left: 10px;padding-bottom: 10px;\">Enter Password:</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td style=\"padding-left: 10px;padding-bottom: 10px;padding-right: 30px;\"><input type=\"text\" id=\"uid\" name=\"uid\" placeholder=\"Enter Username\" required=\"\"></td>\r\n");
      out.write("                    <td style=\"padding-left: 10px;padding-bottom: 10px;\"><input type=\"password\" id=\"password\" name=\"password\" required=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <br>\r\n");
      out.write("            <span style=\"padding-left: 10px;\"><input type=\"submit\" value =\"Login\" name=\"login\"/></span>\r\n");
      out.write("            </form>\r\n");
      out.write("        ");
      out.write("<h4 style=\"bottom: 0; position:absolute;width: 100%; text-align: center;\">&copy; All rights reserved. || Developed by: Vaibhav Padalia</h4>");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

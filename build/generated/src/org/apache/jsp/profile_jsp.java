package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Profile Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: aqua;\">\n");
      out.write("        ");
      out.write("<h1 align=\"center\" style=\"font-family: sans-serif; font-size:30px; background-color: windowframe;\">FEEDBACK FORM</h1>");
      out.write("\n");
      out.write("        <h1 align=\"center\">Your Information</h1>\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"padding-top: 15px;padding-right: 30px; padding-bottom: 30px;\">Your University roll no:</td>\n");
      out.write("                <td style=\"padding-top: 15px;padding-bottom: 30px;\"><input type=\"text\" name=\"cid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"padding-top: 15px;padding-right: 30px; padding-bottom: 30px;\">Your Branch:</td>\n");
      out.write("                <td style=\"padding-top: 15px;padding-bottom: 30px;\"><input type=\"text\" name=\"branch\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${branch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"padding-top: 15px;padding-right: 30px; padding-bottom: 30px;\">Your Batch:</td>\n");
      out.write("                <td style=\"padding-top: 15px;padding-bottom: 30px;\"><input type=\"text\" name=\"year\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"padding-top: 15px;padding-right: 30px; padding-bottom: 30px;\">Your Semester:</td>\n");
      out.write("                <td style=\"padding-top: 15px;padding-bottom: 30px;\"><input type=\"text\" name=\"cid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"padding-top: 15px;padding-right: 30px; padding-bottom: 30px;\">Enter Faculty's Name:</td>\n");
      out.write("                <td style=\"padding-top: 15px;padding-bottom: 30px;\">\n");
      out.write("                    <select>\n");
      out.write("                      ");

                        ArrayList <String> fac = (ArrayList <String>)session.getAttribute("fname");
                        String b = (String)session.getAttribute("branch");
                         for(String i : fac)
                           {
                               if(i.contains(b))
                               out.println("<option>"+ i +"</option>");
                           } 
                      
      out.write("\n");
      out.write("                    </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"padding-top: 15px;padding-right: 30px; padding-bottom: 30px;\">Enter Subject:</td>\n");
      out.write("                <td style=\"padding-top: 15px;padding-bottom: 30px;\">\n");
      out.write("                    <select>\n");
      out.write("                      ");

                        ArrayList <String> s = (ArrayList <String>)session.getAttribute("sname");
                         for(String i : s)
                           {
                               if(i.contains(b))
                               out.println("<option>"+ i +"</option>");
                           } 
                      
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            <br>\n");
      out.write("            <input style=\"margin-left: 50%;\" type=\"submit\" value=\"Submit\" name=\"submit\" />\n");
      out.write("        ");
      out.write("<h4 style=\"bottom: 0; position:absolute;width: 100%; text-align: center;\">&copy; All rights reserved. || Developed by: Vaibhav Padalia</h4>");
      out.write("\n");
      out.write("        \n");
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

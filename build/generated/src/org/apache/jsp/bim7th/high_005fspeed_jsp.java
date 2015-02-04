package org.apache.jsp.bim7th;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ReportManagementSystem.entities.Student;
import com.ReportManagementSystem.model.Student_bim1st;

public final class high_005fspeed_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<h2>High speed Networking</h2>                \r\n");
      out.write("<table  class=\"table table-bordered table-striped\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Name</th>\r\n");
      out.write("                        <th>Roll</th>\r\n");
      out.write("                        <th>Assignment</th>\r\n");
      out.write("                        <th>Report</th>\r\n");
      out.write("                        <th>Midterm</th>\r\n");
      out.write("                        <th>Presentation</th>\r\n");
      out.write("                        <th>Preboard</th>\r\n");
      out.write("                        <th>Total</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                        try {
                            for (Student u : Student_bim1st.getHIghSpeed()) {
                    
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("\r\n");
      out.write("                        <td>");
      out.print(u.getName());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(u.getRoll());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(u.getAssignment());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(u.getReport());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(u.getMidterm());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(u.getPresentation());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(u.getPreboard());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(u.getTotal());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tr> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");

                            }
                        } catch (Exception ex) {
                            out.println(ex.getMessage());
                        }
                    
      out.write("\r\n");
      out.write("                </table>");
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

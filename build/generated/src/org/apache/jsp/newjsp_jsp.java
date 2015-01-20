package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<table class=\"table table-bordered\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Subject</th>\n");
      out.write("                        <th>Class</th>\n");
      out.write("                        <th>Roll</th>\n");
      out.write("                        <th>Assignment</th>\n");
      out.write("                        <th>Report</th>\n");
      out.write("                        <th>Midterm</th>\n");
      out.write("                        <th>Presentation</th>\n");
      out.write("                        <th>Preboard</th>\n");
      out.write("                        <th>Total</th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>anup shrestha</td>\n");
      out.write("                        <td>English Composition</td>\n");
      out.write("                        <td>bim1st</td>\n");
      out.write("                        <td>1</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>20</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>0</td>\n");
      out.write("                        <td>0</td>\n");
      out.write("                        <td>85</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>anuska sharma</td>\n");
      out.write("                        <td>English Composition</td>\n");
      out.write("                        <td>bim1st</td>\n");
      out.write("                        <td>2</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>75</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>Ajay Shrestha</td>\n");
      out.write("                        <td>English Composition</td>\n");
      out.write("                        <td>bim1st</td>\n");
      out.write("                        <td>3</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>50</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>rajan</td>\n");
      out.write("                        <td>English Composition</td>\n");
      out.write("                        <td>bim1st</td>\n");
      out.write("                        <td>4</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>20</td>\n");
      out.write("                        <td>20</td>\n");
      out.write("                        <td>70</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>Anjeela Shrestha</td>\n");
      out.write("                        <td>English Composition</td>\n");
      out.write("                        <td>bim1st</td>\n");
      out.write("                        <td>5</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>75</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>Anish Maharjan</td>\n");
      out.write("                        <td>English Composition</td>\n");
      out.write("                        <td>bim1st</td>\n");
      out.write("                        <td>6</td>\n");
      out.write("                        <td>20</td>\n");
      out.write("                        <td>20</td>\n");
      out.write("                        <td>20</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>85</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>aarati shrestha</td>\n");
      out.write("                        <td>English Composition</td>\n");
      out.write("                        <td>bim1st</td>\n");
      out.write("                        <td>7</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>20</td>\n");
      out.write("                        <td>17</td>\n");
      out.write("                        <td>13</td>\n");
      out.write("                        <td>18</td>\n");
      out.write("                        <td>78</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>Rabindra Basnet</td>\n");
      out.write("                        <td>English Composition</td>\n");
      out.write("                        <td>bim1st</td>\n");
      out.write("                        <td>8</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>50</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
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

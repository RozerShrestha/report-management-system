package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dropdown_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Dropdown</title>\n");
      out.write("  <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("  <div class=\"page-header\">\n");
      out.write("    <h1>Dropdown <small>Bootstrap Visual Test</small></h1>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <ul class=\"nav nav-pills\">\n");
      out.write("    <li class=\"active\"><a href=\"#\">Regular link</a></li>\n");
      out.write("    <li class=\"active\">\n");
      out.write("      <a id=\"drop4\" role=\"button\" data-toggle=\"dropdown\" href=\"#\">Dropdown <b class=\"caret\"></b></a>\n");
      out.write("      <ul id=\"menu1\" class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"drop4\">\n");
      out.write("        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"http://twitter.com/fat\">Action</a></li>\n");
      out.write("        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"http://twitter.com/fat\">Another action</a></li>\n");
      out.write("        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"http://twitter.com/fat\">Something else here</a></li>\n");
      out.write("        <li role=\"presentation\" class=\"divider\"></li>\n");
      out.write("        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"http://twitter.com/fat\">Separated link</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("      <a id=\"drop5\" role=\"button\" data-toggle=\"dropdown\" href=\"#\">Dropdown 2 <b class=\"caret\"></b></a>\n");
      out.write("      <ul id=\"menu2\" class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"drop5\">\n");
      out.write("        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"http://twitter.com/fat\">Action</a></li>\n");
      out.write("        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"http://twitter.com/fat\">Another action</a></li>\n");
      out.write("        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"http://twitter.com/fat\">Something else here</a></li>\n");
      out.write("        <li role=\"presentation\" class=\"divider\"></li>\n");
      out.write("        <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"http://twitter.com/fat\">Separated link</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- JavaScript Includes -->\n");
      out.write("\n");
      out.write("<script src=\"assets/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"assets/js/transition.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"assets/js/dropdown.js\" type=\"text/javascript\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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

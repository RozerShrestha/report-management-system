package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Carousel</title>\n");
      out.write("  <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("  <div class=\"page-header\">\n");
      out.write("    <h1>Carousel <small>Bootstrap Visual Test</small></h1>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\" class=\"\"></li>\n");
      out.write("      <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\" class=\"\"></li>\n");
      out.write("    </ol>\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("          \n");
      out.write("        <img alt=\"First slide\" src=\"assets/photo/1.jpg\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img alt=\"Second slide\" src=\"http://37.media.tumblr.com/tumblr_m8tazfiVYJ1qa42jro1_1280.jpg\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img alt=\"Third slide\" src=\"http://38.media.tumblr.com/tumblr_m8tb2rVsD31qa42jro1_1280.jpg\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <a class=\"left carousel-control\" href=\"#carousel-example-generic\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#carousel-example-generic\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- JavaScript Includes -->\n");
      out.write("<<script src=\"assets/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"assets/js/transition.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"assets/js/carousel.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

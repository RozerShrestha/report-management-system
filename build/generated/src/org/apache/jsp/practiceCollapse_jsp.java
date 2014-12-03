package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class practiceCollapse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Collapse</title>\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("  <div class=\"page-header\">\n");
      out.write("    <h1>Collapse <small>Bootstrap Visual Test</small></h1>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"panel-group\" id=\"accordion\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\">\n");
      out.write("            Collapsible Group Item #1\n");
      out.write("          </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapseOne\" class=\"panel-collapse collapse in\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\">\n");
      out.write("            Collapsible Group Item #2\n");
      out.write("          </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapseTwo\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\">\n");
      out.write("            Collapsible Group Item #3\n");
      out.write("          </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapseThree\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/transition.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/collapse.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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

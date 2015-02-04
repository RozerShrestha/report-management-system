package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adduser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css\">\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("        padding:10px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>");
      out.write("\n");
      out.write("        <h1>Add User</h1>\n");
      out.write("        <form role=\"form\" action=\"saveuser.jsp\" method=\"post\">            \n");
      out.write("            <!--<input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Enter Name of the student\">-->            \n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"roll\" placeholder=\"Enter roll\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"subject\" placeholder=\"Enter subject\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"class\" placeholder=\"Enter class\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"assignment\" placeholder=\"Enter marks secured in assignment\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"report\" placeholder=\"Enter marks secured in report\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"midterm\" placeholder=\"Enter marks secured in midterm\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"presentation\" placeholder=\"Enter presentation\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"preboard\" placeholder=\"Enter preboard\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"total\" placeholder=\"Enter total\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("        </form>        \n");
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

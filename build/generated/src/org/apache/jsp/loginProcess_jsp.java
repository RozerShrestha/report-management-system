package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class loginProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("service\n");
      out.write("\n");

    String user = request.getParameter("username");
    String pos= request.getParameter("position");
    String pass = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/reportmanagementsystem", "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    //System.out.println(user);
    System.out.println(con);
    String sql = "select *from login where UserName='" + user + "'and position='"+pos+"' and Password='" + pass + "'";
    rs = st.executeQuery(sql);
    if (rs.next()) {
        out.println("success");
        session.setAttribute("userId",user);
        session.getAttribute(user);
        if (pos.equals("management"))
             response.sendRedirect("managmentDashboard.jsp");
        if(pos.equals("student"))
            response.sendRedirect("studentDashboard.jsp"); 
        if(pos.equals("teacher"))
            response.sendRedirect("teacherDashboard.jsp");
           
        
    } else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
    session.setAttribute("sessionData",user);

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

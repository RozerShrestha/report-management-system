<%@ page import ="java.sql.*" %>

service

<%
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
//        session.setAttribute("userid",user);
        response.sendRedirect("managmentDashboard.jsp");

    } else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }

%>






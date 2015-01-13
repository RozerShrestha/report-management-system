<%-- 
    Document   : login
    Created on : Dec 3, 2014, 8:49:43 AM
    Author     : Rozer
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>


        <meta charset="utf-8">
        <title>Fullscreen Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">
  

        <div class="page-header" >
            <h1><center>Report Management System</center></h1>
        </div>
        <div class="page-container">
            <h1>Login</h1>
            <form name="loginform" action="login.jsp" method="post">
                <input type="text" name="username" class="username" placeholder="Username">
                <br><br>
                <select name="position" style="color:#f0ad4e">
                    <option value="management" style="color: #000000">Management</option>
                    <option value="teacher" style="color: #000000">Teacher</option>
                    <option value="student" style="color: #000000">Student</option>
                </select>
                <input type="password" name="password" class="password" placeholder="Password">
                <h1><button type="submit">Sign me in</button></h1>


            </form>
        </div>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>

    



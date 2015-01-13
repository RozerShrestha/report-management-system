/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ReportManagementSystem.model;

import com.ReportManagementSystem.Db.DBConnection;
import com.ReportManagementSystem.entities.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rozer
 */
public class Student_bim1st {
    
    public static int insert(Student students) throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();//DBConnection class ko object banako
        connection.open();
        String sql="INSERT INTO student_bim1st(name,roll,assignment,report,midterm,presentation,preboard,total ) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,students.getName());
        statement.setInt(2,students.getRoll());
        statement.setInt(3,students.getAssignment());
        statement.setInt(4,students.getReport());
        statement.setInt(5,students.getMidterm());
        statement.setInt(6,students.getPresentation());
        statement.setInt(7,students.getPreboard());
        statement.setInt(8,students.getTotal());
                      
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static int Update(Student students) throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update student_bim1st set name=?,roll=?,assignment=?,report=?, midterm=?, presentation=?, preboard=?, total=? WHERE id=?";
        System.out.println(students.toString());
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,students.getName());
        statement.setInt(2,students.getRoll());
        statement.setInt(3,students.getAssignment());
        statement.setInt(4,students.getReport());
        statement.setInt(5,students.getMidterm());
        statement.setInt(6,students.getPresentation());
        statement.setInt(7,students.getPreboard());
        statement.setInt(8,students.getTotal());
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
        public static int Delete(Integer id) throws ClassNotFoundException, SQLException
        {
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM student_bim1st WHERE id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setString(1,id.toString());

        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static ArrayList<Student> getAll() throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Student> students=new ArrayList<Student>();
        String sql="SELECT * from students";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Student studentss=new Student();
            studentss.setName(rs.getString("name"));
            studentss.setRoll(Integer.parseInt(rs.getString("roll")));
            studentss.setAssignment(Integer.parseInt(rs.getString("assignment")));
            studentss.setReport(Integer.parseInt(rs.getString("report")));
           studentss.setMidterm(Integer.parseInt(rs.getString("midterm")));
           studentss.setPresentation(Integer.parseInt(rs.getString("presentation")));
           studentss.setPreboard(Integer.parseInt(rs.getString("preboard")));
           studentss.setTotal(Integer.parseInt(rs.getString("total")));
          students.add(studentss);   
        }
        connection.close();                
        return students;
    }
    
//    public static User getByPk(int id) throws ClassNotFoundException, SQLException{
//        DBConnection connection=new DBConnection();
//        connection.open();
//        User students=null;
//        String sql="SELECT * from studentss where students_id=?";
//        PreparedStatement statement= connection.initStatement(sql);
//        statement.setInt(1, id);
//        ResultSet rs=connection.executeQuery();
//       while(rs.next()){
//            students=new User();
//            students.setUserId(Integer.parseInt(rs.getString("students_id")));
//            students.setUserName(rs.getString("studentsname"));
//            students.setPassword(rs.getString("password"));
//            students.setEmail(rs.getString("email"));
//            students.setAddedDate(rs.getDate("added_date"));
//            
//                students.setLoginDate(rs.getDate("login_date"));
//           
//            students.setStatus(rs.getBoolean("status"));
//            
//            
//        }
//        connection.close();                
//        return students;
//    }
}

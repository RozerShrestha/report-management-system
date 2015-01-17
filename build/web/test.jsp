<%@include file="header.jsp" %>
<%@page import="com.ReportManagementSystem.entities.Student,com.ReportManagementSystem.model.Student_bim1st"%>

        
        <table class="table table-bordered table-striped">
            <tr>
                <th>Name</th>
                <th>Subject</th>
                <th>Class</th>
                <th>Roll</th>
                <th>Assignment</th>
                <th>Report</th>
                <th>Midterm</th>
                <th>Presentation</th>
                <th>Preboard</th>
                <th>Total</th>
            </tr>
        <%
           try{
             for(Student u:Student_bim1st.getAll()){
          %>
            <tr>
                <td><%=u.getName()%></td>
                <td><%=u.getSubject()%></td>
                <td><%=u.getclass()%></td>
                <td><%=u.getRoll()%></td>
                <td><%=u.getAssignment()%></td>
                <td><%=u.getReport()%></td>
                <td><%=u.getMidterm()%></td>
                <td><%=u.getPresentation()%></td>
                <td><%=u.getPreboard()%></td>
                <td><%=u.getTotal()%></td>
                
                
            </tr> 
           
          
          <%
               }
           }catch(Exception ex){
               out.println(ex.getMessage());
           }
           
        %>
        </table>
    </body>
</html>

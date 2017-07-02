
<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.*" %>
<%ResultSet resultset =null,rs;%>
<%@ page import="java.net.URLDecoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DATABASE insertion</title>
    </head>
    <body>
        <%
           String name = request.getParameter("name");
           String song = request.getParameter("song");
           String id = request.getParameter("id");
           String comment = request.getParameter("comment");

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = null; 
                        connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
                        Statement statement = connection.createStatement() ;
                        Statement st2 = connection.createStatement() ;

                         if(!connection.isClosed())
                            out.println("Successfully connected to " + "MySQL server using TCP/IP...");
                      
           statement.executeUpdate("insert into comments(name,id,song,comment) values( '"+name+"','"+id+"','"+song+"','"+comment+"')");
 
                        
        %>
        
        <script>
            window.location="http://localhost:8080/WebApplication1/comment.jsp?name=<%=name%>&&id=<%=id%>&&song=<%=song%>";
            </script>
    </body>
</html>
<%-- 
    Document   : database
    Created on : Mar 18, 2017, 11:16:55 PM
    Author     : saurabh
--%>

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
            String s,m,f;
            int i=0;
           String name = request.getParameter("name");
           String music = request.getParameter("music");
           String friend = request.getParameter("friend");
           String id = request.getParameter("id");
           String email = request.getParameter("email");
           String music_count = request.getParameter("music_count");
           String friend_count = request.getParameter("friend_count");

                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = null; 
                        connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
                        Statement statement = connection.createStatement() ;
                        Statement st2 = connection.createStatement() ;

                         if(!connection.isClosed())
                            out.println("Successfully connected to " + "MySQL server using TCP/IP...");
 
                        resultset =statement.executeQuery("select * from data") ;
                        while(resultset.next())
                        {
                            //checking if existing user
                           out.print("while vale me h");
                           s=resultset.getString(1);
                           m=resultset.getString(5);
                           f=resultset.getString(7);

                            if(s.equals(id))
                            {
                                 i=1;
                                 out.print("if vale me h");
                                //account already exixts
                                if(!m.equals(music_count))
                                {
                                    //user liked more music pages after login 
                                    out.print("music vale me h");
                                    st2.executeUpdate("update data set musicx='"+music+"' , mcount='"+music_count+"' where idx='"+id+"' ");
                                }
                                
                                if(!f.equals(friend_count))
                                {
                                    out.print("friend vale me h");
                                    //user's friends added to the soundMatch
                                    st2.executeUpdate("update data set friendx='"+friend+"' , fcount='"+friend_count+"' where idx='"+id+"' ");
                                }
                            }                        
                        }
                        
                        if(i==0)
                            {
                                out.print("insert vale me h");
                                statement.executeUpdate("insert into data(idx,namex,emailx,musicx,mcount,friendx,fcount) values( '"+id+"','"+name+"','"+email+"','"+music+"','"+music_count+"','"+friend+"','"+friend_count+"')");
                                //statement.executeUpdate("insert into data(idx,namex,emailx,musicx) values( '"+id+"','"+name+"','"+email+"','"+music+"')");
                            }                       
                       // statement.executeUpdate("insert into category(artist,type ,count) values ('saurabh' ,'"+s+"',1)") ;
                        
                    }catch(Exception e)
                        {
                             out.println("wrong entry "+e);
                        }
        %>
        
        <script>
            window.location="index.jsp?name=<%=name%>&&id=<%=id%>";
            </script>
    </body>
</html>
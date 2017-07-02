
<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>artsists</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Mosaic Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet"> 
<link rel="stylesheet" href="css/icon-font.css" type='text/css' />
<script src="js/jquery-2.1.4.js"></script>
    </head>
    <body>
        <%
            String name=null,id=null;
            String artist=null,s=null ;
            if((request.getParameter("artist")!=null)&&(request.getParameter("name")!=null)&&(request.getParameter("id")!=null))
            {
                name=request.getParameter("name");
                id=request.getParameter("id");
                artist = request.getParameter("artist");                                 
                 

               try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = null; 

                        connection = DriverManager.getConnection("jdbc:mysql://localhost/soundMatch","root","");
                        Statement statement = connection.createStatement() ;

                         if(connection.isClosed())
                            out.println("NOT connected to " + "MySQL server using TCP/IP...");

                        resultset =statement.executeQuery("select * from categorya where artist='"+artist+"' ") ;

                        while(resultset.next())
                        {
                            s = resultset.getString(1);
                            /*out.print(s);
                            out.println("<br>");*/
                        
        %>
 <div class="col-md-3 artist-grid">
 <a href="history?song=<%=resultset.getString(1)%>&&link=<%=resultset.getString(3)%>&&name=<%=name%>&&id=<%=id%>&&type=<%=resultset.getString(5)%>" onclick="location.href=this.href+;return false;"><img src="images/music.jpg" title="allbum-name"></a>
 <a href="history?song=<%=resultset.getString(1)%>&&link=<%=resultset.getString(3)%>&&name=<%=name%>&&id=<%=id%>&&type=<%=resultset.getString(5)%>" onclick="location.href=this.href;return false;"><i class="glyphicon glyphicon-play-circle"></i></a>
 <a class="art" href="history?song=<%=resultset.getString(1)%>&&link=<%=resultset.getString(3)%>&&name=<%=name%>&&id=<%=id%>&&type=<%=resultset.getString(5)%>" onclick="location.href=this.href;return false;"><%out.print(resultset.getString(1));%></a>
 </div>

 <%
                        }      
                    }catch(Exception e)
                        {
                             out.println("wrong entry "+e);
                        }
            }
 %>
 
   <footer>
       <p>soundMatch</p>    
   </footer>

<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<script src="js/bootstrap.js"></script>
    </body>
</html>

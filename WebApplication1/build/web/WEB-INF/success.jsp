<%-- 
    Document   : success
    Created on : Apr 20, 2017, 8:23:38 PM
    Author     : saurabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <h1>Congratulations!</h1>

    <p>You have successfully logged in.</p>

    <p>Your name is: <bean:write name="validatelogin" property="name" />.</p>

    <p>Your email address is: <bean:write name="validatelogin" property="email" />.</p>
        <p>Your password is: <bean:write name="validatelogin" property="password" />.</p>
        <%
    String redirectURL = "index.jsp";
    response.sendRedirect(redirectURL);
%>
    </body>
</html>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <html:base/>
    </head>
    <body style="background-color: white">
        
<html:form action="/login">
    <table border="0">
        <tbody>
             <tr>
                <td colspan="2">
                    <bean:write name="validatelogin" property="error" filter="false"/>
                    &nbsp;</td>
            </tr>
            <tr>
                <td>Enter your name:</td>
                <td><html:text property="name" /></td>
            </tr>
            <tr>
                <td>Enter your email:</td>
                <td><html:text property="email" /></td>
            </tr>
            <tr>
                <td></td>
                <td><html:submit value="Login" /></td>
            </tr>
        </tbody>
    </table>
</html:form>
        
    </body>
</html:html>

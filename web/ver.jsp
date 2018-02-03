<%-- 
    Document   : ver
    Created on : 01-13-2018, 10:41:08 AM
    Author     : Nolasco
--%>

<%@page import="javabeans.Computadora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Computadoras</h1>
        <%=(String) request.getAttribute("computadoras")%>
        <%
            Computadora c = new Computadora();
        %>
        <br/><br/>
        <a href="inicio.html">Inicio</a>
    </center>
</body>
</html>

<%-- 
    Document   : eliminar
    Created on : 01-13-2018, 11:18:14 AM
    Author     : Nolasco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar computadora</title>
    </head>
    
    <!--captura de datos e inserción en el Javabean-->
    <jsp:useBean id="computadora" scope="request" class="javabeans.Computadora" />
    <jsp:setProperty name="computadora" property="*"/>
    <%if (request.getParameter("id") != null) {%>
    <jsp:forward page="controlador?operacion=eliminar"/>
    <%}%>
    <body>
       <center>
       <h1>Eliminar computadora</h1>
        <form method="post" >
            <br/><br/>
            Introduzca ID:  <input type="text" name="marca"><br/>
            
            <input type="submit" name="Submit" value="Guardar">
            <input type="reset" value="Reset">
        </form>
       <br>
       <br>
       <a href="inicio.html">Inicio</a>
       
    </center>
    </body>
</html>

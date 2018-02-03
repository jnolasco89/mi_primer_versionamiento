<%-- 
    Document   : paginaModificar
    Created on : 01-13-2018, 10:34:54 AM
    Author     : Nolasco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar computadora</title>
    </head>
    <!--captura de datos e inserción en el Javabean-->
    <jsp:useBean id="computadora" scope="request" class="javabeans.Computadora" />
    <jsp:setProperty name="computadora" property="*"/>
    <%if (request.getParameter("id") != null) {%>
    <jsp:forward page="controlador?operacion=modificar"/>
    <%}%>
    <body>
    <center>
       <h1>Modificar computadora</h1>
        <form method="post" >
            <br/><br/>
            <b>Datos de la computadora:</b><br/><br/>
            Introduzca Id:  <input type="text" name="id"><br/>
            <br/>
            Introduzca Marca:  <input type="text" name="marca"><br/>
            <br/>
            Introduzca Procesador:  <input type="text" name="procesador"><br/>
            <br/>
            Introduzca Memoria: <input type="number" name="memoria"><br/>
            <br/>
            Introduzca Disco: <input type="text" name="disco"><br/>
            <br/>
            Introduzca Memoria de video: <input type="number" name="disco"><br/><br/>
            <br/>
            Introduzca Descripcion:  <textarea name="descripcion"></textarea><br/>
            <br/>
            <input type="submit" name="Submit" value="Guardar">
            <input type="reset" value="Reset">
        </form>
    </center>
    </body>
</html>

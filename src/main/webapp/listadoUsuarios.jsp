<%-- 
    Document   : listadoUsuarios
    Created on : 25/11/2021, 07:06:35 PM
    Author     : Notes
--%>

<%-- Agregamos tablib para integrar la lista de personas. Con uri no es que se conecte a internet, sino a las librerias integradas --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de usuarios</title>
    </head>
    <body>
        <h1>Listado de usuarios</h1>

        <u1>
            <%-- Usamos el taglib de for each--%>
            <c:forEach items="${usuarios}" var="usuario">
                <%-- En la clase usuarios, del paquete domain, se ven los atributos disponibles que hay para llamar--%>
                <li>${usuario.username} ${usuario.password} ${usuario.idPersona.nombre} </li>
            </c:forEach>
        </u1>        
        
    </body>
</html>

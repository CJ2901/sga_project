<%-- 
    Document   : listadoPersonas
    Created on : 23/11/2021, 05:01:48 PM
    Author     : Notes
--%>

<%-- Agregamos tablib para integrar la lista de personas. Con uri no es que se conecte a internet, sino a las librerias integradas --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de personas</title>
    </head>
    <body>
        <h1>Listado de Personas</h1>
        
        <u1>
            <%-- Usamos el taglib de for each--%>
            <c:forEach items="${personas}" var="persona">
                <%-- En la clase Persona, del paquete domain, se ven los atributos disponibles que hay para llamar--%>
                <li>${persona.nombre} ${persona.apellido}</li>
            </c:forEach>
        </u1>
        
    </body>
</html>

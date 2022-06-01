<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Todos los Registros</h1>
    <c:forEach var="listaTotal" items="${sessionScope.personas}">
        <table cellspacing="3" cellpadding ="3" border="1"/>
        <tr>
            <td aling="alight"/>DUI </td>
            <td>${listaTotal.dui}</td>
        </tr>
        <tr>
            <td aling="alignt"/>APELLIDOS </td>
            <td>${listaTotal.apellidos}</td>
        </tr>
        <tr>
            <td aling="alight"/>NOMBRES </td>
            <td>${listaTotal.nombres}</td>
        </tr>
        </table>
    </c:forEach>
    </body>
</html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Todos los registros</h1>
        <c:forEach var="listaTotal" items="${sessionScope.personas}">
            DUI:${listaTotal.dui}<br>
            Apellidos:${listaTotal.apellidos}<br>
            Nombres:${listatotal.nombres}<br>
            <br>
            <hr>
        </c:forEach>
    </body>
</html>

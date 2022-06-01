<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="modificar.do" method="POST">
           DUI: <input  name="txtDui" value="" /> <br><br>
           Apellido: <input  name="txtApellidos" value="" /><br><br>
           Nombre: <input  name="txtNombres" value="" /><br><br>
        <input type="submit" value="Modificar"/>
        </form>
    </body>
</html>

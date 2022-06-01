<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar</title>
    </head>
    <body>
        <h1>Ingrese el DUI del registro a Eliminar</h1>
         <form action= "eliminar.do" method="POST">
           DUI:  <input type="text" name="txtDui" value="" /><br><br>
        <input type="submit" value="Eliminar" />
        </form>
    </body>
</html>

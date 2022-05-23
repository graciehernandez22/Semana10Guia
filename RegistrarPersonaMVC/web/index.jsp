<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de personas</h1>
        <!--En el action colocar el nombre del controlador, para este caso
        es recibir.do(la extension.do no importa solo indica que es servlet-->
        <form action="recibir.do" method="POST">
       Dui:<input type="text" name="txrDui" value="" /><br><br>
       Apellidos:<input type="text" name="txtApellidos" value="" /><br><br>
       Nombres:<input type="text" name="txtNombres" value="" /><br><br>
       <input type="submit" value="Registrar Nueva Persona"/>
       </form>
    </body>
</html>

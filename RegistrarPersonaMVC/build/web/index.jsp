<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" 
              integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
              crossorigin="anonymous">
    </head>
    <body>
        <h1>Registro de Personas</h1>

        <form action="recibir.do" method="post">
            <table class="table-info table-striped " cellspacing="2" border="2">
           
               <!-- <table class="table-striped"  cellpadding="1" border="3"> -->   
                <tr>
                    <td align="alight">Dui : </td><br>
                   <td><input type="text" name="txtDui" value="" /></td>
                </tr>
                <tr>
                   <td align="alight">Apellidos : </td>
                   <td><input type="text" name="txtApellidos" value="" /></td>
                </tr>
                <tr>
                   <td align="alight">Nombres : </td>
                   <td><input type="text" name="txtNombres" value="" /></td>
                </tr>
            </table> <br>
         <!--  <input type="reset" value="Borrar"/>-->
          <!--  <button type="submit" class="btn btn-primary">Registrar</button>-->

           <input type="submit" value="Registrar Nueva Persona" class="btn-success"><br><br>
            <input type="submit" class="btn-success" value="Mostrar" action="motrar.do" method="post"/>
         <!--     <input type="submit" value="Modificar" action="eliminar.do" method="post"/>-->
            
            <a href="/RegistrarPersonaMVC/btnModificar.jsp">Modificar</a>
            <a href="/RegistrarPersonaMVC/btnEliminar.jsp" >Eliminar</a>
        </form>
    </body>
</html>

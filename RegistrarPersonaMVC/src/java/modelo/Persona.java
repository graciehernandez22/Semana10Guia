package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona {

    //Atributos de la clase

    String dui;
    String apellidos;
    String nombres;

    Connection cnn;
    Statement state;
    ResultSet result;

    //Constructor vacio de la clase tipo  publico
    //El constructor lo utilizaremos para conectar con la base de datos.
    public Persona() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//Driver de la base de datos
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_recursos_humanos?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Persona(String dui, String apellidos, String nombres) {
        this.dui = dui;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public boolean insetarDatos() {
        try {
            String miQuery = "insert into tb_persona values('" + dui + "', '" + apellidos + "', '" + nombres + "');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<Persona> consultarRegistro() {
        ArrayList<Persona> person = new ArrayList();//crear el array de almacenamiento de tipo persona 
        try {
            String miQuery = "select * from tb_persona;";//Definir la consulta 
            state = cnn.createStatement();//Crear el boton para la consulta
            result = state.executeQuery(miQuery);//Ejecutar la consulta
            while (result.next()) {//recorre todo el resultSet y almacena en cada fila los registros encontrados.
                //El nombre de ser asi como esta en la base de datos.
                person.add(new Persona(result.getString("dui_persona"), result.getString("apellidos_persona"),
                        result.getString("nombre_persona")));
            }
        } catch (SQLException ex) {
                Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person;//Independientemente encuentro o no registro retorna el objeto person.
    }
        public boolean EliminarRegistro (){
        try {
            String miQuery = "delete from tb_persona where dui_persona = ('"+dui+"');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if(estado == 1){
                return true;
            }
        }catch (SQLException ex){
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        public boolean ModificarRegistro(){
        try {
            String miQuery = "update tb_persona set dui_persona =('"+dui+"'), apellido_persona =('"+apellidos+"'), nombre_persona = ('"+nombres+"');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()) .log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

}

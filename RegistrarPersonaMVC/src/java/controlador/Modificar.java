package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;



public class Modificar extends HttpServlet {

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            }
        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String dui = request.getParameter("txtDui");
      String apellidos = request.getParameter("txtApellidos");
      String nombres = request.getParameter("txtNombres");
      
      Persona person = new Persona();
      person.setDui(dui);
      person.setApellidos(apellidos);
      person.setNombres(nombres);
      
      if(person.ModificarRegistro() == true){
          request.getRequestDispatcher("Modificar.jsp").forward(request, response);
      }else{
          request.getRequestDispatcher("noModificar.jsp").forward(request, response);
      }    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

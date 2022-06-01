
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;

public class Eliminar extends HttpServlet {

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
        
        Persona person = new Persona();
        person.setDui(dui);
        
        if (person.EliminarRegistro() == true){
            request.getRequestDispatcher("Eliminar.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("noEliminar.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

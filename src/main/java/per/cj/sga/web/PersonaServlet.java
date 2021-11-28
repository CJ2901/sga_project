package per.cj.sga.web;

// Para transformar una clase en un servlet, agregar @WebServlet(ruta del servlet)
// También la clase debe de extender de la clase HttpServlet
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import per.cj.sga.domain.Persona;
import per.cj.sga.servicio.PersonaService;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // Este método accede al listado de personas, por medio de la instancia que recibimos del EJB
        List<Persona> personas = personaService.listarPersonas();
        System.out.println("personas: " + personas);
        
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
        
    }
    
}

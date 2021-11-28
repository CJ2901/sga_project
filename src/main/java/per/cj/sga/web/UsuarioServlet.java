package per.cj.sga.web;

// Para transformar una clase en un servlet, agregar @WebServlet(ruta del servlet)
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import per.cj.sga.domain.Usuario;
import per.cj.sga.servicio.UsuarioService;

@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet {

    @Inject
    UsuarioService usuarioService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        // Este método accede al listado de usuarios, por medio de la instancia que recibimos del EJB
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        System.out.println("usuarios:" + usuarios);
        
        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("listadoUsuarios.jsp").forward(request,response);        
    }
            
}

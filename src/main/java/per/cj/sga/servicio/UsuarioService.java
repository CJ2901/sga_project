// La razon de ser de la interfaz es para acceder a la capa de datos, interactuar con la base de datos y hacer las interacciones
package per.cj.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import per.cj.sga.domain.Usuario;

@Local // Especificar que la interfaz será LOCAL
public interface UsuarioService {
    
    public List<Usuario> listarUsuarios(); // Métodos para trabajar con persona
    
    public Usuario encontrarUsuarioPorId(Usuario usuario);
    public Usuario encontrarUsuarioPorUsername(Usuario usuario);
    public Usuario encontrarUsuarioPorClave(Usuario usuario);
    
    public void registrarUsuario(Usuario usuario);
    public void modificarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
}

// La razon de ser de la interfaz es para acceder a la capa de datos, interactuar con la base de datos y hacer las interacciones
package per.cj.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import per.cj.sga.domain.Usuario;

@Remote // Especifica que la interfaz será REMOTA
public interface UsuarioServiceRemote {
    
    public List<Usuario> listarUsuarios(); // Métodos para trabajar con persona
    
    public Usuario encontrarUsuarioPorId(Usuario usuario);
    public Usuario encontrarUsuarioPorUsername(Usuario usuario);
    public Usuario encontrarUsuarioPorClave(Usuario usuario);
    
    public void registrarUsuario(Usuario usuario);
    public void modificarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
}

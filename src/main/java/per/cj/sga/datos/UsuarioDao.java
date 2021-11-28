/*
    Interfaz de usuarioDAO
    El EJB del servicio usará esta interfaz para comunicarse a la base de datos
 */
package per.cj.sga.datos;

import java.util.List;
import per.cj.sga.domain.Usuario;

public interface UsuarioDao {

   // Regresa una lista del objeto usuario
    public  List<Usuario> findAllUsuarios();
    public Usuario findUsuarioById(Usuario usuario);
    public Usuario findUsuarioByUsername(Usuario usuario); 
    public Usuario findUsuarioByPassword(Usuario usuario); 
    public void insertUsuario(Usuario usuario);
    public void updateUsuario(Usuario usuario);
    public void deleteUsuario(Usuario usuario);    
}

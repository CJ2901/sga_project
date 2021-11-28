package per.cj.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import per.cj.sga.datos.UsuarioDao;
import per.cj.sga.domain.Usuario;


// Será necesario implementar la conexión creada anteriormente (remota y local)
@Stateless
public class UsuarioServiceImpl implements UsuarioServiceRemote, UsuarioService{

    @Inject
    private UsuarioDao usuarioDao;
    
    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAllUsuarios();
    }

    @Override
    public Usuario encontrarUsuarioPorId(Usuario usuario) {
        return usuarioDao.findUsuarioById(usuario);
    }

    @Override
    public Usuario encontrarUsuarioPorUsername(Usuario usuario) {
        return usuarioDao.findUsuarioByUsername(usuario);
    }

    @Override
    public Usuario encontrarUsuarioPorClave(Usuario usuario) {
        return usuarioDao.findUsuarioByPassword(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDao.insertUsuario(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDao.updateUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.deleteUsuario(usuario);
    }
    
}

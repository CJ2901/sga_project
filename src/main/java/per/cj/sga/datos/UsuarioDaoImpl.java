/*
    Esta clase debe ser un EJB para que se pueda inyectar el EM de JPA
*/
package per.cj.sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import per.cj.sga.domain.Usuario;


@Stateless
public class UsuarioDaoImpl implements UsuarioDao {

    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Usuario> findAllUsuarios() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(Usuario usuario) {
        return em.find(Usuario.class, usuario.getIdUsuario());
    }

    @Override
    public Usuario findUsuarioByUsername(Usuario usuario) {
        return em.find(Usuario.class, usuario.getUsername());
    }

    @Override
    public Usuario findUsuarioByPassword(Usuario usuario) {
        return em.find(Usuario.class, usuario.getPassword());
    }
    
    @Override
    public void insertUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        // Primero hacer un merge luego eliminar el objeto
        em.remove(em.merge(usuario));
    }
        
}

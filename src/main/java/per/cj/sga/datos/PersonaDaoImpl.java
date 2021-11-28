/*
    Esta clase debe ser un EJB para que se pueda inyectar el EM de JPA
*/
package per.cj.sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import per.cj.sga.domain.Persona;

@Stateless
public class PersonaDaoImpl implements PersonaDao{
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        // Tambien se pueden  crear querys directamente
        Query query = em.createNamedQuery("FROM Persona p WHERE p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult(); // Asegurate de que la columna "email" tenga valores unicos
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        // Primero hacer un merge luego eliminar el objeto
        em.remove(em.merge(persona));
    }
}

package per.cj.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import per.cj.sga.domain.Persona;
import per.cj.sga.datos.PersonaDao;


// Será necesario implementar la conexión creada anteriormente (remota y local)
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersonas() {
        // Se crea una lista de objeto Persona
        //List<Persona> personas = new ArrayList<>();
        
        // Agregamos algunos objetos tipo perosonas
        //personas.add(new Persona(1,"Juan","Perez","jperez@gmail.com","912812873"));
        //personas.add(new Persona(2,"Martha","Perez","mperez@gmail.com","941821873"));
        //---------------------------------------------------------------
        return personaDao.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    // Los siguientes modulos no es necesario regresar nada por ser void 
    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}

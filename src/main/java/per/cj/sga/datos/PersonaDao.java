/*
    Interfaz de personaDAO
    El EJB del servicio usará esta interfaz para comunicarse a la base de datos
 */
package per.cj.sga.datos;

import java.util.List;
import per.cj.sga.domain.Persona;


public interface PersonaDao {
   // Regresa una lista del objeto persona
    public  List<Persona> findAllPersonas();
    public Persona findPersonaById(Persona persona);
    public Persona findPersonaByEmail(Persona persona);
    public void insertPersona(Persona persona);
    public void updatePersona(Persona persona);
    public void deletePersona(Persona persona);
}

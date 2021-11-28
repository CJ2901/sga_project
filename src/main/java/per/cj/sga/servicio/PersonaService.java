// La razon de ser de la interfaz es para acceder a la capa de datos, interactuar con la base de datos y hacer las interacciones
package per.cj.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import per.cj.sga.domain.Persona;

@Local // Especifica que la interfaz será LOCAL
public interface PersonaService {
    
    public List<Persona> listarPersonas(); // Métodos para trabajar con persona

    public Persona encontrarPersonaPorId(Persona persona);
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    public void modificarPersona(Persona persona);
    public void eliminarPersona(Persona persona);  
}

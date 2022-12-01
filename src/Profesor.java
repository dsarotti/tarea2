
import java.sql.Date;
import java.util.ArrayList;

/**
 * @author Dante Sarotti
 * @version 0.1
 */
public class Profesor extends Persona {
    private ArrayList<Modulo> modulos;

    /**
     * 
     * @param dni
     * @param nombre
     * @param apellido
     * @param fechaNac
     * @param telefono
     * @param mail
     * @param direccion
     * @param modulos
     */
    public Profesor(DNI dni, String nombre, String apellido, java.util.Date fechaNac, int telefono, String mail,
            String direccion, ArrayList<Modulo> modulos) {
        super(dni, nombre, apellido, fechaNac, telefono, mail, direccion);
        this.modulos = modulos;
    }


    
    
}
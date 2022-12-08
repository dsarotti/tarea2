
import java.util.Date;

/**
 * @author Dante Sarotti
 * @version 0.1
 */
public class Alumno extends Persona {


    private boolean delegado = false;

    /**
     * @param dni
     * @param nombre
     * @param apellido
     * @param fechaNac
     * @param telefono
     * @param mail
     * @param direccion
     * @param delegado
     * @throws IllegalArgumentException
     */

    public Alumno(Matricula matricula, DNI dni, String nombre, String apellido, Date fechaNac, int telefono,
            String mail, String direccion) throws IllegalArgumentException {
        super(dni, nombre, apellido, fechaNac, telefono, mail, direccion);
    }

    public boolean esDelegado() {
        return this.delegado;
    }

    public void setdelegado(boolean delegado) {
        this.delegado = delegado;
    }

    @Override
    public String toString() {
        return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
                + ", fechaNac=" + fechaNac + ", telefono=" + telefono + ", mail=" + mail + ", direccion=" + direccion
                + ", delegado=" + delegado + "]";
    }
}
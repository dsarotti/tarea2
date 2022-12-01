
import java.util.Date;

/**
 * @author Dante Sarotti
 * @version 0.1
 */
public class Alumno extends Persona {

    private Matricula matricula;

    private boolean delegado = false;

    /**
     * @param matricula >> Implementación alternativa metiendo cada alumno en un
     *                  arraylist dentro del curso.
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
        this.matricula = matricula;
    }

    public boolean esDelegado() {
        return this.delegado;
    }

    public void setdelegado(boolean delegado) {
        this.delegado = delegado;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
                + ", fechaNac=" + fechaNac + ", telefono=" + telefono + ", mail=" + mail + ", direccion=" + direccion
                + ", delegado=" + delegado + "]";
    }
}
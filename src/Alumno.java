import java.util.Date;

/**
 * @author Dante Sarotti
 * @version 0.1
 */
public class Alumno {
    private Matricula matricula;
    private DNI dni;
    private String nombre;
    private String apellido;
    private Date fechaNac;
    private int telefono;
    private String mail;
    private String direccion;
    private boolean esDelegado = false;

    public Alumno(Matricula matricula, DNI dni, String nombre, String apellido, Date fechaNac, int telefono,
            String mail, String direccion, boolean esDelegado) throws IllegalArgumentException {

        this.dni = dni;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.mail = mail;
        this.direccion = direccion;
        this.esDelegado = esDelegado;
    }

    public boolean esDelegado(){
        return this.esDelegado;
    }
    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
                + ", fechaNac=" + fechaNac + ", telefono=" + telefono + ", mail=" + mail + ", direccion=" + direccion
                + ", esDelegado=" + esDelegado + "]";
    }

}
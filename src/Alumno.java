import java.util.Date;

/*
 * Almacena información sobre los alumnos
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

}

import java.util.Date;

public abstract class Persona {
    protected DNI dni;
    protected String nombre;
    protected String apellido;
    protected Date fechaNac;
    protected int telefono;
    protected String mail;
    protected String direccion;

    public Persona(DNI dni, String nombre, String apellido, Date fechaNac, int telefono, String mail,
            String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.mail = mail;
        this.direccion = direccion;
    }
    public DNI getDni() {
        return dni;
    }
    public void setDni(DNI dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Date getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
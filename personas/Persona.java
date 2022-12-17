package personas;

import java.util.Date;

public abstract class Persona {
    protected Dni dni;
    protected String nombre;
    protected String apellido;
    protected Date fechaNacimiento;
    protected int telefono;
    protected String email;
    protected String direccion;

    public Persona(Dni dni, String nombre, String apellido, Date fechaNacimiento, int telefono, String email,
            String direccion) throws IllegalArgumentException {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    /**
     * @return Dni
     */
    public Dni getDni() {
        return dni;
    }

    /**
     * @param dni
     */
    public void setDni(Dni dni) {
        this.dni = dni;
    }

    /**
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return Date
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return int
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

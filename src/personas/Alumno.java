package personas;

import java.util.Date;

public class Alumno extends Persona {
    private boolean delegado;

    public Alumno(Dni dni, String nombre, String apellido, Date fechaNacimiento, int telefono, String email,
            String direccion) throws IllegalArgumentException {
        super(dni, nombre, apellido, fechaNacimiento, telefono, email, direccion);
    }

    /**
     * @return boolean
     */
    public boolean isDelegado() {
        return delegado;
    }

    public void setDelegado() {
        this.delegado = true;
    }

    public void unsetDelegado() {
        this.delegado = false;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Alumno [delegado=" + delegado + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
                + ", fechaNacimiento="
                + fechaNacimiento + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion + "]";
    }

}
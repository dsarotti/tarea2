package ciclos;

import personas.Profesor;

public class ModuloProfesor {
    private Profesor profesor;
    private Modulo modulo;

    
    public ModuloProfesor(Profesor profesor, Modulo modulo) {
        this.profesor = profesor;
        this.modulo = modulo;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public Modulo getModulo() {
        return modulo;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    @Override
    public String toString() {
        return "ModuloProfesor [profesor=" + profesor + ", modulo=" + modulo + "]";
    }
}
package ciclos;

import personas.Profesor;

public class ModuloProfesor {
    private Profesor profesor;
    private Modulo modulo;

    
    public ModuloProfesor(Profesor profesor, Modulo modulo) {
        this.profesor = profesor;
        this.modulo = modulo;
    }
    
    /** 
     * @return Profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }
    
    /** 
     * @param profesor
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    /** 
     * @return Modulo
     */
    public Modulo getModulo() {
        return modulo;
    }
    
    /** 
     * @param modulo
     */
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "ModuloProfesor [profesor=" + profesor + ", modulo=" + modulo + "]";
    }
}
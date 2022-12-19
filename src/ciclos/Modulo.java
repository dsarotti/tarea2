package ciclos;

public class Modulo {
    private String nombre;
    private int codigo;
    private int horas;
    private Aula aula;

    /**
     * 
     * @param nombre
     * @param codigo
     */
    public Modulo(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    /**
     * 
     * @param nombre
     * @param codigo
     * @param horas
     * @param aula
     */
    public Modulo(String nombre, int codigo, int horas, Aula aula) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horas = horas;
        this.aula = aula;
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
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return int
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return Aula
     */
    public Aula getAula() {
        return aula;
    }

    /**
     * @param aula
     */
    public void setAula(Aula aula) {
        this.aula = aula;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Modulo [nombre=" + nombre + ", codigo=" + codigo + ", horas=" + horas + ", aula=" + aula + "]";
    }
}
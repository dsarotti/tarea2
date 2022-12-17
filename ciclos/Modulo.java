package ciclos;

public class Modulo {
    private String nombre;
    private String codigo;
    private int horas;
    private Aula aula;

    public Modulo(String nombre, String codigo, int horas, Aula aula) {
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
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo
     */
    public void setCodigo(String codigo) {
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
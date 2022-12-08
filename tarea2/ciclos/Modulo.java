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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Modulo [nombre=" + nombre + ", codigo=" + codigo + ", horas=" + horas + ", aula=" + aula + "]";
    }
}
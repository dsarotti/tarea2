package ciclos;

import java.util.ArrayList;

public class Ciclo {
    public static final int TIPO_MODULAR = 1;
    public static final int TIPO_DUAL = 2;
    public static final int TIPO_ORDINARIO = 3;

    private String nombre;
    private String codigo;
    private int tipo;
    private ArrayList<Modulo> modulos = new ArrayList<Modulo>();
    private Curso[] cursos;

    public Ciclo(String nombre, String codigo, int tipo, ArrayList<Modulo> modulos, Curso[] cursos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.modulos = modulos;
        this.cursos = cursos;
    }

    public Ciclo(String nombre, String codigo, int tipo, ArrayList<Modulo> modulos, int cursos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.modulos = modulos;
        setNumeroCursos(cursos);
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) throws IllegalArgumentException {
        if (!(tipo > 3 || tipo < 1)) {
            this.tipo = tipo;
        } else
            throw new IllegalArgumentException();
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public void setNumeroCursos(int cursos) throws IllegalArgumentException {
        if (!(cursos > 3 || cursos < 2)) {
            this.cursos = new Curso[cursos];
        } else
            throw new IllegalArgumentException();

    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    @Override
    public String toString() {
        return "Ciclo [nombre=" + nombre + ", codigo=" + codigo + ", tipo=" + tipo + "]";
    }
}

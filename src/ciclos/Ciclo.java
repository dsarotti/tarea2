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

    /**
     * Constructor con el que establecer el array de cursos con el @param cursos .
     * Utilizando estre constructor no es necesario establecer el array de cursos a
     * posteriori.
     * 
     * @param nombre
     * @param codigo
     * @param tipo
     * @param modulos
     * @param cursos
     */
    public Ciclo(String nombre, String codigo, int tipo, ArrayList<Modulo> modulos, Curso[] cursos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.modulos = modulos;
        this.cursos = cursos;
    }

    /**
     * Constructor con el que especificar el numero de cursos sin establecerlos con
     * el @param cursos .
     * Inicializa el array de cursos.
     * si se utiliza estre constructor deben introducirse los cursos a posteriori.
     * 
     * @param nombre
     * @param codigo
     * @param tipo
     * @param modulos
     * @param cursos
     */
    public Ciclo(String nombre, String codigo, int tipo, ArrayList<Modulo> modulos, int cursos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.modulos = modulos;
        setNumeroCursos(cursos);
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
    public int getTipo() {
        return tipo;
    }

    /**
     * Especifica el tipo de ciclo. Debe corresponderse con los valores de las
     * constantes de clase.
     * Si se especifica un numero distinto de 1, 2 o 3 lanza una excepción.
     * 
     * @param tipo
     * @throws IllegalArgumentException
     */
    public void setTipo(int tipo) throws IllegalArgumentException {
        if (!(tipo > 3 || tipo < 1)) {
            this.tipo = tipo;
        } else
            throw new IllegalArgumentException("El tipo debe ser un valor entre 1 y 3");
    }

    /**
     * @return Curso[]
     */
    public Curso[] getCursos() {
        return cursos;
    }

    /**
     * @param cursos
     */
    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    /**
     * Cada ciclo tiene 2 o 3 cursos.
     * Si se especifica un numero de cursos distinto de 2 o 3 lanza una excepción.
     * 
     * @param cursos
     * @throws IllegalArgumentException
     */
    public void setNumeroCursos(int cursos) throws IllegalArgumentException {
        if (!(cursos > 3 || cursos < 2)) {
            this.cursos = new Curso[cursos];
        } else
            throw new IllegalArgumentException("La cantidad de cursos debe ser 2 ó 3");
    }

    /**
     * @return ArrayList<Modulo>
     */
    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    /**
     * @param modulos
     */
    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Ciclo [nombre=" + nombre + ", codigo=" + codigo + ", tipo=" + tipo + "]";
    }
}
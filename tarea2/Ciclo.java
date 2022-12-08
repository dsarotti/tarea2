import java.util.ArrayList;

public class Ciclo {
    public static final int TIPO_MODULAR = 1;
    public static final int TIPO_ORDINARIO = 2;
    public static final int TIPO_DUAL = 3;

    private final String nombre;
    private final int tipo;
    private final String codigo;
    private ArrayList<Modulo> modulos = new ArrayList<Modulo>();

    public Ciclo(String nombre, int tipo, String codigo){
        this.nombre = nombre;
        this.tipo=tipo;
        this.codigo = codigo;
    }

    public Ciclo(String nombre, int tipo,String codigo, ArrayList<Modulo> modulos){
        this(nombre,tipo, codigo );
        this.modulos = modulos;
    }
}
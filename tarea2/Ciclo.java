import java.util.ArrayList;

public class Ciclo {
    public static final int TIPO_MODULAR = 1;
    public static final int TIPO_ORDINARIO = 2;
    public static final int TIPO_DUAL = 3;

    private final int tipo;
    private final String codigo;
    private final String nombre;
    private ArrayList<Modulo> modulos = new ArrayList<Modulo>();

    public Ciclo(String nombre, int tipo){
        this.nombre = nombre;
        this.tipo=tipo;

    }

    public Ciclo(String nombre, int tipo, ArrayList<Modulo> modulos){
        this(nombre,tipo);
        this.modulos = modulos;
    }
    
    

}
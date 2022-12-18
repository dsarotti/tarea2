import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

import ciclos.Aula;
import ciclos.Ciclo;
import ciclos.Modulo;
import ciclos.ModuloProfesor;
import personas.Alumno;
import personas.Dni;
import personas.Profesor;

public class Main {
    public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    public static ArrayList<Profesor> profesores = new ArrayList<Profesor>();
    public static ArrayList<Aula> aulas = new ArrayList<Aula>();
    public static ArrayList<Modulo> modulos = new ArrayList<Modulo>();
    public static ArrayList<Ciclo> ciclos = new ArrayList<Ciclo>();
    public static ArrayList<ModuloProfesor> modProf = new ArrayList<ModuloProfesor>();
    public static Random r = new Random();

    public static void main(String[] args) {

        String hola ="hola";

        if (hola.isEmpty())
        // Generar n alumnos
        generarAlumnos(30);

        // Las aulas deben existir para que los modulos se impartan en ellas
        generarAulas(10);

        // los modulos deben existir antes de contratar profesores para impartirlos
        generarModulos(25);

        // generar n profesores

    }

    public static void generarAlumnos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            alumnos.add(new Alumno(generarDni(), "alNom" + i, "alApe" + i, generarFecha(), 636948000 + i,
                    "alNom" + i + "@correo.com", "direccion aleatoria nº" + i));
        }
    }

    public static void generarAulas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            aulas.add(new Aula("planta x", i, r.nextInt(30)));
        }
    }

    public static void generarModulos(int cantidad) {
        Random r = new Random();
        for (int i = 0; i < cantidad; i++) {
            modulos.add(new Modulo("Modulo " + i, r.nextInt(999), r.nextInt(450), aulas.get(i % 10)));
        }
    }

    public static void generarProfesores(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            profesores.add(new Profesor(generarDni(), "profNom" + i, "profApe" + i, generarFecha(), 636948000 + i,
                    "profNom" + i + "@correo.com", "direccion aleatoria nº" + i, modulos.get(i%modulos.size())));
        }
    }

    public static Dni generarDni() {
        Random r = new Random();
        int numero = r.nextInt(100000000, 1000000000);
        return new Dni(numero, Dni.TABLA_LETRAS[numero % Dni.TABLA_LETRAS.length]);
    }

    public static Date generarFecha() {
        Random r = new Random();
        long milisegundos = r.nextLong(0, 1072911600999l);
        return new Date(milisegundos);
    }
}
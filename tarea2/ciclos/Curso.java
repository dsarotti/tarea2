package ciclos;

import java.util.ArrayList;
import personas.Alumno;
import personas.Profesor;

public class Curso {
    private ArrayList<Alumno> alumnos;
    private ArrayList<ModuloProfesor> modulosProfesores;
    private Alumno delegado;
    private Profesor tutor;

    public Curso(ArrayList<Alumno> alumnos, ArrayList<ModuloProfesor> modulosProfesores) {
        this.alumnos = alumnos;
        this.modulosProfesores = modulosProfesores;
    }

    public Curso(ArrayList<Alumno> alumnos, ArrayList<ModuloProfesor> modulosProfesores, Alumno delegado,
            Profesor tutor) throws IllegalArgumentException {
        this.alumnos = alumnos;
        this.modulosProfesores = modulosProfesores;
        if (esAlumno(delegado, alumnos)) {
            this.delegado = delegado;
            this.delegado.setDelegado();
        } else
            throw new IllegalArgumentException("El delegado debe ser alumno del curso.");
        if (esProfesor(tutor, modulosProfesores)) {
            this.tutor = tutor;
        } else
            throw new IllegalArgumentException("El tutor debe ser profesor de alguno de los modulos del curso.");
    }

    /**
     * @return Alumno
     */
    public Alumno getDelegado() {
        return delegado;
    }

    /**
     * @param delegado
     * @throws IllegalArgumentException
     */
    public void setDelegado(Alumno delegado) throws IllegalArgumentException {
        if (esAlumno(delegado, alumnos)) {
            this.delegado = delegado;
            this.delegado.setDelegado();
        } else
            throw new IllegalArgumentException("El delegado debe ser alumno del curso.");
    }

    /**
     * @param alumno
     * @param alumnos
     * @return boolean
     */
    public static boolean esAlumno(Alumno alumno, ArrayList<Alumno> alumnos) {
        return alumnos.contains(alumno);
    }

    /**
     * @return Profesor
     */
    public Profesor getTutor() {
        return tutor;
    }

    /**
     * @param tutor
     * @throws IllegalArgumentException
     */
    public void setTutor(Profesor tutor) throws IllegalArgumentException {
        if (esProfesor(tutor, modulosProfesores)) {
            this.tutor = tutor;
        } else
            throw new IllegalArgumentException("El tutor debe ser profesor de alguno de los modulos del curso.");
    }

    /**
     * @param profesor
     * @param modulosProfesores
     * @return boolean
     */
    public boolean esProfesor(Profesor profesor, ArrayList<ModuloProfesor> modulosProfesores) {
        boolean t = false;
        for (ModuloProfesor moduloProfesor : modulosProfesores) {
            if (moduloProfesor.getProfesor().equals(tutor)) {
                t = true;
                break;
            }
        }
        return t;
    }

    /**
     * @return ArrayList<Alumno>
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * @return ArrayList<ModuloProfesor>
     */
    public ArrayList<ModuloProfesor> getModulosProfesores() {
        return modulosProfesores;
    }

    /**
     * @param modulosProfesores
     */
    public void setModulosProfesores(ArrayList<ModuloProfesor> modulosProfesores) {
        this.modulosProfesores = modulosProfesores;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Curso [alumnos=" + alumnos + ", modulosProfesores=" + modulosProfesores + ", delegado=" + delegado
                + ", tutor=" + tutor + "]";
    }
}
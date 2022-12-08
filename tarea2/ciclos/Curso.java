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
        } else
            throw new IllegalArgumentException();
        if (esProfesor(tutor, modulosProfesores)) {
            this.tutor = tutor;
        } else
            throw new IllegalArgumentException();
    }

    public Alumno getDelegado() {
        return delegado;
    }

    public void setDelegado(Alumno delegado) throws IllegalArgumentException {
        if (esAlumno(delegado, alumnos)) {
            this.delegado = delegado;
        } else
            throw new IllegalArgumentException();
    }

    public boolean esAlumno(Alumno alumno, ArrayList<Alumno> alumnos) {
        return alumnos.contains(alumno);
    }

    public Profesor getTutor() {
        return tutor;
    }

    public void setTutor(Profesor tutor) throws IllegalArgumentException {
        if (esProfesor(tutor, modulosProfesores)) {
            this.tutor = tutor;
        } else
            throw new IllegalArgumentException();
    }

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

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<ModuloProfesor> getModulosProfesores() {
        return modulosProfesores;
    }

    public void setModulosProfesores(ArrayList<ModuloProfesor> modulosProfesores) {
        this.modulosProfesores = modulosProfesores;
    }

    @Override
    public String toString() {
        return "Curso [alumnos=" + alumnos + ", modulosProfesores=" + modulosProfesores + ", delegado=" + delegado
                + ", tutor=" + tutor + "]";
    }
}
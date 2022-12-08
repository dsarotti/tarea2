package ciclos;

import java.util.ArrayList;

public class Aula {
    private String nombrePlanta;
    private int numero;
    private int capacidad;
    private ArrayList<String> material;

    public Aula() {

    }

    public Aula(String nombrePlanta, int numero, int capacidad, ArrayList<String> material) {
        this.nombrePlanta = nombrePlanta;
        this.numero = numero;
        this.capacidad = capacidad;
        this.material = material;
    }

    public String getNombrePlanta() {
        return nombrePlanta;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<String> getMaterial() {
        return material;
    }

    public void setMaterial(ArrayList<String> material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Aula [nombrePlanta=" + nombrePlanta + ", numero=" + numero + ", capacidad=" + capacidad + ", material="
                + material + "]";
    }
}
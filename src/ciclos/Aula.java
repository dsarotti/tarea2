package ciclos;

import java.util.ArrayList;

public class Aula {
    private String nombrePlanta;
    private int numero;
    private int capacidad;
    private ArrayList<String> material;

    /**
     * 
     * @param nombrePlanta
     * @param numero
     * @param capacidad
     */
    public Aula(String nombrePlanta, int numero, int capacidad) {
        this.nombrePlanta = nombrePlanta;
        this.numero = numero;
        this.capacidad = capacidad;
    }

    /**
     * 
     * @param nombrePlanta
     * @param numero
     * @param capacidad
     * @param material
     */
    public Aula(String nombrePlanta, int numero, int capacidad, ArrayList<String> material) {
        this.nombrePlanta = nombrePlanta;
        this.numero = numero;
        this.capacidad = capacidad;
        this.material = material;
    }

    /**
     * 
     * @return nombrePlanta
     */

    public String getNombrePlanta() {
        return nombrePlanta;
    }

    /**
     * 
     * @param nombrePlanta
     */
    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    /**
     * @return int
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return int
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getMaterial() {
        return material;
    }

    /**
     * @param material
     */
    public void setMaterial(ArrayList<String> material) {
        this.material = material;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Aula [nombrePlanta=" + nombrePlanta + ", numero=" + numero + ", capacidad=" + capacidad + ", material="
                + material + "]";
    }
}
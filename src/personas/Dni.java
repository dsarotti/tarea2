package personas;

public class Dni {
    public static final char[] TABLA_LETRAS = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
            'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
    private int numero;
    private char letra;

    public Dni(int numero, char letra) throws IllegalArgumentException {
        if (!validarDni(numero, letra)) {
            throw new IllegalArgumentException("La letra no concuerda con el DNI introducido.");
        } else {
            this.numero = numero;
            this.letra = letra;
        }
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return (Integer.toString(numero) + letra);
    }

    /**
     * Comprueba si el numero del dni se corresponde con la letra.
     * 
     * @param numero
     * @param letra
     * @return true si el dni es válido o false si es inválido.
     */
    public static boolean validarDni(int numero, char letra) {
        return (TABLA_LETRAS[numero % TABLA_LETRAS.length] == letra);
    }
}
package personas;

import java.util.ArrayList;
import java.util.Date;

import ciclos.Modulo;

public class Profesor extends Persona {
   private ArrayList<Modulo> modulos;

   public Profesor(Dni dni, String nombre, String apellido, Date fechaNacimiento, int telefono, String email,
         String direccion, ArrayList<Modulo> modulos) throws IllegalArgumentException {
      super(dni, nombre, apellido, fechaNacimiento, telefono, email, direccion);
      this.modulos = modulos;
   }

   public Profesor(Dni dni, String nombre, String apellido, Date fechaNacimiento, int telefono, String email,
         String direccion, Modulo modulo) throws IllegalArgumentException {
      super(dni, nombre, apellido, fechaNacimiento, telefono, email, direccion);
      this.modulos = new ArrayList<Modulo>();
      this.modulos.add(modulo);
   }

   /**
    * @return String
    */
   @Override
   public String toString() {
      return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
            + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", email=" + email + ", direccion="
            + direccion + "]";
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

}

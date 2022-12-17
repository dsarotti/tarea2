public class Main {
    public static void main(String[] args) {
        System.out.println("hola");
        prueba();
    }    

    public static void prueba(){
        int numero;
        numero=10/0;
        try{
            numero=10/0;

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (Exception e){
            System.out.println("Exception");
        }finally{
            System.out.println("finalizacion del try");
        }
        System.out.println("fin del metodo");
    }
}

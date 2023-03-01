public class ejemploScope {
    public static void main(String[] args) {

        // Todo lo que esta delimitado por llaves

        System.out.println("Hello World!");

        int edad = 18;
        int cantidadPersonas = 2;

        boolean esPareja;

        // System.out.println("EL valor de la condicion es: " +esPareja);

        if (cantidadPersonas > 1){
            esPareja = true;
        }else{
            esPareja = false;
        }
    }
}

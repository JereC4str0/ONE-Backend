public class EjemploValoresVariables {
    public static void main(String[] args) {

        int numero1 = 5;
        int numero2 = 9;

        System.out.println(numero2);

        numero2 = numero1;
        System.out.println(numero2);

        numero1 = 88;
        // numero2 = ????
        // en java las variables guardan valores y no direcciones ni punteros
        System.out.println(numero2);
    }
}

public class ejemploContador2 {
    public static void main(String[] args) {
        int total = 0;
        int contador = 0;

        while(contador <= 10) {


            total = total + contador;

            System.out.println(contador);

            contador ++;
        }
        System.out.println(total);

    }
}

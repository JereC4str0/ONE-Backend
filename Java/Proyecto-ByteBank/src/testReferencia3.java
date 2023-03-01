public class testReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta(1);
        cuentaDeDiego.titular = new Cliente();


        System.out.println(cuentaDeDiego.titular.getNombre());
    }
}

public class testReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.getNombre();
        diego.getDocumento();
        diego.getTelefono();
        Cuenta cuentaDeDiego = new Cuenta(3);
        cuentaDeDiego.getAgencia();
        cuentaDeDiego.titular = diego;

        System.out.println(cuentaDeDiego.titular.getDocumento());
        System.out.println(cuentaDeDiego.titular);
        System.out.println(diego);

    }
}

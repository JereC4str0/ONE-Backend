public class testReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1);
        primeraCuenta.getSaldo();

        Cuenta segundaCuenta = primeraCuenta;

    }
}

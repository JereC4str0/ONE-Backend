public class PruebaMetodos {
    public static void main(String[] args) {

        Cuenta cuentaPersonal = new Cuenta(1);
        cuentaPersonal.getSaldo();

        cuentaPersonal.depositar(200);

        System.out.println(cuentaPersonal.getSaldo());

        cuentaPersonal.retirar(100);
        System.out.println(cuentaPersonal.getSaldo());

        Cuenta cuentaDeJimena = new Cuenta(1);
        cuentaDeJimena.depositar(1000);
        cuentaDeJimena.transferir(400, cuentaPersonal);

        System.out.println(cuentaDeJimena.getSaldo());
        System.out.println(cuentaPersonal.getSaldo());

    }



}

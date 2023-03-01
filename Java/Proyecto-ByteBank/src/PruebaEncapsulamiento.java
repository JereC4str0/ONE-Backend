public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        Cliente cliente = new Cliente();

       cliente.setNombre("diego");
       cliente.setDocumento("45330331");

       cuenta.setTitular(cliente);

        System.out.println(cliente);
        System.out.println(cuenta.getTitular().getNombre());
    }
}

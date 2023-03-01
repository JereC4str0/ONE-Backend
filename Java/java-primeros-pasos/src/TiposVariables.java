public class TiposVariables {
    public static void main(String[] args){

        // String

        System.out.println("Hola mundo");

        // Tipo int

        int edad = 23;
        System.out.println(edad);
        System.out.println("Tu edad es: " + edad);

        //Tipo Double

        double salario = 1250.50;
        System.out.println(salario);

        double salarioMitad = salario / 2;
        System.out.println(salarioMitad);

        // Redondea el r de la division

        int division = 1250 / 3;
        System.out.println(division);

        //Type Casting
        double variable1 = 230.89;
        //obliga a variable1 convertirse en un entero
        int variable1Int = (int)variable1;

        System.out.println(variable1Int);

        // long
        long prueba = 12222222222222L; //agregar L al final

        // short
        short numeroPequeño = 13555;

        // byte
        byte numeroAunMasPequeño = 15;

        // float
        float numeroDecimalPequeño = 2.5F; //agregar F al final
    }
}

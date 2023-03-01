public class EjemploCaracteres {
    public static void main(String[] args){
        char caracter = '1'; // comillas simples para caracteres
        System.out.println(caracter);

        caracter = 65 + 1;
        char segundoCaracter = (char)(caracter + 1);

        System.out.println(segundoCaracter);

        String palabra = "Alura Cursos Online";
        palabra = palabra + "2023";
        System.out.println(palabra);
    }
}

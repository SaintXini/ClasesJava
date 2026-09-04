package clase1;

public class VariablesAndConstants {

    public static void main(String[] args) {
        // Variables
        String name = "Martín Santiago";
        System.out.println("Nombre: " + name);

        int age = 25;
        System.out.println("Edad: " + age);

        // si se utiliza "var" el cual suele interpretar su tipo de dato
        // Se denomina inteferencia de datos
        var email = "lalal@gmail.com";
        System.out.println("Email: " + email);

        // Coontantes = su valor se mantiene
        System.out.println("\nCOnstantes");

        final String EMAIL = "ss.mscx@gmail.com";
        // Para definir la constante se utiliza final en lugar de const
        // y se suelen escribir en mayuscula, es preferible
        System.out.println("Email: " + EMAIL);


    }

}

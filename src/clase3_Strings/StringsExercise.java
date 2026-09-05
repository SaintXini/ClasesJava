package clase3_Strings;

public class StringsExercise {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto

        String name = "santiago";
        var age = 25;

        System.out.println("hola me llamo " + name + " y mi edad es de " + age);

        // 2. Muestra la longitud de una cadena de texto
        System.out.println(name.length());

        // 3. Muestra el primer y último caráctes de un String
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(7));

        // 4. Convierte en mayuscula y minuscula un string
        System.out.println("\n"+name.toLowerCase());
        System.out.println(name.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra
        System.out.println("Hola martin como estas.".contains("martin"));

        // 6. Fromatea un String con un entero
        String text = "13234";
        System.out.println(Integer.parseInt(text));

        // 7. Elimina los espacios en blanco al principio y al final
        System.out.println(" Hola martin como estas. ".trim());

        


    }
}

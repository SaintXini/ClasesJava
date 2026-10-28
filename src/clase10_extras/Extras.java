package clase10_extras;

import java.util.Scanner;

public class Extras {

    public static void main(String[] args) {

        // Extras

        // null

        String name = "Mar";
        name = null;

        if (name != null) {
            System.out.println(name.toLowerCase());
        }


        // import
        // es donde se imorta de un archivo a otro
        // este podría llamar a otro de la primera clase, pero lo importa

        // import clase08_POO.*; el asterisco sirve para marcar todas las clases que se encuentran ahí
        // import clase08_POO.person; solo hace enfasis a esa clase
        // es recomendable solo lo de clases especificas, salvo que llamemos avarias clases

        // Scanner
        // Es cuando se solicita datos a los usuarios

        var scanner = new Scanner(System.in);

        System.out.print("Introduce tú edad: ");
        var edad = scanner.nextInt();

        System.out.print("La edad es: " + edad);

        // Scope

        // Variables locales
        // se encuentran dentro de la clase y metodo

        // Variables globales

        // Se especifica desde lo mas alto de la clase princpal
        // Son los que se encuentran fuera de las clases y metodos

        // Static


    }
}

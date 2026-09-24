package clase6_loops_o_bucles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {

        // Loops
        // nos permite para repetid ejecuciónes concretas
        // Nos suele servir para automatizar funciones


        // 1er Bucle "For", es el mas habitual
        // Controlado por un contador
        // Siempe se marca cuanto se utiliza

        for (int index = 0; index < 5; index++) {
            System.out.println("hola, Java!");
        }
        System.out.println("\n");

        String[] names = {"Martín", "Santiago", "Lala"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        System.out.println("\n");


        // Cuando ya se habla de estructuras, existe otro tipo de bucle
        // El cual puede pasar varios tipos de listas
        // Denominado "for-each"

        for (String name: names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Mar", "Mar@gmail.com");
        emails.put("Saint", "Saint@gmail.com");
        emails.put("Lala", "lala@gmail.com");

        // EntrySet sirve para volverlos valores unicos
        // Y sirve para ver varios valores diferentes
        // Lo habitual es que se maneje algun tipo de lógica en estos
        for (Map.Entry<String,String> email: emails.entrySet()) {
            System.out.println(email);
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

    }
}

package clase5_datos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercise {
    public static void main(String[] args) {

        // 1. Crea un Array con 5 val e imprime su longituda

        String[] names = {"Martín", "Santiago", "Fausto", "Te pienso", "siemrpe"};
        System.out.println(names);

        // 2. Modifica uno de los valores del Array e imprime el valor del indice antes de modificarlo
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        names[3] = "Siempre";
        System.out.println(names[2]);

        // 3. Crea un ArrayList vacio

        ArrayList<String> Country = new ArrayList<>();
        System.out.println(Country.size());

        // 4. Añade 4 valores al Array list y elimina uno a continuación

        Country.add("Esta noche");
        Country.add("Siempre");
        Country.add("Te pienso");
        Country.add("Y lo hare para siemrpe");

        System.out.println(Country);

        Country.set(2, "Te pensare");
        System.out.println(Country);

        // 5. Crea un HashSet con dos valores diferentes

        HashSet<String> book = new HashSet<>();
        book.add("Esta noche");
        book.add("Estrellada");

        System.out.println(book);

        // 6. añade un valor repetido y otro sin repetir al hasSet
        book.add("Esta noche");
        book.add("Te pienso");
        System.out.println(book);

        // 7. Elimina uno d elos elementos del Hashset

        book.remove("Estrellada");
        System.out.println(book);

        // 8. Crea un HasMap donde la clave sea un nombre y el valor el numero de telefo, añade tres contactos

        HashMap<String, Integer> dates1 = new HashMap<>();

        dates1.put("Carlos", 25072507);
        dates1.put("JUan", 24072407);
        dates1.put("Lala", 2307237);
        System.out.println(dates1);

        // 9. MOdifica uno de los contactos y elimina otro

        dates1.replace("Carlos", 3025789);
        dates1.remove("JUan");

        System.out.println(dates1);

        // 10. Dado un array, transformalo en un Arraylist, a continuación en un HashSet
        // Y finalmente en Hashmap
        // a Araylist

        ArrayList<String> names2 = new ArrayList<>(Arrays.asList(names));
        System.out.println(names2);

        // Ahora en un HashSet

        HashSet<String> names3 = new HashSet<>(Arrays.asList(names));
        System.out.println(names3);

        // HashMap
        HashMap<String, String> names4 = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            names4.put(names[i], names[i]);
        }

        System.out.println(names4);
    }

}

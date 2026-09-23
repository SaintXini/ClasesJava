package clase5_datos;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        // las listas son arreglos mas flexible a los arrays
        // Tienden a ser mas dinamicas y no estaticas, sin definir un tamaño fijo

        // Declaración y creación

        ArrayList<String> names = new ArrayList<>();

        var number = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos
        // Nos percatamos que es dinamico
        names.add("Jose");
        names.add("Mar");

        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        // 3.35
    }
}

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
        names.add("MarJose");
        names.add("Mar");

        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificar los elementos de las listas

        names.set(2, "ss.mscx@gmail.com");
        System.out.println(names.getLast());

        // Eliminar elementos de la lista

        names.remove(2);
       //  System.out.println(names.get(2)); // un Error ya no existe

        // Buscar elementos
        System.out.println(names.contains("MarJose"));
        System.out.println(names.contains("Mar"));

        // Limpiar toda la array list

        names.clear();
        System.out.println(names.size());

//        Las principales diferencias es que el array tiene un limite especifico y las lsitas tienen varios espacios
//         y Siempre se trabaja con objetos

    }
}

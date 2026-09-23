package clase5_datos;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        // Los sets son extructura que almacena datos unicos, no permite duplicados
        // Declararión y creación de Sets

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Ver el tamaño
        System.out.println(names.size());

        // Añadir elementosd
        names.add("Jose");
        names.add("MarJose");
        names.add("Mar");
        names.add("Martin");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Acceder a los elementos

        // Principal diferencia las listas son ordenadas
        // Y los sets son desordenados
        // Y accede a los elementos de una forma muy rapida
        // Y no se utilizan para ingresar datos de una forma ordenada, por eso no funciona la sintaxis de abajo
             /* System.out.println(names.getFirst());
                System.out.println(names.get(1));
                System.out.println(names.getLast()); */


        // Eliniar elementos
        names.remove("MarJose");
        System.out.println(names.size());

        //Buscar elementos
        // y los busca de forma mas rapida que los list

        System.out.println(names.contains("MarJose"));
        System.out.println(names.contains("Mar"));

        // Añadir elementos del mismo tipo
        // No permite repetidos, siemrpe controla esto

        System.out.println(names);
        names.add("Mar");
        System.out.println(names);

        // Trabajo con conjuntos

        //names.addAll(numbers); Error por incopatilidad de datos
        //Tiene que tener los mismos tipos de elemntos


        var countires = new HashSet<String>();
        countires.add("Guate");
        countires.add("Puerto");

        names.addAll(countires);
        System.out.println(names);

        names.removeAll(countires);
        System.out.println(names);

        // Solo guarda los elementos comunes pero en este caso no, porque ya los hemos eliminado
        names.retainAll(countires);
        System.out.println(names);
    }
}

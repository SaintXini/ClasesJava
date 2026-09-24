package clase5_datos;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // Los mapas o hasmaps, ya no almacena un solo conjuntod e valores, sino que almacena una talba de datos por decirlo así

        //Declaración y creación
        // En si son pares de valores
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.put("MarJose", "Mar@gmail.com");
        names.put("Mar", "sas@gmail.com");

        System.out.println(names.size());
        System.out.println(names);

        // Acceder a loos elementos

        System.out.println(names.get("MarJose"));
        System.out.println(names.get("Dev"));

        // Verificar si existe un elemento

        System.out.println(names.containsKey("MarJose"));
        System.out.println(names.containsKey("Dev"));

        // Si existe el valor
        System.out.println(names.containsValue("sas@gmail.com"));

        // Eliminar elementos

        System.out.println(names.remove("MarJose"));
        System.out.println(names.remove("Mar"));
        System.out.println(names);

        // LImpiar HashMap

        names.clear();
        System.out.println(names);

        // Otras operaciones

        names.put("brais", "brais@gmail.com");
        System.out.println(names);
        names.put("brais", "braissss@gmail.com");
        System.out.println(names);

        // Replace remplaza el valor si existe
        // putIfAbsent inserta algo que no existe
        // isEmpty, verifica sie esta vacio o no
        // value, manda una lista

    }
}

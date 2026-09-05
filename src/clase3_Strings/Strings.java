package clase3_Strings;

public class Strings {

    public static void main(String[] args) {

        // Cadenas de Texto
        String name = "Mar";
        var surname = new String("Mar");

        // Operaciónes Basicas
        // Concatenación
        System.out.println(name + " " + surname);

        // Lengent "Longitud del strint"
        System.out.println();
        System.out.println(name.length());

        //CharAr = obtiene el caracter especifico de un aspecto de la variable
        System.out.println(name.charAt(1));

        // Obtener una subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayusculas y minusculas tupper y to tupper

        System.out.println("\n"+name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);

        // Comprobar si contiene alguna palabra o parametro

        System.out.println("Hola, Java".contains("Martin"));
        System.out.println("Hola, Java".toUpperCase().contains("Martin"));

        // Comparar parametros, no es lo mismo comparar may y min
        System.out.println(name.equals("martin"));
        System.out.println(name.equalsIgnoreCase("martin"));

        // Trim y replace, modificar caracteres o eliminar
        // Trim = elimina espacios que estan de más
        System.out.println(" Hola, me llamo Martin ".trim());

        // Replace
        // se tiene que agregar los caracteres que se quieren quitar por los que se desean agregar
        System.out.println(" Hola, me llamo Martin ".replace(" ", ""));


        //Format
        // strings %s, enteros %d, decimales %f
        var age = 25;
        System.out.println(String.format("Hola, %s. tengo %d años", name, age));
    }
}

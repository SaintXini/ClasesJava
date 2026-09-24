package clase6_loops_o_bucles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LoopsExercise {

    public static void main(String[] args) {

        // 1. Imprime los numeros del 1 al 10 usando while

        int num = 0;
        while(num < 10){
            System.out.println((num++));
        }

        // 2. usa do - while paa mostar todos los valores de un arraylist
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Martin", "Santiago","Lala"));
        int index = 0;

        do {
            System.out.println(names.get(index));
            index++;
        } while (index < names.size());

        // 3. Imprime los multiplos de 5 del 1 al 50 usando for

        for(int i = 0; i <= 50; i +=5 ){
            System.out.println(i);
        }
        System.out.println("\n");


        // 4. Recorre un Array de 5 números e imprime la suma total
        int[] numeros = {5,10,15,20,25};
        int suma = 0;

        for (int a = 0; a < 5; a++ ) {
            System.out.println(a);
            suma += numeros[a];
        }
        System.out.println(suma);

        // 5. Usa u for para reccores un Array y mostrar susv alroes

        System.out.println("\n");

        int[] numb = {5,10,15,20,25};

        for (int a = 0; a < 5; a++ ) {
            System.out.println(numb[a]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HasjMpa

        //HashSet
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Banana");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // HasMpa
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("Maria", 30);

        for (String nombre : edades.keySet()) {
            System.out.println("Nombre: " + nombre);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int a = 1; a <= 20; a++) {
            if (a % 3 == 0) {
                continue;
            }
            System.out.println(a);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número (ej. el 7)
        for (int a = 1; a <= 10; a++) {
            if (a == 7) {
                System.out.println("¡Encontrado el 7! Deteniendo bucle...");
                break;
            }
            System.out.println("Número: " + a);
        }
    }
}

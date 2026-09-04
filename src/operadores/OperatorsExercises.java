package operadores;

public class OperatorsExercises {
    public static void main(String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmética.
        var a = 6;
        System.out.println(a+1);
        System.out.println(a-1);
        System.out.println(a*2);
        System.out.println(a/2);

        // 2. Crea una variable para cada tipo de operación de asignación

        a += 1;
        System.out.println("\n"+a);
        a -= 1;
        System.out.println(a);
        a *= 3;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        System.out.println();


        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparasion
        System.out.println(a);
        System.out.println(a != 6);
        System.out.println(a > 1);
        System.out.println(a >= 1);
        System.out.println();

        // 4. lo mismo de arriba pero falsas
        System.out.println(a == 7);
        System.out.println(a < 1);
        System.out.println(a <= 1);
        System.out.println();

        // 5. Utiliza el operador logico and
        System.out.println(6 > 2 && 4 != 2);

        // 6. Utiliza el operador or
        System.out.println(6 >= 10 || 4 != 4);

        // 7. Combina ambos operadores logicos

        System.out.println((6 != 2) && (4 >= 2) || 4 == 4);

        // 8. Añade alguna negación
        System.out.println(!(6 != 2) && (4 >= 2) || !(4 == 4));

        // 9. Imprime 3 ejemplos d euso de operadores unarios
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(++a);

        // 10. Combina operadores aritmeticos, de comparación y lógicos
        System.out.println();
        var b = 12;
        System.out.println(a+1 >= 5 && 13 >= 11);
    }
}

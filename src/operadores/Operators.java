package operadores;

public class Operators {

    public static void main(String[] args) {

        // Operadores

        // Aritméticos

        var a = 5;
        var b = 2;

        // más comunes
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();

        // Asignación
        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);

        // Comparación
        System.out.println();
    }
}

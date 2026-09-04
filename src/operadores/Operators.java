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

        // Asignación
        System.out.println("\nAsignación");
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

        // Comparación (Relacionales)
        System.out.println("\nRelacionales");
        System.out.println(a == b);
        System.out.println(a == 4);
        // distinto de
        System.out.println(a != 5);
        System.out.println(a > 5);
        System.out.println(a < 5);
        System.out.println(a >= 5);

        // Logicos
        System.out.println("\nLogicos");
            //And
        System.out.println();
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(3>5 && 4==5);
            //Or
        System.out.println();
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(3>5 || 4==5);

            // No (NOT)
        System.out.println();
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(3>5) || 4==5);

        // Unarios
        System.out.println("\nUnarios");
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

    }
}

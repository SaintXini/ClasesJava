package clase9_exception;

public class ExerciseExceptions {
    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.

        System.out.println("--- Ejercicio 1 ---");
        try {
            int numerador = 10;
            int denominador = 0;
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.

        System.out.println("\n--- Ejercicio 2 ---");
        try {
            int[] numeros = {10, 20, 30};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intentaste acceder a un índice fuera del límite del array.");
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.

        System.out.println("\n--- Ejercicio 3 ---");
        try {
            String texto = null;
            System.out.println("Longitud: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: No se puede medir la longitud de una variable nula.");
        }


        // 4. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.

        System.out.println("\n--- Ejercicio 4 ---");
        try {
            System.out.println("Intentando realizar una operación...");
            int error = 5 / 0; // Provoca error
        } catch (ArithmeticException e) {
            System.out.println("Error capturado en el Ejercicio 5.");
        } finally {
            System.out.println("Este bloque 'finally' se ejecuta SIEMPRE, haya o no error.");
        }

    }
}

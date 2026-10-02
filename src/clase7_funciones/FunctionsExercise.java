package clase7_funciones;

public class FunctionsExercise {
    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        saludo("Visualizador");

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        user("Visualizador");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        operation(19, 10);

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        cuadrado(12);

        // 5. Escribe una función que reciba un número y diga si es par o impar.

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

        // 7. Implementa una función que reciba una cadena y retorne su longitud.

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

        // 9. Escribe un método que reciba un número y retorna su factorial.

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    }


    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    public static void saludo(String name){
        System.out.println("Saludos " + name + " ¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void user(String name){
        System.out.println("Saludos " + name);
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static void operation(int a, int b){
        var resultado = a - b;

        System.out.println("Resultado de la operacion es:  " + resultado);
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static void cuadrado(int a){
        var resultado = a * a;
        System.out.println("Resultado de la operacion es:  " + resultado);
    }
}

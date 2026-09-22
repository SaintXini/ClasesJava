package clase4_condicionales;

public class CondicionesExercies {
    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o menor)

        var age = 18;

        if (age > 18) {
            System.out.println("L paresona puede votar\n");
        } else if (age == 18) {
            System.out.println("L persona recientemente puede votar\n");
        } else {
            System.out.println("L persona No puede votar\n");
        }

        // 2. Declare dos números y muestre cual es el mayor o si son iguales.
        var may = 31;
        var dife = 30;

        if (may == dife) {
            System.out.println("Los numeros son iguales\n");
        } else if (may > dife) {
            System.out.println("el primer n# es mayor al segundo\n");
        } else {
            System.out.println("el segundo n# es mayor al primero\n");
        }

        // 3. Verificar si un numero es positivo, negativo o cero
        var num = 0;

        if (num > 0) {
            System.out.println("El numero es positivo\n");
        } else if (num < 0) {
            System.out.println("El numero es negativo\n");
        } else {
            System.out.println("El numero es 0\n");
        }

        // 4. Crea un programa que diga si es numero para o impar
        var paim = 9;

        if (paim %2 == 0) {
            System.out.println("El numero es par\n");
        } else {
            System.out.println("El numero es impar\n");
        }

        // 5. Verifica si un numero esta en el rango del 1 al 100
        var range = 102;

        if (range >= 1 && range <= 10) {
            System.out.println("El numero se encuentra entre el rango del 1 al 100\n");
        } else {
            System.out.println("El numeroesta fuera delr ango\n");
        }

        // 6. Declara una variable con el dia de la semana y di su nombre
        var day = 10;

        switch (day) {
            case 1:
                System.out.println("El dia es lunes\n");
                break;
            case 2:
                System.out.println("El dia es Martes\n");
                break;
            case 3:
                System.out.println("El día es Miercoles\n");
                break;
           case 4:
               System.out.println("El día es Jueves\n");
               break;
           case 5:
               System.out.println("El día es Viernes\n");
               break;
           case 6:
               System.out.println("El día es sabado\n");
                break;
           case 7:
               System.out.println("El día es Domingo\n");
               break;
           default:
               System.out.println("El día no existe\n");
        }

        // 7. Declara una variable que muestre las notas "Sobresaliente", "Aprobado" o "Suspendido" según la nota (0 - 100)
        var use = 66;

        if (use >= 80 && use <= 100) {
            System.out.println("Sobresaliente\n");
        } else if (use >= 65 & use <= 79) {
            System.out.println("Aprobado\n");
        } else if (use >= 45 && use <= 64) {
            System.out.println("Reprovado\n");
        } else {
            System.out.println("Sin chance de recuperación\n");
        }

        // 8. Declara un programa que determine si puedes entrar al cine: debes tener al menos 15 año o ir acompañado
        // En este ejercicio utilice un bucle For anidado al If, debido a la forma del ejercicios
        char letraUsuario = 'E';
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        boolean encontrado = false;

        for (int i = 0; i < vocales.length; i++) {

            if (letraUsuario == vocales[i]) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }
    }
}

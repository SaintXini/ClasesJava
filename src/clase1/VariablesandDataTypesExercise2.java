package clase1;

public class VariablesandDataTypesExercise2 {
    public static void main(String[] args) {

        // 1. Declara una variable tipo Strin y asignale tu nombre.
        String myName = "martin";
        System.out.println("My name is " + myName);

        // 2. crea una variable de tpo int y asignale tu edad
        int age = 25;
        System.out.println("My age is " + age);

        // 3. Crea una variable double con tu altura en metros

        double altura = 1.68;
        System.out.println("My altura is " + altura);

        // 4. Declara una variable de true boolena que indique sie te gusta programar
        boolean like = true;
        System.out.println("My like is programer " + like);

        // 5. Declara una constante con tu email
        final String EMAIL = "ss.mscx@gmail.com";
        System.out.println("Email: " + EMAIL);

        // 6. Crea una variable de tipo char y guardale tu inicial

        char initial = 'M';
        System.out.println("Initial char is " + initial);

        // 7. crea una variable int llamada a, b e imprime la suma de ambas
        int a = 10;
        int b = 35;
        int suma = a + b;
        System.out.println("Initial int is " + suma);

        // imprime el tipo de varaible

        System.out.println(EMAIL.getClass().getSimpleName());

        // Crea una variable y luego asignale un valor antes de imprimirla
        String sister;
        sister = "Karen";
        System.out.println("sister is " + sister);
    }
}

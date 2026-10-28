package clase9_exception;

public class Exceptions {

    public static void main(String[] args){
        // Eventos que ocurren en la copilación del proyecto y detienen el programa

        // Manejo de excepciones

        // en "try" se coloca el codigo que puede llegar a dar un error o fallando
        // Si en dado caso no da errores avanza normalmente
        try {
            var result = 10 / 0;
            System.out.println(result);

        // En cathc se colocara el tipo de error que es
        // y si queremos saber cual es podríamos color solo "Exception e"
        // Es recomendable exception si no estamos seguros que tipo de error tiene o sabemos y saber cuales son
            // tambien podría ser runtimeException
        } catch(ArithmeticException e) {
            System.out.println("Error " + e);
        }



        // try con multiples catch, que puede manejar multiples errores
        //
        //
        //
        try {
            var result = 10 / 5;
            System.out.println(result);

            var name = "Martin";
            name = null;
            System.out.println("name: " + name.toUpperCase());

        } catch (ArithmeticException e) {
            System.out.println("Error Aritmetico" + e);
        } catch (NullPointerException e) {
            System.out.println("Error Nula" + e);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        // finally para marcar el final del try

        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ErrorAritmetico " + e);
        } finally{
            System.out.println("finally");
        }
        System.out.println("fin");


        // Throw
        var throwExample = new ThrowExample();
        try {
            throwExample.checkAge(15);

        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e);
        }

        // Excepciones personalizadas

        try {
            throwExample.checkScore(450);
        } catch (CustomException e) {
            System.out.println("Error revisando la información " + e.getMessage());
        }

        System.out.println("Fin ");

    }
}

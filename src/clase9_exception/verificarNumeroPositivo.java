package clase9_exception;

public class verificarNumeroPositivo {

    public static void verificarNumeroPositivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo: " + numero);
        }
        System.out.println("El número es válido: " + numero);
    }
}

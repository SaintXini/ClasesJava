package clase9_exception;

// Excepciones personalizadas
// Estas pueden ser llamadas desde otros archivos
// Suponiendo que esta es la clase principal, la puede llamar para otras

// aca se le da la capacidad de los funcionamientos
public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }

}

package clase9_exception;

public class ThrowExample {

    public void  checkAge(int age ){
        // throw qu
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }

    // Aca es llamado las excepciones personalizadas
    public void checkScore(int score) throws CustomException {

        if (score < 0 || score > 100) {
            throw new CustomException("La puntuación tiene que estar entre 0 y 100");
        } else  {
            System.out.println("puntuación valida " + score);
        }
    }
}

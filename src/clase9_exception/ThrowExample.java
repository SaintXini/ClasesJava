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
}

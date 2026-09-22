package clase4_condicionales;

public class Conditionals {
    public static void main(String[] args) {

        // Condicionales

        // Condicion "IF"
        var age = 18;

        if (age > 18) {
            System.out.println("El usuario es mayor de edad\n");
        } else if (age == 18) {
            System.out.println("El usuario a cumplido 18 años\n");
        } else {
            System.out.println("El usuario es menor de edad\n");
        }

        // Condiciones "SWITCH"

        var day = 1;

        switch (day) {
            case 1:
                System.out.println("Lunes\n");
                break;
            case 2:
                System.out.println("Martes\n");
                break;
            case 3:
                System.out.println("Miercoles\n");
                break;
            default:
                System.out.println("No es ningun día existente");

        }


    }
}

package clase5_datos;

public class Arrays {
    public static void main(String[] args) {

        // como declarar los arrays y crearlos

        int[] num = new int[3];

        System.out.println(num);


        String[] name = {"Martín", "Brais", "Xinico"};
        System.out.println(name);

        // Acceso, de que me vale tener muchos datos si no se como acceder a ellos

        System.out.println(num[0]);
        System.out.println(name[0]);

        System.out.println((new String[3])[0]);

        // Modificar los datos de los arrrays

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);

        // Null solo se aplica a los strings pero donde aplica los numeros no aplica

    }
}

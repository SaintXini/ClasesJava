package clase6_loops_o_bucles;

public class Loops {
    public static void main(String[] args) {

        // Loops
        // nos permite para repetid ejecuciónes concretas
        // Nos suele servir para automatizar funciones


        // 1er Bucle "For", es el mas habitual
        // Controlado por un contador
        // Siempe se marca cuanto se utiliza

        for (int index = 0; index < 5; index++) {
            System.out.println("hola, Java!");
        }

        String[] names = {"Martín", "Santiago", "Lala"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}

package clase8_POO.clase;

public class Worker {

    String name;
    double salary;

    // Constructor
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Método para mostrar el salario en consola
    public void showSalary() {
        System.out.println("El salario de " + this.name + " es: $" + this.salary);
    }
}

package clase8_POO.modifacodres_acceso;

public class Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            this.salary += this.salary * (percent / 100);
        } else {
            System.out.println("El aumento debe ser un porcentaje positivo.");
        }
    }
}

package clase8_POO.modifacodres_acceso;

public class Excercise_modifciadores_acceso {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.

        Person persona = new Person();
        persona.setName("Carlos");
        persona.setAge(30);
        System.out.println("Persona: " + persona.getName() + " tiene " + persona.getAge() + " años.");

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.

        Product producto = new Product();
        producto.setPrice(19.99); // Válido
        producto.setPrice(-5.0);   // Mostrará error en consola por la validación

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.

        BankAccount cuenta = new BankAccount();
        cuenta.deposit(100.0);
        cuenta.withdraw(30.0);
        System.out.println("Saldo de la cuenta: $" + cuenta.getBalance());

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.

        Book libro = new Book("El Quijote"); // Se asigna solo en el constructor
        System.out.println("Título del libro: " + libro.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        Temperature temp = new Temperature();
        temp.setCelsius(25.5); // Válido
        temp.setCelsius(150);

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

        User usuario = new User();
        usuario.setUsername("admin");
        usuario.setPassword("secreto123");
        boolean esCorrecta = usuario.checkPassword("secreto123");
        System.out.println("¿Contraseña correcta?: " + esCorrecta);


        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        Employee empleado = new Employee();
        empleado.setSalary(2000.0);
        empleado.raiseSalary(10); // Aumento del 10%
        System.out.println("Nuevo salario: $" + empleado.getSalary());

        // 8. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        Student estudiante = new Student();
        estudiante.setGrade(75);
        System.out.println("¿Estudiante aprobado?: " + estudiante.isPassed());
    }
}

package clase08_POO.clase;

public class ClasesExercise {
    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        /* var book = new Book();
        //book.author = "Diana Jones";
        //book.title = "El Castillo Ambulante";

        book.boks(); */

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog();
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book = new Book("Diana Jones", "Castillo Ambulante");
        book.boks();

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var car = new Car("Toyota corolla", "2019");
        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).

        var student = new Student(20);
        student.aprobo();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var bank = new BankAccount(200);
        bank.deposit(25);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle = new Rectangle(5, 5);
        rectangle.calcular();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var worker = new Worker("Carlos", 4810);
        worker.showSalary();
    }
}

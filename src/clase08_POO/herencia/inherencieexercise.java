package clase08_POO.herencia;

public class inherencieexercise {

    public static void main(String[] args) {


        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().

        var vehicle = new Vehicle("Toyota");
        vehicle.move();

        var car = new Car("Ford");
        car.move();
        car.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().

        var person = new Person("Martín", 10);
        var student = new Student("Martin", 10, "4to primaria");
        student.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.

        var animal = new Animal("Mike");
        animal.makeSound();

        var dog = new Dog("Maya");
        dog.makeSound();

        var cat = new Cat("Mish");
        cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

        // REsuleto solo no lo volvi a llamar aca igual que la 5ta

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.

    }

    // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
///
///
///
    public static class Vehicle {
        // Atributo
        String vehicle;

        // Constructor
        public Vehicle(String vehicle) {
            this.vehicle = vehicle;
        }
        // Metodo
        public void move(){
            System.out.println("Me estoy moviendo");
        }
    }

    public static class Car extends Vehicle {

        public Car(String vehicle) {
            super(vehicle);
        }

        public void honk(){
            System.out.println("Estoy bocinando");
        }

        @Override
        public void move(){
            System.out.println("Estoy moviendo el vehiculo: " + vehicle);
        }
    }

    // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
//
//
//
    public static class Person {
        // Atributo
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }
    public static class Student extends Person {

        String grade;

        public Student(String name, int age, String grade) {
            super(name, age);
            this.grade = grade;
        }


        public void study(){
            System.out.println("soy el estudiante: " + name + " y tengo " + age + " años");
            System.out.println("Estoy studiendo en el grado: " + grade);
        }
    }

    // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
    //
    //

    public static class Animal{

        String name;

        public  Animal(String name){
            this.name = name;
        }

        public void makeSound(){
            System.out.println("El animal con nombre: " + name + " hace un sonido");
        }
    }


    public static class Dog extends Animal{

        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("El perro con nombre: " + name + " hace Woof");
        }
    }

    public static class Cat extends Animal{

        public Cat(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("El gato con nombre: " + name + " hace Meow");
        }
    }

    // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
    //
    //
     public static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static class Manager extends Employee {
        String department;

        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
    }

    // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
    //
    //
    public abstract class Shape {
        public abstract double calculateArea();
    }

    public class Circle extends Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public class Rectangle extends Shape {
        double width;
        double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

}


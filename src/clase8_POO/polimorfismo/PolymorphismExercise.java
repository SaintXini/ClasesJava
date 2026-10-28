package clase8_POO.polimorfismo;
import java.util.ArrayList;
import java.util.List;
public class PolymorphismExercise {

    public static void main(String[] args) {
        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.

        // Creamos la lista de Animales
        java.util.List<Animal> lista = new java.util.ArrayList<>();

        // Agregamos las subclases estáticas que creaste abajo
        lista.add(new Animal());
        lista.add(new Dog());
        lista.add(new Cat());

        // Recorremos la lista para llamarlo desde ahí
        for (Animal a : lista) {
            a.makeSound();
        }

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));        // Radio 5
        shapes.add(new Rectangle(4.0, 6.0)); // Base 4, Altura 6
        shapes.add(new Circle(2.5));

        for (Shape shape : shapes) {
            System.out.println("El área de la figura es: " + shape.calculateArea());
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.

        Printer myPrinter = new Printer();

        // Llamadas a cada método sobrecargado
        myPrinter.print("Hola Mundo");
        myPrinter.print(100);
        myPrinter.print(99.99);


        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.


        Greeter greeter = new Greeter();

        greeter.greet();
        greeter.greet("Carlos");

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.


        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        // Recorrido de la lista
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }

    public static class Animal{

        public void makeSound(){
            System.out.println("haciendo un sonido");
        }
    }

    public static class Cat extends Animal{

        @Override
        public void makeSound() {
            System.out.println("haciendo una cat");
        }
    }
    public static class Dog extends Animal{

        @Override
        public void makeSound() {
            System.out.println("haciendo una dog");
        }
    }

    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.

    public static class Shape {
        public double calculateArea() {
            return 0.0;
        }
    }

    // Subclase Círculo
    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Subclase Rectángulo
    public static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }


    // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.

    public static class Printer {
        // Sobrecarga para String
        public void print(String text) {
            System.out.println("Imprimiendo texto: " + text);
        }

        // Sobrecarga para int
        public void print(int number) {
            System.out.println("Imprimiendo entero: " + number);
        }

        // Sobrecarga para double
        public void print(double decimal) {
            System.out.println("Imprimiendo decimal: " + decimal);
        }
    }

    // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.


    public static class Greeter {
        // Saludo genérico
        public void greet() {
            System.out.println("Hello");
        }

        // Saludo personalizado
        public void greet(String name) {
            System.out.println("Hello, " + name);
        }
    }


    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.


    public static class Vehicle {
        public void start() {
            System.out.println("El vehículo está encendiendo.");
        }
    }

    // Subclases
    public static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("El carro ruge y enciende el motor.");
        }
    }

    public static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("La bicicleta está lista para pedalear.");
        }
    }

    public static class Truck extends Vehicle {
        @Override
        public void start() {
            System.out.println("El camión enciende con un motor pesado.");
        }
    }
}

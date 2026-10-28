package clase8_POO.abstraccion;

public class abstractExcercise {
    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.

        System.out.println("=== EJERCICIO 1: Figuras Geométricas ===");
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Área del círculo (radio 5): " + circle.calculateArea());
        System.out.println("Área del rectángulo (4x6): " + rectangle.calculateArea());

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.

        System.out.println("\n=== EJERCICIO 2: Instrumentos Musicales ===");
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        guitar.play();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.

        System.out.println("\n=== EJERCICIO 3: Polimorfismo con Animales ===");
        Animal[] animals = { new Dog(), new Cat(), new Dog() };
        for (Animal animal : animals) {
            animal.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().

        System.out.println("\n=== EJERCICIO 4: Dibujo de Figuras ===");
        Drawable[] figures = { new CircleDrawable(), new Square(), new Triangle() };
        for (Drawable fig : figures) {
            fig.draw();
        }

        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.

        System.out.println("\n=== EJERCICIO 5: Salarios de Empleados ===");
        Employee ftEmp = new FullTimeEmployee(3000, 500); // Salario base + bono
        Employee ptEmp = new PartTimeEmployee(80, 15);     // 80 horas a $15 la hora
        System.out.println("Salario Empleado Tiempo Completo: $" + ftEmp.calculateSalary());
        System.out.println("Salario Empleado Medio Tiempo: $" + ptEmp.calculateSalary());

        // 6. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.


        System.out.println("\n=== EJERCICIO 8: Interfaces Múltiples (Pato) ===");
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }

    // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
    //
    //

    public static abstract class Shape {
        public abstract double calculateArea();
    }

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

    // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
    //
    //

    interface Playable {
        void play();
    }

    public static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("Tocando la guitarra: ¡Rasgueo de cuerdas acústicas!");
        }
    }

    public static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Tocando el piano: Melodía clásica con teclas de marfil.");
        }
    }

    // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
    //
    //

    public static abstract class Animal {
        public abstract void makeSound();
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("El perro dice: ¡Guau guau!");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("El gato dice: ¡Miau miau!");
        }
    }

    // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
    //
    //

    interface Drawable {
        void draw();
    }

    // Renombrada a CircleDrawable para evitar conflicto con la clase Circle del Ejercicio 1
    public static class CircleDrawable implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un círculo perfecto usando un compás.");
        }
    }

    public static class Square implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un cuadrado con 4 lados exactamente iguales.");
        }
    }

    public static class Triangle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un triángulo uniendo 3 puntos en el plano.");
        }
    }
    // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
    //
    //

    public static abstract class Employee {
        public abstract double calculateSalary();
    }

    public static class FullTimeEmployee extends Employee {
        private double baseSalary;
        private double bonus;

        public FullTimeEmployee(double baseSalary, double bonus) {
            this.baseSalary = baseSalary;
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return baseSalary + bonus;
        }
    }

    public static class PartTimeEmployee extends Employee {
        private int hoursWorked;
        private double hourlyRate;

        public PartTimeEmployee(int hoursWorked, double hourlyRate) {
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }
    }


    // 6. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
    //
    //

    interface Flyable {
        void fly();
    }

    interface Swimmable {
        void swim();
    }

    public static class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("El pato despliega sus alas y emprende el vuelo.");
        }

        @Override
        public void swim() {
            System.out.println("El pato rema con sus patas palmeadas flotando en el agua.");
        }
    }

}

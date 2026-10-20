package clase8_POO.polimorfismo;

public class Polymorphism {

    public static void main(String[] args) {

        // Polimorfismo
        // Funciona que una clase se maneja de diferentes formas según el contexto
        // y existen dos tipos

        // - Polimorfismo por herencia ( sobrescritura )
        // Se redifine un metodo de la clase padre a la clase hija

        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        // Poliformismo por sobrecarga ()
        // Es la sobrecarga de los metodos
        // definir un metodo con el mismo nombre pero con parametros diferentes

        var calculador = new Calculator();
        System.out.println(calculador.sum(2.8, 2.5));
        System.out.println(calculador.sum(2, 2));
    }

    public static class Animal {

        public void sound() {
            System.out.println("Algún sonido");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Woof");
        }
    }
    // Poliformismo por sobrecarga ()
//
    //

    public static class Calculator {

        public int sum (int a, int b) {
            return a + b;
        }

        public int sum (int a, int b, int c) {
            return a + b + c;
        }

        public double sum(double a, double b) {
            return a + b;
        }

        public double sum(double a, double b, double c) {
            return a + b + c;
        }
    }
}

package clase08_POO.abstraccion;

public class abstraction {

    public static void main(String[] args) {

        // Abstracción
        // esta estrayendo algo, en si oculta la información y solo muestra lo esencial de este mismo
        // Una de las primeras diferencias es que ya no se puede instanciar la clase padre
        // Existen dos tipos

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Clase Interface o solo interface
        // Sirve solo para declarar los metodos y la implementación


    }

    // - Clase abstracta
    //
    //
    public static abstract class Animal {

        // Si agrego alguna funcion o metodo, siempre se tendra que definir en la clases hijas para que no nos de error
        // En sí seria la herencia siempre se tendrá que utilizar en sus hijas
        public abstract void sound();

      // nos permite generar metodos o funciones, que no tenga una clase normal

        public void sleep(){
          System.out.println("Animal esta dormido");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Gua");
        }

        @Override
        public void sleep(){
            System.out.println("el perro esta dormido");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Miau");
        }

        @Override
        public void sleep(){
            System.out.println("el gato esta dormido");
        }
    }

    // Clase Interface
    // Esto nos sirve solo para definirla

    public interface Flying {

        void fly();
    }

    public static class Bird extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Pio pio");
        }

        @Override
        public void fly() {
            System.out.println("el pajaro vuela");
        }
    }

    public static class Bat extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Soy batman");
        }

        @Override
        public void fly() {
            System.out.println("el murcielago esta volando");
        }
    }
}

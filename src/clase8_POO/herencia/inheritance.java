package clase8_POO.herencia;

public class inheritance {

    public static void main(String[] args) {

        // Herencia ( es un )
        // Java solo hace herencia simple, osea solo una clase por padre

        var animal = new Animal("Mish y Tarme");
        animal.eat();

        // con las clases hijas
        var dog = new Dog("Kira", 11);
        dog.eat();

        var cat = new Cat("Hamea");
        cat.eat();

        var bird = new Bird("Mike");
        bird.eat();
        bird.fly();

    }

    // Creamos otras calses

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        // metodo
        public void eat(){
            System.out.println("El animal con nombre " + name + " esta comiendo");
        }
    }

    // Extens es para heredar la clase principal
    // Si la clase principal la manejamos con constructores todas tiene que manejarse con constructores
    public static class Dog extends Animal {

       int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        // Esto se toma para percatarse qwue se esta sobreescribiendo desde la parte superior o desde la super clase o clase padre
        // Super hace referencia a la superblase siempre
        @Override
        public void eat() {
            System.out.println("El perro con nombre " + name + " esta comiendo");
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        // Realiza lo mismo de la clase principal pero tiene otros tipos de metodo
        public void fly(){
            System.out.println("Flying ...");
        }
    }

}

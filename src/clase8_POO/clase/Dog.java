package clase8_POO.clase;

public class Dog {

    // Atributos
     String nombre;
     String sonido;

    // Constructor sin parámetros
    public Dog() {
        this.nombre = "Perro";
        this.sonido = "¡Guau ¡Guau!";
    }

    // Método
    public void bark() {
        System.out.println(sonido);
    }
}

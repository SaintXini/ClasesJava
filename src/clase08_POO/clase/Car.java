package clase08_POO.clase;

public class Car {

    // Atributos
    String brand;
    String model;

    // Constructor
    public Car (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // metodo
    public void showData() {
        System.out.println("Model: " + model);
        System.out.println("Marca: " + brand);
    }
}

package clase08_POO.clase;

public class Rectangle {
    double width;
    double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Método para calcular el área (base * altura)
    public void calcular() {
        System.out.println("el resultado del area es: " + this.width * this.height);
        System.out.println("el resultado del perimetro es " + 2*(this.width * this.height));
    }
}

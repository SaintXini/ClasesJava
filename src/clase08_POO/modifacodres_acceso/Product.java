package clase08_POO.modifacodres_acceso;

public class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("El precio debe ser mayor a 0.");
        }
    }
}

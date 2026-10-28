package clase8_POO.modifacodres_acceso;

public class Temperature {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        } else {
            System.out.println("La temperatura debe estar entre -100 y 100.");
        }
    }
}

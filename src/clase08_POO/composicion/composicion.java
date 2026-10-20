package clase08_POO.composicion;

public class composicion {

    public static void main(String[] args) {

        // Composición ( Tiene un )

        var car = new Car();
        car.on();

    }

    public static class Engine{

        public void on(){
            System.out.println("motor encendido");
        }
    }

    public static class Car{
        final private Engine engine = new Engine();

        public void on(){
            engine.on();
        }
    }
}

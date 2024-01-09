// Engine class representing a car engine
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

// Car class using composition to include an Engine
class Car {
    private Engine engine; // Composition: Car has an Engine

    public Car() {
        this.engine = new Engine(); // Create an Engine when a Car is instantiated
    }

    public void startCar() {
        engine.start(); // Delegating the start functionality to the Engine
        System.out.println("Car started");
    }
}

// Main class to test composition
public class compostion {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}

package DefiningClasses.Ex.CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight = 0;
    private String color = "n/a";

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.weight == 0){
            return this.model + ":" + System.lineSeparator()
                    + this.engine.toString()
                    + "Weight: n/a" + System.lineSeparator()
                    + "Color: " + this.color + System.lineSeparator();
        } else {
            return this.model + ":" + System.lineSeparator()
                    + this.engine.toString()
                    + "Weight: " + this.weight + System.lineSeparator()
                    + "Color: " + this.color + System.lineSeparator();
        }
    }
}

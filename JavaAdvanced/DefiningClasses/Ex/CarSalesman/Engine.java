package DefiningClasses.Ex.CarSalesman;

import java.util.Scanner;

public class Engine {
    private String model;
    private int power;
    private int displacement = 0;
    private String efficiency = "n/a";

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency){
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        if (this.displacement == 0){
            return this.model + ":" + System.lineSeparator()
                    + "Power: " + this.power + System.lineSeparator()
                    + "Displacement: n/a" + System.lineSeparator()
                    + "Efficiency: " + this.efficiency + System.lineSeparator();
        } else {
            return this.model + ":" + System.lineSeparator()
                    + "Power: " + this.power + System.lineSeparator()
                    + "Displacement: " + this.displacement + System.lineSeparator()
                    + "Efficiency: " + this.efficiency + System.lineSeparator();
        }
    }
}

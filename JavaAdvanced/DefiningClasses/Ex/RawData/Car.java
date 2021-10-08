package DefiningClasses.Ex.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Car {
    private String model;
    private int engineSpeed;
    private int enginePower;
    private int cargoWeight;
    private String cargoType;
    private List<Tire> tires;

    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType) {
        this.model = model;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.tires = new ArrayList<>();
    }

    public boolean isPressureAppropriate(){
        for (Tire tire : this.tires){
            if (tire.getTirePressure() < 1){
                return true;
            }
        }
        return false;
    }

    public boolean isHorsePowerAppropriate(){
        return this.enginePower > 250;
    }

    public List<Tire> getTires() {
        return this.tires;
    }

    public String getModel() {
        return this.model;
    }
}

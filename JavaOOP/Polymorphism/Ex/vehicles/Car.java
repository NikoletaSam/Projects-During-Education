package Polymorphism.Ex.vehicles;

public class Car extends Vehicle{
    private static final double CONSUMPTION_INCREASED_BY_AC = 0.9;

    protected Car(double fuelQuantity, double fuelConsumption, double tankCapacity) throws IllegalAccessException {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption){
        super.setFuelConsumption(fuelConsumption + CONSUMPTION_INCREASED_BY_AC);
    }
}

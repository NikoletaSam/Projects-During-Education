package Polymorphism.Ex.vehicles;

public class Truck extends Vehicle{
    private static final double CONSUMPTION_INCREASED_BY_AC = 1.6;

    protected Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) throws IllegalAccessException {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption){
        super.setFuelConsumption(fuelConsumption + CONSUMPTION_INCREASED_BY_AC);
    }

    @Override
    public void refuel(double liters) throws IllegalAccessException {
        super.refuel(0.95 * liters);
    }
}

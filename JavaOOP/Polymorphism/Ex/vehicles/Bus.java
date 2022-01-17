package Polymorphism.Ex.vehicles;

public class Bus extends Vehicle{
    private static final double CONSUMPTION_INCREASED_BY_AC = 1.4;

    private boolean isEmpty;

    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) throws IllegalAccessException {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.isEmpty = true;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption){
        if (this.isEmpty){
            super.setFuelConsumption(fuelConsumption);
        }
        super.setFuelConsumption(fuelConsumption + CONSUMPTION_INCREASED_BY_AC);
    }
}

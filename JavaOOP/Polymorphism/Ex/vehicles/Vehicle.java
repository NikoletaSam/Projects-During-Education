package Polymorphism.Ex.vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) throws IllegalAccessException {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
        setTankCapacity(tankCapacity);
    }

    protected void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) throws IllegalAccessException {
        if (fuelQuantity < 0){
            throw new IllegalAccessException("Fuel must be a positive number");
        }
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double distance) throws IllegalAccessException {
        double fuelNeeded = this.getFuelConsumption() * distance;
        if (fuelNeeded > this.getFuelQuantity()){
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
        this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));
    }

    public void refuel(double liters) throws IllegalAccessException {
        if (liters <= 0){
            throw new IllegalAccessException("Fuel must be a positive number");
        }
        if (liters + this.fuelQuantity > this.tankCapacity){
            throw new IllegalAccessException("Cannot fit fuel in tank");
        }
        setFuelQuantity(this.getFuelQuantity() + liters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}

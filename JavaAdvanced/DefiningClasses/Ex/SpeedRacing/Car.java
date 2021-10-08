package DefiningClasses.Ex.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelPerKilometer;
    private double distanceTravelled = 0;

    public Car(String model, double fuelAmount, double fuelPerKilometer) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelPerKilometer = fuelPerKilometer;
    }

    public void drive(int kilometers){
        if ((kilometers * this.fuelPerKilometer) <= this.fuelAmount){
            this.fuelAmount -= kilometers * this.fuelPerKilometer;
            this.distanceTravelled += kilometers;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }
}

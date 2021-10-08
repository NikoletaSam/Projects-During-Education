package DefiningClasses.Lab.CarInfo;

public class Car {
    public String brand;
    public String model;
    public int horsePower;

    @Override
    public String toString() {
        return "The car is: " + this.brand + " " + this.model + " - " + this.horsePower + " HP.";
    }
}

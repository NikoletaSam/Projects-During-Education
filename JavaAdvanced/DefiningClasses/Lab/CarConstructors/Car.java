package DefiningClasses.Lab.CarConstructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public Car(String brand, String model, int horsePower) {
        this(brand);
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public String toString(){
        return "The car is: " + this.brand + " " + this.model + " - " + this.horsePower + " HP.";
    }
}

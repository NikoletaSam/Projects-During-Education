package DefiningClasses.Ex.CatLady;

import java.text.DecimalFormat;

public class Cat {
    private String breed;
    private String name;
    private double specialInformation;

    public Cat(String breed, String name, double specialInformation) {
        this.breed = breed;
        this.name = name;
        this.specialInformation = specialInformation;
    }

    @Override
    public String toString() {
        return this.breed + " " + this.name + " " + new DecimalFormat("0.00").format(this.specialInformation);
    }
}

package Polymorphism.Ex.wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    //"{AnimalType} [{AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return getAnimalType() + "[" + getAnimalName() + ", " + df.format(getAnimalWeight()) + ", " + this.livingRegion + ", " + getFoodEaten() + "]";
    }
}

package Polymorphism.Ex.wildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    //"{AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]"
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return getAnimalType() + "[" + getAnimalName() + ", " + this.breed + ", " + df.format(getAnimalWeight()) + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}

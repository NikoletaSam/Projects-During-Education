package Polymorphism.Ex.wildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Mammal> animals = new ArrayList<>();

        String animalInput = scanner.nextLine();
        while (!animalInput.equals("End")){
            String[] animalInfo = animalInput.split("\\s+");
            Mammal animal = createMammal(animalInfo);

            String[] foodInfo = scanner.nextLine().split("\\s+");
            Food food = createFood(foodInfo);

            animal.makeSound();
            try {
                animal.eat(food);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            animals.add(animal);

            animalInput = scanner.nextLine();
        }

        animals.forEach(System.out::println);
    }

    public static Food createFood(String[] info){
        String foodType = info[0];
        Integer foodQuantity = Integer.parseInt(info[1]);

        if (foodType.equals("Meat")){
            return new Meat(foodQuantity);
        } else {
            return new Vegetable(foodQuantity);
        }
    }

    public static Mammal createMammal(String[] info){
        String animalType = info[0];
        String animalName = info[1];
        Double animalWeight = Double.parseDouble(info[2]);
        String animalLivingRegion = info[3];

        if (info.length == 4){
            switch (animalType){
                case "Mouse":
                    return new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                case "Zebra":
                    return new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                case "Tiger":
                    return new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
            }
        } else {
            String catBreed = info[4];
            return new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
        }

        return null;
    }
}

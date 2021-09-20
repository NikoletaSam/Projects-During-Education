package FinalExamPreparation4;

import java.util.*;

public class NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> cars = new TreeMap<>();
        int numOfCars = Integer.parseInt(scanner.nextLine());

        //Saving the basic information about every car
        for (int i = 0; i < numOfCars; i++) {
            String input = scanner.nextLine();
            String[] array = input.split("\\|");

            String car = array[0];
            int mileage = Integer.parseInt(array[1]);
            int fuel = Integer.parseInt(array[2]);

            cars.putIfAbsent(car, new ArrayList<>());
            cars.get(car).add(mileage);
            cars.get(car).add(fuel);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            String[] array = input.split(" : ");
            String command = array[0];
            String car = array[1];
            switch (command){
                case "Drive":
                    int distance = Integer.parseInt(array[2]);
                    int fuel = Integer.parseInt(array[3]);

                    int currentFuel = cars.get(car).get(1);
                    int newFuel = currentFuel - fuel;
                    if (newFuel < 0){
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int currentMiles = cars.get(car).get(0);
                        int newDistance = currentMiles + distance;
                        cars.get(car).set(0, newDistance);
                        cars.get(car).set(1, newFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                        if (newDistance >= 100000){
                            System.out.printf("Time to sell the %s!%n", car);
                            cars.remove(car);
                        }
                    }
                    break;
                case "Refuel":
                    int fuelToFill = Integer.parseInt(array[2]);
                    int oldFuel = cars.get(car).get(1);
                    int newFuelInTheCar = fuelToFill + oldFuel;
                    if (newFuelInTheCar > 75){
                        newFuelInTheCar = 75;
                        fuelToFill = 75 - oldFuel;
                    }
                    cars.get(car).set(1, newFuelInTheCar);
                    System.out.printf("%s refueled with %d liters%n", car, fuelToFill);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(array[2]);
                    int currentKM = cars.get(car).get(0);
                    int newKM = currentKM - kilometers;
                    if (newKM < 10000){
                        newKM = 10000;
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    }
                    cars.get(car).set(0, newKM);
                    break;
            }

            input = scanner.nextLine();
        }


        cars
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().get(0), a.getValue().get(0)))
                .forEach((entry) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}

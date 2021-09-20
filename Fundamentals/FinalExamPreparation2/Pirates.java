package FinalExamPreparation2;

import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> destinationInformation = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")){
            String[] array = input.split("\\|\\|");
            String city = array[0];
            int population = Integer.parseInt(array[1]);
            int goldQuantity = Integer.parseInt(array[2]);
            if (destinationInformation.containsKey(city)){
                int currentPopulation = destinationInformation.get(city).get(0);
                int currentGoldQuantity = destinationInformation.get(city).get(1);
                population += currentPopulation;
                goldQuantity += currentGoldQuantity;
                destinationInformation.get(city).set(0, population);
                destinationInformation.get(city).set(1, goldQuantity);
            } else {
                destinationInformation.put(city, new ArrayList<>());
                destinationInformation.get(city).add(population);
                destinationInformation.get(city).add(goldQuantity);
            }

            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("End")){
            String[] array = secondInput.split("=\\>");
            String command = array[0];
            switch (command){
                case "Plunder":
                    String city = array[1];
                    int people = Integer.parseInt(array[2]);
                    int gold = Integer.parseInt(array[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, people);
                    int currentPeople = destinationInformation.get(city).get(0);
                    int currentGold = destinationInformation.get(city).get(1);
                    people = currentPeople - people;
                    gold = currentGold - gold;
                    if (people <= 0 || gold <= 0){
                        System.out.printf("%s has been wiped off the map!%n", city);
                        destinationInformation.remove(city);
                    } else {
                        destinationInformation.get(city).set(0, people);
                        destinationInformation.get(city).set(1, gold);
                    }
                    break;
                case "Prosper":
                    String town = array[1];
                    int moreGold = Integer.parseInt(array[2]);
                    if (moreGold <= 0){
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int goldBefore = destinationInformation.get(town).get(1);
                        int totalGold = moreGold + goldBefore;
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", moreGold, town, totalGold);
                        destinationInformation.get(town).set(1, totalGold);
                    }
                    break;
            }

            secondInput = scanner.nextLine();
        }

        if (destinationInformation.size() > 0){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", destinationInformation.size());
            destinationInformation
                    .entrySet()
                    .stream()
                    .sorted((a, b) -> Integer.compare(b.getValue().get(1), a.getValue().get(1)))
                    .forEach((entry) -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}

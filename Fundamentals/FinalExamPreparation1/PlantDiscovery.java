package FinalExamPreparation1;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPlants = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> plants = new LinkedHashMap<>();

        for (int i = 0; i < numOfPlants; i++) {
            String input = scanner.nextLine();
            String[] array = input.split("<->");
            String plant = array[0];
            double rarity = Double.parseDouble(array[1]);

            if (!plants.containsKey(plant)){
                plants.put(plant, new ArrayList<>());
                plants.get(plant).add(rarity);
            } else {
                plants.get(plant).set(0, rarity);
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")){
            String[] array = input.split(": ");
            String[] secondArray = array[1].split(" - ");
            String plant = secondArray[0];

            String command = array[0];
            switch (command){
                case "Rate":
                    double rating = Double.parseDouble(secondArray[1]);
                    if (plants.containsKey(plant)){
                        plants.get(plant).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    double newRarity = Double.parseDouble(secondArray[1]);
                    if (plants.containsKey(plant)){
                        plants.get(plant).set(0, newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    if (plants.containsKey(plant)){
                        if (plants.get(plant).size() > 1){
                            while (plants.get(plant).size() > 1){
                                plants.get(plant).remove(1);
                            }
                        }
                    } else {
                        System.out.println("error");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : plants.entrySet()){
            double totalRating = 0;
            int counter = 0;
            if (entry.getValue().size() == 1){
                plants.get(entry.getKey()).add(0.000001);
            } else {
                while (entry.getValue().size() > 1){
                    double currentRating = entry.getValue().get(1);
                    totalRating += currentRating;
                    counter++;
                    plants.get(entry.getKey()).remove(1);
                }
                double newRating = totalRating / counter;
                plants.get(entry.getKey()).add(newRating);
            }
        }

        System.out.println("Plants for the exhibition:");

        plants
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = Double.compare(b.getValue().get(0), a.getValue().get(0));
                    if (result == 0){
                        result = Double.compare(b.getValue().get(1), a.getValue().get(1));
                    }
                    return result;
                })
                .forEach((entry) ->
                    System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}

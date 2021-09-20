package FinalExam;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> animals = new TreeMap<>();
        Map<String, Integer> areas = new TreeMap<>();
        Map<String, String> areaInfo = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("EndDay")){
            String[] array = input.split(": ");
            String command = array[0];
            String[] secondArray = array[1].split("\\-");
            String animal = secondArray[0];

            switch (command){
                case "Add":
                    int food = Integer.parseInt(secondArray[1]);
                    String area = secondArray[2];

                    if (!animals.containsKey(animal)){
                        animals.put(animal, food);
                        areaInfo.put(animal, area);
                        if (!areas.containsKey(area)){
                            areas.put(area, 1);
                        } else {
                            int current = areas.get(area);
                            current++;
                            areas.put(area, current);
                        }
                    } else {
                        int currentFood = animals.get(animal);
                        int newFood = currentFood + food;
                        animals.put(animal, newFood);
                    }

                    break;
                case "Feed":
                    if (animals.containsKey(animal)){
                        int foodToReduce = Integer.parseInt(secondArray[1]);
                        int current = animals.get(animal);
                        int amountFoodLeft = current - foodToReduce;
                        if (amountFoodLeft <= 0){
                            String currentArea = areaInfo.get(animal);
                            int currentAnimalsInArea = areas.get(currentArea);
                            currentAnimalsInArea--;
                            areas.put(currentArea, currentAnimalsInArea);

                            animals.remove(animal);
                            System.out.printf("%s was successfully fed%n", animal);
                        } else {
                            animals.put(animal, amountFoodLeft);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Animals:");
        animals
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach((entry) -> System.out.printf(" %s -> %dg%n", entry.getKey(), entry.getValue()));


        System.out.println("Areas with hungry animals:");
        areas
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach((entry) -> {
                    if (entry.getValue() > 0)
                    System.out.printf(" %s: %d%n", entry.getKey(), entry.getValue());
                });
    }
}

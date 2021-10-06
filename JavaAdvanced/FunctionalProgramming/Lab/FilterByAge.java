package FunctionalProgramming.Lab;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> peopleInformation = new LinkedHashMap<>();

        for (int i = 0; i < numOfInputs; i++) {
            String[] input = scanner.nextLine().split(",\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            peopleInformation.put(name, age);
        }

        String condition = scanner.nextLine();
        int conditionAge = Integer.parseInt(scanner.nextLine());
        String toPrint = scanner.nextLine();

        if (condition.equals("older")){
            peopleInformation = peopleInformation
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() >= conditionAge)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
        } else {
            peopleInformation = peopleInformation
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() <= conditionAge)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
        }

        switch (toPrint){
            case "name":
                peopleInformation.forEach((key, value) -> System.out.println(key));
                break;
            case "age":
                peopleInformation.forEach((key, value) -> System.out.println(value));
                break;
            case "name age":
                peopleInformation
                        .forEach((key, value) -> System.out.println(key + " - " + value));
                break;
        }
    }
}

package SetsAndMaps.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class CitiesByContinentsAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> continentsDictionary = new LinkedHashMap<>();

        int numOfInputs = Integer.parseInt(scanner.nextLine());
        for (int counter = 0; counter < numOfInputs; counter++) {
            String input = scanner.nextLine();
            String continent = input.split("\\s+")[0];
            String country = input.split("\\s+")[1];
            String city = input.split("\\s+")[2];

            continentsDictionary.putIfAbsent(continent, new LinkedHashMap<>());
            continentsDictionary.get(continent).putIfAbsent(country, new ArrayList<>());
            continentsDictionary.get(continent).get(country).add(city);
        }

        for (Map.Entry<String, Map<String, List<String>>> entry : continentsDictionary.entrySet()){
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, List<String>> countries : entry.getValue().entrySet()){
                System.out.println("  " + countries.getKey() + " -> " + String.join(", ", countries.getValue()));
            }
        }
    }
}

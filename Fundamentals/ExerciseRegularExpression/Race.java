package ExerciseRegularExpression;

import java.util.*;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> racers = Arrays.stream(input.split(", ")).collect(Collectors.toList());
        Map<String, Integer> racersInfo = new LinkedHashMap<>();
        for (String racer : racers){
            racersInfo.put(racer, 0);
        }

        String text = scanner.nextLine();
        while (!text.equals("end of race")){
            char[] symbols = text.toCharArray();

            String name = "";
            int distance = 0;
            for (char symbol : symbols){
                if (Character.isAlphabetic(symbol)){
                    name += symbol;
                }
                if (Character.isDigit(symbol)){
                    distance += Integer.parseInt(String.valueOf(symbol));
                }
            }
            if (racersInfo.containsKey(name)){
                distance += racersInfo.get(name);
                racersInfo.put(name, distance);
            }

            text = scanner.nextLine();
        }

        List<String> topRacers = racersInfo.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("1st place: " + topRacers.get(0));
        System.out.println("2nd place: " + topRacers.get(1));
        System.out.println("3rd place: " + topRacers.get(2));
    }
}

package SetsAndMaps.Exercise;

import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, Integer>> information = new TreeMap<>();

        for (int counter = 0; counter < numOfInputs; counter++) {
            String input = scanner.nextLine();
            String IP = input.split("\\s+")[0];
            String name = input.split("\\s+")[1];
            int duration = Integer.parseInt(input.split("\\s+")[2]);

            information.putIfAbsent(name, new TreeMap<>());
            information.get(name).putIfAbsent(IP, 0);
            int currentDuration = information.get(name).get(IP);
            information.get(name).put(IP, duration + currentDuration);
        }

        for (Map.Entry<String, Map<String, Integer>> entry : information.entrySet()){
            System.out.print(entry.getKey() + ": ");
            int totalTime = 0;
            for (Map.Entry<String, Integer> secondEntry : entry.getValue().entrySet()){
                totalTime += secondEntry.getValue();
            }
            System.out.println(totalTime + " [" + String.join(", ", entry.getValue().keySet()) + "]");
        }
    }
}

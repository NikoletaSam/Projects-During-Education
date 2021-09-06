package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> usersAndPasswords = new LinkedHashMap<>();
        while (!input.equals("end of contests")){
            String[] array = input.split("\\:");
            String username = array[0];
            String password = array[1];
            usersAndPasswords.put(username, password);

            input = scanner.nextLine();
        }

        Map<String, Map<String, Integer>> users = new TreeMap<>();

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("end of submissions")){
            String[] array = secondInput.split("=>");
            String contest = array[0];
            String password = array[1];
            String username = array[2];
            int points = Integer.parseInt(array[3]);

            boolean isUserValid = isUserValid(contest, password, usersAndPasswords);
            if (isUserValid){
                if (!users.containsKey(username)){
                    users.put(username, new LinkedHashMap<String, Integer>());
                    users.get(username).put(contest, points);
                } else {
                    if (users.get(username).containsKey(contest)){
                        int currentPoints = users.get(username).get(contest);
                        if (points > currentPoints){
                            users.get(username).put(contest, points);
                        }
                    } else {
                        users.get(username).put(contest, points);
                    }
                }
            }

            secondInput = scanner.nextLine();
        }

        int biggestPoints = 0;
        String bestUser = "";
        for (Map.Entry<String, Map<String, Integer>> name : users.entrySet()){
            int totalCurrentPoints = 0;
            for (Map.Entry<String, Integer> contest : users.get(name.getKey()).entrySet()){
                int currentPoints = contest.getValue();
                totalCurrentPoints += currentPoints;
            }
            if (totalCurrentPoints > biggestPoints){
                biggestPoints = totalCurrentPoints;
                bestUser = name.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestUser, biggestPoints);
        System.out.println("Ranking:");

        users
                .forEach((key, value) -> {
                    System.out.println(key);
                    value
                            .entrySet()
                            .stream()
                            .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                            .forEach(information -> System.out.printf("#  %s -> %d%n", information.getKey(), information.getValue()));
                });
    }

    private static boolean isUserValid(String username, String password, Map<String, String> usersAndPasswords) {
        if (usersAndPasswords.containsKey(username)){
            return usersAndPasswords.get(username).equals(password);
        } else {
            return false;
        }
    }
}

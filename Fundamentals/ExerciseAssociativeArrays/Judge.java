package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, TreeMap<String, Integer>> contestInformation = new LinkedHashMap<>();
        Map<String, Integer> users = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("no more time")){
            String[] array = input.split(" -> ");
            String username = array[0];
            String contest = array[1];
            int points = Integer.parseInt(array[2]);

            if (!users.containsKey(username)){
                users.put(username, points);
            } else {
                if (contestInformation.containsKey(contest) && contestInformation.get(contest).containsKey(username)){
                    int currentPoints = contestInformation.get(contest).get(username);
                    int totalCurrentPointsPerUser = users.get(username);
                    if (points > currentPoints){
                        totalCurrentPointsPerUser -= currentPoints;
                        totalCurrentPointsPerUser += points;
                        users.put(username, totalCurrentPointsPerUser);
                    }
                } else {
                    int current = users.get(username);
                    current += points;
                    users.put(username, current);
                }
            }


            if (!contestInformation.containsKey(contest)){
                contestInformation.put(contest, new TreeMap<String, Integer>());
                contestInformation.get(contest).put(username, points);
            } else {
                if (!contestInformation.get(contest).containsKey(username)){
                    contestInformation.get(contest).put(username, points);
                } else {
                    int currentPoints = contestInformation.get(contest).get(username);
                    if (points > currentPoints){
                        contestInformation.get(contest).put(username, points);
                    }
                }
            }


            input = scanner.nextLine();
        }

        contestInformation
                .forEach((key, value) -> {
                    System.out.printf("%s: %d participants%n", key, value.size());
                    int counter = value.size();
                    value
                            .entrySet()
                            .stream()
                            .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                            .forEach((element) -> {
                                System.out.printf("%d. %s <::> %d%n", counter - (value.size() - 1), element.getKey(), element.getValue());
                                value.remove(element.getKey());
                            });
                });

        System.out.println("Individual standings:");


        int counter = users.size();
        users.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach((user) -> {
                    System.out.printf("%d. %s -> %d%n", counter - (users.size() - 1), user.getKey(), user.getValue());
                    users.remove(user.getKey());
                });

    }
}

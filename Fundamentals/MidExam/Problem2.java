package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> people = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        int blackListedCount = 0;
        int losCount = 0;

        while (!input.equals("Report")){
            String[] array = input.split("\\s+");
            String command = array[0];

            switch (command){
                case "Blacklist":
                    String name = array[1];
                    if (people.contains(name)){
                        String lastName = "";
                        for (int i = 0; i < people.size(); i++) {
                            String current = people.get(i);
                            if (current.equals(name)){
                                lastName = current;
                                people.set(i, "Blacklisted");
                                blackListedCount++;
                                break;
                            }
                        }
                        System.out.printf("%s was blacklisted.%n", lastName);
                    } else {
                        System.out.printf("%s was not found.%n", name);
                    }

                    break;
                case "Error":
                    int index = Integer.parseInt(array[1]);
                    if (index >= 0 && index < people.size()){
                        String previousName = "";
                        for (int i = 0; i < people.size(); i++) {
                            if (i == index){
                                String current = people.get(i);
                                if (!current.equals("Blacklisted") && !current.equals("Lost")){
                                    previousName = current;
                                    people.set(i, "Lost");
                                    losCount++;
                                    System.out.printf("%s was lost due to an error.%n", previousName);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case "Change":
                    int currentIndex = Integer.parseInt(array[1]);
                    if (currentIndex >= 0 && currentIndex < people.size()){
                        String last = people.get(currentIndex);
                        String newName = array[2];
                        System.out.printf("%s changed his username to %s.%n", last, newName);
                        people.set(currentIndex, newName);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n", blackListedCount);
        System.out.printf("Lost names: %d%n", losCount);
        for (String person : people){
            System.out.print(person + " ");
        }
    }
}

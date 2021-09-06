package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingInformation = new LinkedHashMap<>();

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            String input = scanner.nextLine();
            String[] array = input.split("\\s+");
            String command = array[0];
            String username = array[1];
            switch (command){
                case "register":
                    String licensePlateNumber = array[2];
                    if (parkingInformation.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    } else {
                        parkingInformation.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    }
                    break;
                case "unregister":
                    if (!parkingInformation.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n", username);
                    } else {
                        parkingInformation.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }

        parkingInformation.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}

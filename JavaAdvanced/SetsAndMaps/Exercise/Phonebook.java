package SetsAndMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("search")){
            String name = input.split("-")[0];
            String phoneNumber = input.split("-")[1];
            phonebook.put(name, phoneNumber);

            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("stop")){
            if (phonebook.containsKey(secondInput)){
                String number = phonebook.get(secondInput);
                System.out.println(secondInput + " -> " + number);
            } else {
                System.out.println("Contact " + secondInput + " does not exist.");
            }

            secondInput = scanner.nextLine();
        }
    }
}

package SetsAndMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emails = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")){
            String email = scanner.nextLine();
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")){
                emails.put(input, email);
            }

            input = scanner.nextLine();
        }

        emails.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}

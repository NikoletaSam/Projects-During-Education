package ExerciseTextProcessing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfInputs; i++) {
            String input = scanner.nextLine();

            String name = "";
            int age = 0;

            name = input.substring(input.indexOf("@") + 1, input.indexOf("|"));
            age = Integer.parseInt(input.substring(input.indexOf("#") + 1, input.indexOf("*")));

            System.out.printf("%s is %d years old.%n", name, age);
        }
    }
}

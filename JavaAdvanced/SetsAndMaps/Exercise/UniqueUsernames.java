package SetsAndMaps.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> usernames = new LinkedHashSet<>();
        int numOfInputs = Integer.parseInt(scanner.nextLine());

        for (int counter = 0; counter < numOfInputs; counter++) {
            usernames.add(scanner.nextLine());
        }

        for (String element : usernames){
            System.out.println(element);
        }
    }
}

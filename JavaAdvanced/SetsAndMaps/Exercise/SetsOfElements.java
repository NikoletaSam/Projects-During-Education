package SetsAndMaps.Exercise;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int firstLength = Integer.parseInt(input.split("\\s+")[0]);
        int secondLength = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> first = new LinkedHashSet<>();
        Set<Integer> second = new LinkedHashSet<>();

        for (int i = 0; i < firstLength; i++) {
            first.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < secondLength; i++) {
            second.add(Integer.parseInt(scanner.nextLine()));
        }

        first.retainAll(second);
        for (int num : first){
            System.out.print(num + " ");
        }
    }
}

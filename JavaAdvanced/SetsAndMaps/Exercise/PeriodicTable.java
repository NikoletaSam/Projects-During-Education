package SetsAndMaps.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();

        for (int counter = 0; counter < numOfInputs; counter++) {
            String[] arr = scanner.nextLine().split("\\s+");
            elements.addAll(Arrays.asList(arr));
        }

        for (String chemicalElement : elements){
            System.out.print(chemicalElement + " ");
        }
    }
}

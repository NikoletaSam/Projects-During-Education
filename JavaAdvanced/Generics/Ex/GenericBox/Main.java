package Generics.Ex.GenericBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Box> boxes = new ArrayList<>();

        int numOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfInputs; i++) {
            String input = scanner.nextLine();
            Integer currentInt = Integer.parseInt(input);
            Box<Integer> box = new Box<>(currentInt);
            boxes.add(box);
        }

        boxes.forEach(System.out::print);
    }
}

package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numNumbersToPush = scanner.nextInt();
        int numNumbersToPop = scanner.nextInt();
        int numToCheck = scanner.nextInt();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < numNumbersToPush; i++) {
            numbers.push(scanner.nextInt());
        }

        for (int i = 0; i < numNumbersToPop; i++) {
            numbers.pop();
        }

        if (numbers.contains(numToCheck)){
            System.out.println("true");
        } else if (!numbers.isEmpty()){
            System.out.println(Collections.min(numbers));
        } else {
            System.out.println("0");
        }
    }
}

package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (String element : arr){
            int current = Integer.parseInt(element);
            numbers.push(current);
        }

        for (int currentNum : numbers){
            System.out.print(currentNum + " ");
        }
    }
}

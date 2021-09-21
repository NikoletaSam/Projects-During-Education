package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        //implementation of the commands
        for (int i = 0; i < numOfCommands; i++) {
            String[] arr = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(arr[0]);
            switch (command){
                case 1:
                    int numToPush = Integer.parseInt(arr[1]);
                    numbers.push(numToPush);
                    break;
                case 2:
                    numbers.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(numbers));
                    break;
            }
        }
    }
}

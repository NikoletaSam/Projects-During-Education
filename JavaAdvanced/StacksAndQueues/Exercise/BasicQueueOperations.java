package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfElementsToAdd = scanner.nextInt();
        int numOfElementsToRemove = scanner.nextInt();
        int elementToCheckIfAbsent = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numOfElementsToAdd; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 0; i < numOfElementsToRemove; i++) {
            queue.poll();
        }

        if (queue.isEmpty()){
            System.out.println("0");
        } else if (queue.contains(elementToCheckIfAbsent)){
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }
    }
}

package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> childrenInGame = new ArrayDeque<>();
        String[] names = scanner.nextLine().split("\\s+");
        Collections.addAll(childrenInGame, names);
        int numOfRemoval = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        while (childrenInGame.size() > 1){
            counter++;
            if (counter == numOfRemoval){
                System.out.println("Removed " + childrenInGame.poll());
                counter = 0;
            } else {
                String last = childrenInGame.poll();
                childrenInGame.offer(last);
            }
        }

        System.out.println("Last is " + childrenInGame.peek());
    }
}

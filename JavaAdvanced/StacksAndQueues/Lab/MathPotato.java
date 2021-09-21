package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> childrenInGame = new ArrayDeque<>();
        String[] names = scanner.nextLine().split("\\s+");
        Collections.addAll(childrenInGame, names);
        int numOfRemoval = Integer.parseInt(scanner.nextLine());

        int counterToRemove = 0;
        int counterCycle = 0;
        boolean isComposite = true;
        while (childrenInGame.size() > 1){
            counterToRemove++;
            if (counterToRemove == numOfRemoval){
                counterCycle++;
                isComposite = isComposite(counterCycle);
                if (isComposite){
                    System.out.println("Removed " + childrenInGame.poll());
                } else {
                    System.out.println("Prime " + childrenInGame.peek());
                }
                counterToRemove = 0;
            } else {
                String last = childrenInGame.poll();
                childrenInGame.offer(last);
            }
        }

        System.out.println("Last is " + childrenInGame.peek());
    }

    private static boolean isComposite(int number){
        boolean flag = false;
        for (int i = 2; i < number; i++) {
            if (i != number && (number % i == 0)){
                flag = true;
                break;
            }
        }
        if (number == 1){
            flag = true;
        }
        return flag;
    }
}

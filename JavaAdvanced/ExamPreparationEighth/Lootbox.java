package ExamPreparationEighth;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lootbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initializing the first box: first in, first out
        ArrayDeque<Integer> firstBox = new ArrayDeque<>();
        String[] firstInput = scanner.nextLine().split("\\s+");
        for (String current : firstInput){
            firstBox.offer(Integer.parseInt(current));
        }

        //initializing the second box: first in, last out
        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        String[] secondInput = scanner.nextLine().split("\\s+");
        for (String current : secondInput){
            secondBox.push(Integer.parseInt(current));
        }

        //keep the even sum of the elements
        int collectedElements = 0;

        //while both boxes have element -> sum the current elements
        while (firstBox.size() > 0 && secondBox.size() > 0){
            int firstNum = firstBox.peek();
            int secondNum = secondBox.pop();

            if ((firstNum + secondNum) % 2 == 0){
                collectedElements += firstNum + secondNum;//if the sum is even -> add it to the collected elements
                firstBox.poll();
            } else {
                firstBox.addLast(secondNum);//if the sum is odd -> add the current num from second box as last element in first box
            }
        }

        if (firstBox.isEmpty()){
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        if (collectedElements >= 100){
            System.out.println("Your loot was epic! Value: " + collectedElements);
        } else {
            System.out.println("Your loot was poor... Value: " + collectedElements);
        }
    }
}

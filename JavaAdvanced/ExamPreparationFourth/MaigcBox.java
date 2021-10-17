package ExamPreparationFourth;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaigcBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> firstBox = new ArrayDeque<>();
        for (String current : firstInput){
            firstBox.offer(Integer.parseInt(current));
        }

        String[] secondInput = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        for (String current : secondInput){
            secondBox.push(Integer.parseInt(current));
        }

        int sum = 0;

        while (firstBox.size() > 0 && secondBox.size() > 0){
            int firstNum = firstBox.peek();
            int secondNum = secondBox.pop();

            if ((firstNum + secondNum) % 2 == 0){
                sum += (firstNum + secondNum);
                firstBox.poll();
            } else {
                firstBox.addLast(secondNum);
            }
        }

        if (firstBox.isEmpty()){
            System.out.println("First magic box is empty.");
        } else {
            System.out.println("Second magic box is empty.");
        }

        if (sum >= 90){
            System.out.println("Wow, your prey was epic! Value: " + sum);
        } else {
            System.out.println("Poor prey... Value: " + sum);
        }
    }
}

package ExamPreparationSixth;

import java.util.ArrayDeque;
import java.util.Scanner;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(",\\s+");
        ArrayDeque<Integer> lilies = new ArrayDeque<>();
        for (String current : firstInput){
            lilies.push(Integer.parseInt(current));
        }

        String[] secondInput = scanner.nextLine().split(",\\s+");
        ArrayDeque<Integer> roses = new ArrayDeque<>();
        for (String current : secondInput){
            roses.offer(Integer.parseInt(current));
        }

        int wreaths = 0;
        int leftSum = 0;

        while (roses.size() > 0 && lilies.size() > 0){
            int sum = roses.poll() + lilies.pop();
            if (sum == 15){
                wreaths++;
            } else if (sum < 15){
                leftSum += sum;
            } else {
                while (sum > 15){
                    sum -= 2;
                }
                if (sum == 15){
                    wreaths++;
                } else {
                    leftSum += sum;
                }
            }
        }
        while (leftSum >= 15){
            leftSum -= 15;
            wreaths++;
        }

        if (wreaths >= 5){
            System.out.println("You made it, you are going to the competition with " + wreaths + " wreaths!");
        } else {
            int amountNeeded = 5 - wreaths;
            System.out.println("You didn't make it, you need " + amountNeeded + " wreaths more!");
        }
    }
}

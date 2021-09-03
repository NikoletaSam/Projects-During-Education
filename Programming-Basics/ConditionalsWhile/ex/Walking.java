package ConditionalsWhile.ex;
import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int totalSteps = 0;

        while (totalSteps < goal){
            String input = scanner.nextLine();
            if (input.equals("Going home")){
                int currentSteps = Integer.parseInt(scanner.nextLine());
                totalSteps += currentSteps;
                break;
            }

            int steps = Integer.parseInt(input);
            totalSteps += steps;
        }

        if (totalSteps >= goal){
            int stepsMore = totalSteps - goal;
            System.out.println("Goal reached! Good job!");
            System.out.println(stepsMore + " steps over the goal!");
        } else {
            int lazy = goal - totalSteps;
            System.out.println(lazy + " more steps to reach goal.");
        }
    }
}

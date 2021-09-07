package ExerciseMethods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum = SummingFirstAndSecondNumber(firstNum, secondNum);
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int result = SubtractingThirdNumberFromTheSum(sum, thirdNum);
        System.out.println(result);
    }

    private static int SubtractingThirdNumberFromTheSum(int sum, int thirdNum) {
        return sum - thirdNum;
    }

    private static int SummingFirstAndSecondNumber(int firstNum, int secondNum) {
        return  firstNum + secondNum;
    }
}

package ExerciseMethods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double thirdNumber = Double.parseDouble(scanner.nextLine());
        double minNumber = FindingMinimalNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(new DecimalFormat("0.###").format(FindingMinimalNumber(firstNumber, secondNumber, thirdNumber)));
    }

    private static double FindingMinimalNumber(double firstNumber, double secondNumber, double thirdNumber) {
        double minNumber = Double.MAX_VALUE;
        if (firstNumber < minNumber){
            minNumber = firstNumber;
        }
        if (secondNumber < minNumber){
            minNumber = secondNumber;
        }
        if (thirdNumber < minNumber){
            minNumber = thirdNumber;
        }
        return minNumber;
    }
}

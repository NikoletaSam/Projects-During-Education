package LectureMethods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double result = MakingOperation(firstNumber, operator, secondNumber);
        System.out.println(new DecimalFormat("0.##").format(MakingOperation(firstNumber, operator, secondNumber)));
    }

    private static double MakingOperation(double firstNumber, char operator, double secondNumber) {
        double result = 0;
        switch (operator){
            case '/':
                result = firstNumber / secondNumber; break;
            case '*':
                result = firstNumber * secondNumber; break;
            case '+':
                result = firstNumber + secondNumber; break;
            case '-':
                result = firstNumber - secondNumber;
        }
        return result;
    }
}

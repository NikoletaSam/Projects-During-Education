package ExerciseMethods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double firstFactorial = GetFactorial(firstNum);
        double  secondFactorial = GetFactorial(secondNum);

        double division = DevideFirstBySecondFactorial(firstFactorial, secondFactorial);
        System.out.printf("%.2f", division);

    }

    private static double DevideFirstBySecondFactorial(double firstFactorial, double secondFactorial) {
        return firstFactorial / secondFactorial;
    }

    private static double GetFactorial(int firstNum) {
        double result = 1;
        if (firstNum == 0){
            result = 1;
        } else {
            for (int i = 1; i <= firstNum; i++) {
                result = result * i;
            }
        }
        return result;
    }
}

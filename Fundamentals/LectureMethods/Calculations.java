package LectureMethods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculatingMethod = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        IsMethodSumming(calculatingMethod, firstNum, secondNum);
        IsMethodMultiplying(calculatingMethod, firstNum, secondNum);
        IsMethodSubtraction(calculatingMethod, firstNum, secondNum);
        IsMethodDivision(calculatingMethod, firstNum, secondNum);
    }

    private static void IsMethodDivision(String calculatingMethod, int a, int b) {
        if (calculatingMethod.equals("divide")){
            int result = a / b;
            System.out.println(result);
        }
    }

    private static void IsMethodSubtraction(String calculatingMethod, int a, int b) {
        if (calculatingMethod.equals("subtract")){
            int result = a - b;
            System.out.println(result);
        }
    }

    private static void IsMethodMultiplying(String calculatingMethod, int a, int b) {
        if (calculatingMethod.equals("multiply")){
            int result = a * b;
            System.out.println(result);
        }
    }

    private static void IsMethodSumming(String calculatingMethod, int a , int b) {
        if (calculatingMethod.equals("add")){
            int sum = a + b;
            System.out.println(sum);
        }
    }
}

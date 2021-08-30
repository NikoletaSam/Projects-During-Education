package ConditionalStatementsAdvanced.ex;
import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double result = 0.0;

        switch (operator){
            case '+':
                result = num1 + num2;
                if(result % 2 == 0){
                    System.out.printf("%.0f + %.0f = %.0f - even", num1, num2, result);
                } else {
                    System.out.printf("%.0f + %.0f = %.0f - odd", num1, num2, result);
                }
                break;
            case '-':
                result = num1 - num2;
                if(result % 2 == 0){
                    System.out.printf("%.0f - %.0f = %.0f - even", num1, num2, result);
                } else {
                    System.out.printf("%.0f - %.0f = %.0f - odd", num1, num2, result);
                }
                break;
            case '*':
                result = num1 * num2;
                if(result % 2 == 0){
                    System.out.printf("%.0f * %.0f = %.0f - even", num1, num2, result);
                } else {
                    System.out.printf("%.0f * %.0f = %.0f - odd", num1, num2, result);
                }
                break;
            case '/':
                if(num2 == 0){
                    System.out.printf("Cannot divide %.0f by zero", num1);
                } else {
                    result = num1 / num2;
                    System.out.printf("%.0f / %.0f = %.2f", num1, num2, result);
                }
                break;
            case '%':
                if(num2 == 0){
                    System.out.printf("Cannot divide %.0f by zero", num1);
                } else {
                    result = num1 % num2;
                    System.out.printf("%.0f", num1);
                    System.out.print(" % ");
                    System.out.printf("%.0f = %.0f", num2, result);
                }
                break;
        }
    }
}

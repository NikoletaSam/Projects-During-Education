package FundamentalsEx2;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double eps = 0.000001;
        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        double diffBetweenNum1AndNum2 = Math.abs(firstNum - secondNum);
        if (diffBetweenNum1AndNum2 >= eps){
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}

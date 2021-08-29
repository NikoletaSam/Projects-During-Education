package ConditionalsFor.ex;
import java.util.Scanner;

public class OddOrEvenPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0.0;
        double evenSum = 0.0;
        double oddMin = Double.POSITIVE_INFINITY;
        double evenMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;

        for (int i = 1; i<= n; i++){
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0){
                oddSum = oddSum + num;
                if (num < oddMin){
                    oddMin = num;
                }
                if (num > oddMax){
                    oddMax = num;
                }
            } else {
                evenSum = evenSum + num;
                if (num < evenMin){
                    evenMin = num;
                }
                if (num > evenMax){
                    evenMax = num;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum == 0){
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f, %n", oddMax);
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenSum == 0){
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f %n", evenMax);
        }
    }
}

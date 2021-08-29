package ConditionalsFor.ex;
import java.util.Scanner;

public class DevideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;

        for (int i=1; i <= n; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0){
                p1++;
            }
            if (num % 3 == 0){
                p2++;
            }
            if (num % 4 == 0){
                p3++;
            }
        }

        double p1Percent = (p1 / n) * 100;
        double p2Percent = (p2 / n) * 100;
        double p3Percent = (p3 / n) * 100;

        System.out.printf("%.2f", p1Percent);
        System.out.println("%");
        System.out.printf("%.2f", p2Percent);
        System.out.println("%");
        System.out.printf("%.2f", p3Percent);
        System.out.println("%");
    }
}

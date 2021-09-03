package ConditionalsWhile.more;
import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
        }
        double average = sum / n;
        System.out.printf("%.2f", average);
    }
}

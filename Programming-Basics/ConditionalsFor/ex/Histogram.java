package ConditionalsFor.ex;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;

        for (int i = 0 ;i < n ;i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200){
                p1++;
            } else if (num < 400){
                p2++;
            } else if (num < 600){
                p3++;
            } else if (num < 800){
                p4++;
            } else{
                p5++;
            }
        }

        double p1Percent = (p1 / n) * 100;
        double p2Percent = (p2 / n) * 100;
        double p3Percent = (p3 / n) * 100;
        double p4Percent = (p4 / n) * 100;
        double p5Percent = (p5 / n) * 100;

        System.out.printf("%.2f", p1Percent);
        System.out.println("%");
        System.out.printf("%.2f", p2Percent);
        System.out.println("%");
        System.out.printf("%.2f", p3Percent);
        System.out.println("%");
        System.out.printf("%.2f", p4Percent);
        System.out.println("%");
        System.out.printf("%.2f", p5Percent);
        System.out.println("%");
    }
}

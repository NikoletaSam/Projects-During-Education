package ConditionalsFor.lab;
import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++){
            if (i % 2 == 0){
                double powers = Math.pow(2,i);
                System.out.printf("%.0f %n",powers);
            }
        }
    }
}

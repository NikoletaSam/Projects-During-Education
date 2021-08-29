package ConditionalsFor.ex;
import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int biggest = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++){
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (num > biggest){
                biggest = num;
            }
        }
        int sumWithoutBiggest = sum - biggest;
        if (biggest == sumWithoutBiggest){
            System.out.printf("Yes %nSum = %d", sumWithoutBiggest);
        } else {
            int diff = Math.abs(sumWithoutBiggest - biggest);
            System.out.printf("No %nDiff = %d", diff);
        }
    }
}

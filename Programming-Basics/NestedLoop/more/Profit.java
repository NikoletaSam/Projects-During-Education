package NestedLoop.more;
import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1LV = Integer.parseInt(scanner.nextLine());
        int num2LV = Integer.parseInt(scanner.nextLine());
        int num5LV = Integer.parseInt(scanner.nextLine());
        int neededSum = Integer.parseInt(scanner.nextLine());

        for (int one = 0; one <= num1LV; one++){
            for (int two = 0; two <= num2LV; two++){
                for (int five = 0; five <= num5LV; five++){
                    int sum = one * 1 + two * 2 + five * 5;

                    if (sum == neededSum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", one, two, five, sum);
                    }
                }
            }
        }
    }
}

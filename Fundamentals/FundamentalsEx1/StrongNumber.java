package FundamentalsEx1;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int number = num;
        int product = 1;
        int sum = 0;
        int factorial = 0;

        while (num != 0){
            int digit = num % 10;
            for (int i = digit; i >= 1; i--) {
                product = i * product;
            }

            sum += product;
            num = num / 10;
            product = 1;
        }
        if (sum == number){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

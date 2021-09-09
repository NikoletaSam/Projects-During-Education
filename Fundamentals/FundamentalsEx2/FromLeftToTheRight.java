package FundamentalsEx2;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            String leftNum = scanner.next();
            String rightNum = scanner.next();
            double num1 = Double.parseDouble(leftNum);
            double num2 = Double.parseDouble(rightNum);
            double biggerNum = Math.abs(Math.max(num1, num2));
            while (biggerNum > 0){
               sum += biggerNum % 10;
               biggerNum = biggerNum / 10;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}

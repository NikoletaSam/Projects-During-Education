package FundamentalsEx1;
import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            for (int secondNum = 1; secondNum <= i; secondNum++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

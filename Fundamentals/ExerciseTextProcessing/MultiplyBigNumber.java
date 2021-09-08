package ExerciseTextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number = new BigInteger(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        BigInteger result = number.multiply(BigInteger.valueOf(secondNumber));
        System.out.println(result);
    }
}

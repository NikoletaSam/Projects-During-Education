package ExerciseTextProcessing;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSymbol = scanner.nextLine().charAt(0);
        int secondSymbol = scanner.nextLine().charAt(0);
        String input = scanner.nextLine();

        int totalSum = 0;

        if (firstSymbol < secondSymbol){
            int temporary = secondSymbol;
            secondSymbol = firstSymbol;
            firstSymbol = temporary;
        }

        char[] array = input.toCharArray();
        for (char symbol : array){
            if ((int)symbol > secondSymbol && (int)symbol < firstSymbol){
                totalSum += (int)symbol;
            }
        }

        System.out.println(totalSum);
    }
}

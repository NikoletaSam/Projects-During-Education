package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStrings = Integer.parseInt(scanner.nextLine());
        int[] nameSums = new int[numOfStrings];
        int counter = 0;
        for (int i = 0; i < numOfStrings; i++) {
            int totalSumPerName = 0;
            String input = scanner.nextLine();

            for (int j = 0; j <= input.length() - 1; j++) {
                int symbol = input.charAt(j);
                if (symbol == 65 || symbol == 69 || symbol == 73 || symbol == 79 || symbol == 85 ||
                    symbol == 97 || symbol == 101 || symbol == 105 || symbol == 111 || symbol == 117){
                    totalSumPerName += symbol * input.length();
                } else{
                    totalSumPerName += symbol / (input.length());
                }
            }
            nameSums[counter] = totalSumPerName;
            counter++;
        }

        Arrays.sort(nameSums);
        for (int elements : nameSums){
            System.out.println(elements);
        }
    }
}

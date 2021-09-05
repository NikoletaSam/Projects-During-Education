package ExerciseArrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[numOfLines];
        int[] secondArray = new int[numOfLines];
        for (int i = 0; i <= firstArray.length - 1; i++) {
            if (i == 0){
                int firstNum = Integer.parseInt(scanner.next());
                int secondNum = Integer.parseInt(scanner.next());
                firstArray[i] = firstNum;
                secondArray[i] = secondNum;
            } else if(i % 2 == 0){
                int firstNum = Integer.parseInt(scanner.next());
                int secondNum = Integer.parseInt(scanner.next());
                firstArray[i] = firstNum;
                secondArray[i] = secondNum;
            } else {
                int firstNum = Integer.parseInt(scanner.next());
                int secondNum = Integer.parseInt(scanner.next());
                firstArray[i] = secondNum;
                secondArray[i] = firstNum;
            }
        }

        for (int first : firstArray){
            System.out.print(first + " ");
        }
        System.out.println();
        for (int second : secondArray){
            System.out.print(second + " ");
        }
    }
}

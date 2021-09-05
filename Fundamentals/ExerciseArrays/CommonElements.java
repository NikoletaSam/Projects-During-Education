package ExerciseArrays;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputFirstLine = scanner.nextLine();
        String inputSecondLine = scanner.nextLine();
        String[] firstArray = inputFirstLine.split(" ");
        String[] secondArray = inputSecondLine.split(" ");
        for (int i = 0; i <= secondArray.length - 1; i++) {
            for (int j = 0; j <= firstArray.length - 1; j++) {
                if (secondArray[i].equals(firstArray[j])){
                    System.out.print( secondArray[i]+ " ");
                }
            }
        }
    }
}

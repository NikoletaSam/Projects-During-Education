package ExerciseMethods;

import java.util.Scanner;

public class NXNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            int[] array = GetOneLineOfMatrix(number);
            for (int element : array){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int[] GetOneLineOfMatrix(int number) {
        int [] oneLine = new int[number];
        for (int i = 0; i < number; i++) {
            oneLine[i] = number;
        }
        return oneLine;
    }
}

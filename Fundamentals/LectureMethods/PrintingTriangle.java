package LectureMethods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.parseInt(scanner.nextLine());
        PrintTopOfPiramid(maxNumber);
        PrintBottomOfPiramid(maxNumber);
    }

    private static void PrintBottomOfPiramid(int maxNumber) {
        for (int i = maxNumber - 1; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void PrintTopOfPiramid(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

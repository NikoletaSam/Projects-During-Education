package ExerciseArrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] train = new int[n];
        int totalAmountOfPeople = 0;
        for (int i = 0; i <= train.length - 1; i++) {
            int numOfPeople = Integer.parseInt(scanner.nextLine());
            train[i] = numOfPeople;
            totalAmountOfPeople += numOfPeople;
        }

        for (int wagon : train){
            System.out.print(wagon + " ");
        }
        System.out.printf("%n%d", totalAmountOfPeople);
    }
}

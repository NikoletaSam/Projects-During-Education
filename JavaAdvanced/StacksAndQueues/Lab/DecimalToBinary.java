package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();

        if (number == 0){
            binaryNumber.push(0);
        } else {
            while (number != 0){
                binaryNumber.push(number % 2);
                number = number / 2;
            }
        }

        for (int current : binaryNumber){
            System.out.print(current);
        }
    }
}

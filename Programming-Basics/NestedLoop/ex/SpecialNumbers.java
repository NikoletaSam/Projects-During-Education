package NestedLoop.ex;
import com.sun.source.tree.ClassTree;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int currentNumber = i;
            int last = currentNumber % 10;
            int third = (currentNumber / 10) % 10;
            int second = (currentNumber / 100) % 10;
            int first = (currentNumber / 1000) % 10;

            if (last == 0 || third == 0 || second == 0 || first == 0){
                continue;
            }
            if (num % last == 0 && num % third == 0 && num % second == 0 && num % first == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}

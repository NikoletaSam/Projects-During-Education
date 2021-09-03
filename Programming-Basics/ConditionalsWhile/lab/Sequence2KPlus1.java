package ConditionalsWhile.lab;
import java.util.Scanner;

public class Sequence2KPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int firstNum = 1;

        while (firstNum <= num){
            System.out.println(firstNum);
            firstNum = (firstNum * 2) + 1;
        }
    }
}

package ConditionalsWhile.lab;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!text.equals("Stop")){
            int num = Integer.parseInt(text);
            if (num > max){
                max = num;
            }
            text = scanner.nextLine();
        }
        System.out.println(max);
    }
}

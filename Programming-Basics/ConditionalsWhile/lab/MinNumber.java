package ConditionalsWhile.lab;
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int min = Integer.MAX_VALUE;

        while (!text.equals("Stop")){
            int num = Integer.parseInt(text);

            if (num < min){
                min = num;
            }
            text = scanner.nextLine();
        }
        System.out.println(min);
    }
}

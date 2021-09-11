package LectureArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;
        String[] devided = input.split(" ");
        int[] numbers = Arrays.stream(devided).mapToInt(elements -> Integer.parseInt(elements)).toArray();
        for (int eachNum : numbers){
            if (eachNum % 2 == 0){
                sum += eachNum;
            }
        }
        System.out.println(sum);
    }
}

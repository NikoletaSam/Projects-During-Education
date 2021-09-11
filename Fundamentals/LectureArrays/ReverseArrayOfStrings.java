package LectureArrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String temporaryValue = "";
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        for (int i = 0; i <= (array.length -1) / 2; i++) {
            temporaryValue = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temporaryValue;
        }
        for (String element : array){
            System.out.print(element + " ");
        }
    }
}

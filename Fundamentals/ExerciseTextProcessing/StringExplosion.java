package ExerciseTextProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] texts = input.split(">");

        int power = 0;
        int leftPower = 0;

        for (int i = 0; i < texts.length; i++) {
            if (Character.isDigit(texts[i].charAt(0))){
                power = Integer.parseInt(String.valueOf(texts[i].charAt(0))) + leftPower;

                if (power < texts[i].length()){
                    texts[i] = texts[i].substring(power);
                } else {
                    leftPower = (power - texts[i].length());
                    texts[i] = "";
                }
            }

            if (i != texts.length - 1){
                System.out.print(texts[i] + ">");
            } else {
                System.out.print(texts[i]);
            }
        }
    }
}

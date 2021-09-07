package ExerciseMethods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumOfVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            boolean isTheLetterVowel = IsTheLetterVowel(letter);
            if (isTheLetterVowel){
                sumOfVowels += 1;
            }
        }
        System.out.println(sumOfVowels);
    }

    private static boolean IsTheLetterVowel(char letter) {
        boolean flag = false;
        if (letter == 'o' || letter == 'i' || letter == 'u' || letter == 'a' || letter == 'e' ||
            letter == 'O' || letter == 'I' || letter == 'U' || letter == 'A' || letter == 'E'){
            flag = true;
        }
        return flag;
    }
}

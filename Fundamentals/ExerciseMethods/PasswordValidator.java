package ExerciseMethods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean passwordLength = IsPasswordLengthCorrect(input);
        if (!passwordLength){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean passwordConsistence = DoesPasswordConsistsOfLettersAndDigits(input);
        if (!passwordConsistence){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean areDigitsTwo = DoesPasswordHaveTwoDigits(input);
        if (!areDigitsTwo){
            System.out.println("Password must have at least 2 digits");
        }

        boolean validPassword = IsPasswordValid(input);
        if (validPassword){
            System.out.println("Password is valid");
        }
    }

    private static boolean IsPasswordValid(String input) {
        boolean flag = false;
        if (DoesPasswordConsistsOfLettersAndDigits(input) && DoesPasswordHaveTwoDigits(input) &&
                IsPasswordLengthCorrect(input)){
            flag = true;
        }
        return flag;
    }

    private static boolean DoesPasswordHaveTwoDigits(String input) {
        boolean flag = false;
        int sumOfDigits = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol >= 48 && symbol <= 57){
                sumOfDigits++;
            }
        }
        if (sumOfDigits >= 2){
            flag = true;
        }
        return flag;
    }

    private static boolean DoesPasswordConsistsOfLettersAndDigits(String input) {
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if ((symbol >= 48 && symbol <= 57) || (symbol >= 65 && symbol <= 90) ||
                    (symbol >= 97 && symbol <= 122)){
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static boolean IsPasswordLengthCorrect(String input) {
        boolean flag = false;
        if (input.length() >= 6 && input.length() <= 10){
            flag = true;
        }
        return flag;
    }
}

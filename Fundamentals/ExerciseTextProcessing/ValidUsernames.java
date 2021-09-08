package ExerciseTextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        //Read input
        String input = scanner.nextLine();
        String[] array = input.split(", ");

        //Check if all the usernames are valid and print the valid usernames
        for (String username : array){
            boolean isUsernameValid = isUsernameValid(username);
            if (isUsernameValid){
                System.out.println(username);
            }
        }
    }

    private static boolean isUsernameValid(String username) {
        boolean length = false;
        boolean symbols = true;

        //Check if length is valid
        if (username.length() >= 3 && username.length() <= 16){
            length = true;
        }

        //Check if all symbols are valid
        for (char symbol : username.toCharArray()){
            if (!Character.isAlphabetic(symbol) && !Character.isDigit(symbol) && symbol != '-' && symbol != '_'){
                symbols = false;
                break;
            }
        }

        //Check if username is valid
        return length && symbols;
    }
}

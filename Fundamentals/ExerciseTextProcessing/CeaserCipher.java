package ExerciseTextProcessing;

import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read input
        String text = scanner.nextLine();

        //Get each symbol and shift it with three positions
        for (char symbol : text.toCharArray()){
            int newSymbol = symbol + 3;
            if (newSymbol > 126){
                newSymbol =32 + (newSymbol - 126);
            }

            //print the new text
            System.out.print((char) newSymbol);
        }

    }
}

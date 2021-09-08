package ExerciseTextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read the input
        String input = scanner.nextLine();

        //Get the file name -> at last position
        String[] array = input.split("\\\\");
        String[] fileData = array[array.length - 1].split("\\.");

        //Print the file name and extension
        System.out.println("File name: " + fileData[0]);
        System.out.println("File extension: " + fileData[1]);
    }
}

package ConditionalsWhile.lab;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        while (!city.equals("Stop")){
            System.out.println(city);
            city = scanner.nextLine();
        }
    }
}

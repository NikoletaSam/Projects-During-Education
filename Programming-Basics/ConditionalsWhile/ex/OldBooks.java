package ConditionalsWhile.ex;
import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String enough = scanner.nextLine();
        int numBooks = 0;

        while (!enough.equals("No More Books")){

            if (enough.equals(book)){
                break;
            }
            enough = scanner.nextLine();
            numBooks++;
        }
        if (enough.equals(book)){
            System.out.println("You checked " + numBooks + " books and found it.");
        } else {
            System.out.println("The book you search is not here!");
            System.out.println("You checked " + numBooks + " books.");
        }
    }
}

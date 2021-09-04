package Exams.EarlyExam;
import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int address1 = Integer.parseInt(scanner.nextLine());
        int address2 = Integer.parseInt(scanner.nextLine());
        int specialAddress = Integer.parseInt(scanner.nextLine());

        for (int i = address2; i >= address1; i--){
            if (i % 2 == 0 && i % 3 == 0 && i != specialAddress){
                System.out.print(i + " ");
            }
            if (i % 2 == 0 && i % 3 == 0 && i == specialAddress){
                break;
            }
        }
    }
}

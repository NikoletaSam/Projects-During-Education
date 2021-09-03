package NestedLoop.more;
import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCouple = Integer.parseInt(scanner.nextLine());
        int secondCouple = Integer.parseInt(scanner.nextLine());
        int addingToFirstCouple = Integer.parseInt(scanner.nextLine());
        int addingToSecondCouple = Integer.parseInt(scanner.nextLine());

        int endingFirstCouple = firstCouple + addingToFirstCouple;
        int endingSecondCouple = secondCouple + addingToSecondCouple;

        for (int first = firstCouple; first <= endingFirstCouple; first++){
            for (int second = secondCouple; second <= endingSecondCouple; second++){

                if (((first % 2 == 0 || first % 3 == 0 || first % 5 == 0 || first % 7 == 0) && (first != 2 || first != 3 || first != 5 || first != 7))
                || ((second % 2 == 0 || second % 3 == 0 || second % 5 == 0 || second % 7 == 0) && (second != 2 || second != 3 || second != 5 || second != 7))){
                    continue;
                } else {
                    System.out.printf("%d%d%n", first, second);
                }
            }
        }
    }
}
